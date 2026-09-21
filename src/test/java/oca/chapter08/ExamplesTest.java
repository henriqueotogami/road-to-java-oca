package oca.chapter08;

import oca.chapter08.polymorphism.example01.Phone;
import oca.chapter08.polymorphism.example01.SmartPhone;
import oca.chapter08.polymorphism.example02.Describable;
import oca.chapter08.polymorphism.example02.Farm;
import oca.chapter08.polymorphism.example02.Goat;
import oca.chapter08.polymorphism.example02.GoatShelter;
import oca.chapter08.polymorphism.example03.Logable;
import oca.chapter08.polymorphism.example03.Logger;
import oca.chapter08.polymorphism.example03.NetworkConnection;
import oca.chapter08.polymorphism.example03.SystemStatus;
import oca.chapter08.polymorphism.example04.ClassA;
import oca.chapter08.polymorphism.example04.ClassB;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Random;

/**
 * <br>Classe de teste para os exemplos do Capítulo 8 do livro OCA.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class ExamplesTest {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ExamplesTest.class);

    @Test
    @Order(1)
    public void example01PhoneTest() {
        final Phone landLinePhone = new Phone();
        landLinePhone.callNumber(5559869447L);
        Random random = new Random();
        landLinePhone.setRinging(random.nextBoolean());
        if(landLinePhone.isRinging()) {
            boolean userAcceptCall = random.nextBoolean();
            landLinePhone.setAcceptCall(userAcceptCall);
            Assertions.assertTrue(landLinePhone.isAcceptCall() == userAcceptCall);
        }
        Assertions.assertTrue(landLinePhone.isRinging() == !landLinePhone.isAcceptCall());
    }

    @Test
    @Order(2)
    public void example01SmartPhoneTest() {
        final SmartPhone smartPhone = new SmartPhone();
        smartPhone.callNumber(5559869447L);
        Random random = new Random();
        smartPhone.setRinging(random.nextBoolean());
        if (smartPhone.isRinging()) {
            boolean userAcceptCall = random.nextBoolean();
            smartPhone.setAcceptCall(userAcceptCall);
            Assertions.assertTrue(smartPhone.isAcceptCall() == userAcceptCall);
        }
        Assertions.assertTrue(smartPhone.isRinging() == !smartPhone.isAcceptCall());
        Assertions.assertInstanceOf(Phone.class, smartPhone);
        smartPhone.sendEmail("Hello, this is a test email.", "henrique.map@outlook.com");
        String retrievedEmail = smartPhone.retrieveEmail();
        Assertions.assertEquals("Hello, this is a test email.", retrievedEmail);
    }

    @Test
    @Order(3)
    public void example02DescribableTest() {
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter(4, 4, 6);
        Assertions.assertInstanceOf(Describable.class, goat);
        Assertions.assertInstanceOf(Describable.class, goatShelter);
        Assertions.assertEquals("A goat named Bob", Farm.description(goat));
        Assertions.assertEquals("A goat shelter that is 4 high, 6 long and 4 wide ", Farm.description(goatShelter));
    }

    @Test
    @Order(4)
    public void example03LoggerTest() {
        try {
            Logger logger = new Logger();
            SystemStatus systemStatus = new SystemStatus();
            NetworkConnection networkConnection = new NetworkConnection();

            Assertions.assertInstanceOf(Logable.class, systemStatus);
            Assertions.assertInstanceOf(Logable.class, networkConnection);
            Assertions.assertEquals("Status: -1", systemStatus.getLogableEvent());
            Assertions.assertEquals("Initialized", networkConnection.getLogableEvent());
            Assertions.assertEquals("SystemStatus object created " + systemStatus.getInitInfo().split(" ")[3], systemStatus.getInitInfo());
            Assertions.assertEquals("NetworkConnection object created " + networkConnection.getInitInfo().split(" ")[3], networkConnection.getInitInfo());

            logger.appendToLog(systemStatus);
            logger.appendToLog(networkConnection);
            networkConnection.connect();

            Thread.sleep(2000);
            logger.appendToLog(systemStatus);
            logger.appendToLog(networkConnection);
            logger.close();

            Thread.sleep(1000); // Aguarda um segundo para garantir que o arquivo de log seja criado
            logger.open();
            Assertions.assertNotNull(logger.getFileRead());
            Assertions.assertTrue(logger.getFileRead().readLine().contains("SystemStatus object created"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("Object log event: Status: -1"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("NetworkConnection object created"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("Object log event: Initialized"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("SystemStatus object created"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("Object log event: Status: 1"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("NetworkConnection object created"));
            Assertions.assertTrue(logger.getFileRead().readLine().contains("Object log event: Connected at"));

            logger.read();
            logger.getFileRead().close();
        } catch (Exception exception) {
            logger.info("Exception: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @Test
    @Order(5)
    public void example04CastingTest() {
        ClassB obj1 = new ClassB();
        ClassA obj2 = new ClassB();
        ClassA obj3 = new ClassA();

        Assertions.assertInstanceOf(ClassB.class, obj1);
        Assertions.assertInstanceOf(ClassA.class, obj2);
        Assertions.assertInstanceOf(ClassA.class, obj3);

        Assertions.assertEquals("ClassB", obj1.whoAmI());
        Assertions.assertEquals("ClassB", obj2.whoAmI());
        Assertions.assertEquals("ClassA", obj3.whoAmI());

        // Obj1 tem acesso a métodos de ClassB e ClassA
        Assertions.assertEquals("ClassA only method", obj1.specialClassAMethod());
        Assertions.assertEquals("ClassB only method", obj1.specialClassBMethod());

        // Obj2 só tem acesso a métodos de ClassA
        Assertions.assertEquals("ClassA only method", obj2.specialClassAMethod());

        // Mas, o obj2 é uma instância de ClassB, então podemos fazer um cast para acessar métodos de ClassB
        Assertions.assertEquals("ClassB only method", ((ClassB) obj2).specialClassBMethod());

        // Apenas o obj3 só tem acesso a métodos de ClassA e não pode ser convertido para ClassB, pois não é uma instância de ClassB
        Assertions.assertEquals("ClassA only method", obj3.specialClassAMethod());

    }

}
