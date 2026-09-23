package oca.chapter08;

import oca.chapter08.polymorphism.example01.Caller;
import oca.chapter08.polymorphism.example01.Phone;
import oca.chapter08.polymorphism.example01.SmartPhone;
import oca.chapter08.polymorphism.example02.Describable;
import oca.chapter08.polymorphism.example02.Farm;
import oca.chapter08.polymorphism.example02.Goat;
import oca.chapter08.polymorphism.example02.GoatShelter;
import oca.chapter08.polymorphism.example03.*;
import oca.chapter08.polymorphism.example04.Casting;
import oca.chapter08.polymorphism.example04.ClassA;
import oca.chapter08.polymorphism.example04.ClassB;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.FileNotFoundException;
import java.io.IOException;
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
    void example01PhoneTest() {
        final Phone landLinePhone = new Phone();
        Assertions.assertInstanceOf(Phone.class, landLinePhone);
        landLinePhone.callNumber(5559869447L);
        Random random = new Random();
        landLinePhone.setRinging(random.nextBoolean());
        if(landLinePhone.isRinging()) {
            Assertions.assertTrue(landLinePhone.isRinging());
            boolean userAcceptCall = random.nextBoolean();
            landLinePhone.setAcceptCall(userAcceptCall);
            if(landLinePhone.isAcceptCall()) {
                Assertions.assertTrue(landLinePhone.isAcceptCall());
            } else {
                Assertions.assertFalse(landLinePhone.isAcceptCall());
            }
        } else {
            Assertions.assertFalse(landLinePhone.isRinging());
            Assertions.assertTrue(landLinePhone.isAcceptCall());
        }

        Caller caller = new Caller();
        Assertions.assertInstanceOf(Caller.class, caller);
    }

    @Test
    @Order(2)
    void example01SmartPhoneTest() {
        final SmartPhone smartPhone = new SmartPhone();
        smartPhone.callNumber(5559869447L);
        Random random = new Random();
        smartPhone.setRinging(random.nextBoolean());
        if(smartPhone.isRinging()) {
            Assertions.assertTrue(smartPhone.isRinging());
            boolean userAcceptCall = random.nextBoolean();
            smartPhone.setAcceptCall(userAcceptCall);
            if(smartPhone.isAcceptCall()) {
                Assertions.assertTrue(smartPhone.isAcceptCall());
            } else {
                Assertions.assertFalse(smartPhone.isAcceptCall());
            }
        } else {
            Assertions.assertFalse(smartPhone.isRinging());
            Assertions.assertTrue(smartPhone.isAcceptCall());
        }
        Assertions.assertInstanceOf(Phone.class, smartPhone);
        smartPhone.sendEmail("Hello, this is a test email.", "henrique.map@outlook.com");
        String retrievedEmail = smartPhone.retrieveEmail();
        Assertions.assertEquals("Hello, this is a test email.", retrievedEmail);
        Assertions.assertEquals("henrique.map@outlook.com", smartPhone.getEmailAddress());
        Assertions.assertEquals("Hello, this is a test email.", smartPhone.getEmailMessage());
    }

    @Test
    @Order(3)
    void example02DescribableTest() {
        Goat goat = null;
        GoatShelter goatShelter = null;
        try {
            goat = new Goat("Bob");
            goatShelter = new GoatShelter(4, 4, 6);
        } catch (Exception e) {
            logger.error("Describable - Falha na instanciação dos objetos: {}", e.getMessage());
            e.printStackTrace();
            return;
        }

        Assertions.assertInstanceOf(Describable.class, goat);
        Assertions.assertInstanceOf(Describable.class, goatShelter);
        Assertions.assertEquals("A goat named Bob", Farm.description(goat));
        Assertions.assertEquals("A goat shelter that is 4 high, 6 long and 4 wide ", Farm.description(goatShelter));
        Assertions.assertEquals(4, goatShelter.getHeight());
        Assertions.assertEquals(4, goatShelter.getWidth());
        Assertions.assertEquals(6, goatShelter.getLength());

        Farm farm = new Farm();
        Assertions.assertInstanceOf(Farm.class, farm);
    }

    @Test
    @Order(4)
    void example03LoggerTest() {

        StartLogging startLogging = null;
        Logger fileLog = null;
        SystemStatus systemStatus = null;
        NetworkConnection networkConnection = null;
        try {
            startLogging = new StartLogging();
            fileLog = startLogging.getLogger();
            systemStatus = startLogging.getSystemStatus();
            networkConnection = startLogging.getNetworkConnection();
        } catch (Exception e) {
            logger.error("Logging - Falha na instanciação dos objetos: {}", e.getMessage());
            e.printStackTrace();
            return;
        }

        Assertions.assertInstanceOf(StartLogging.class, startLogging);
        Assertions.assertInstanceOf(Logable.class, systemStatus);
        Assertions.assertInstanceOf(Logable.class, networkConnection);
        Assertions.assertEquals("Status: -1", systemStatus.getLogableEvent());
        Assertions.assertEquals("Initialized", networkConnection.getLogableEvent());
        Assertions.assertEquals("SystemStatus object created " + systemStatus.getInitInfo().split(" ")[3], systemStatus.getInitInfo());
        Assertions.assertEquals("NetworkConnection object created " + networkConnection.getInitInfo().split(" ")[3], networkConnection.getInitInfo());

        try {
            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
            networkConnection.connect();

            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
            fileLog.close();
        } catch (IOException e) {
            logger.error("Logging - Falha ao escrever no log : {} ", e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            logger.error("Logging - Falha na conexão de rede: {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            // Aguarda um segundo para garantir que o arquivo de log seja criado
            fileLog.open();
        } catch (FileNotFoundException e) {
            logger.error("Logging - Arquivo de log não encontrado: {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            Assertions.assertNotNull(fileLog.getFileRead());
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("SystemStatus object created"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("Object log event: Status: -1"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("NetworkConnection object created"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("Object log event: Initialized"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("SystemStatus object created"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("Object log event: Status: 1"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("NetworkConnection object created"));
            Assertions.assertTrue(fileLog.getFileRead().readLine().contains("Object log event: Connected at"));
        } catch (IOException e) {
            logger.error("Logging - Falha na leitura do arquivo de log: {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            fileLog.read();
            fileLog.getFileRead().close();
        } catch (IOException e) {
            logger.error("Logging - Falha ao fechar o arquivo de log: {} ", e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    @Order(5)
    void example04CastingTest() {

        ClassB obj1 = null;
        ClassA obj2 = null;
        ClassA obj3 = null;
        try {
            Casting casting = new Casting();
            obj1 = casting.getClassB();
            obj2 = casting.getClassB();
            obj3 = casting.getClassA();
        } catch (Exception e) {
            logger.error("Falha na instanciação dos objetos: {}", e.getMessage());
            e.printStackTrace();
            return;
        }

        Assertions.assertInstanceOf(ClassB.class, obj1);
        Assertions.assertInstanceOf(ClassA.class, obj2);
        Assertions.assertInstanceOf(ClassA.class, obj3);

        Assertions.assertEquals(ClassB.class.getName(), Casting.isInstanceOfWhichClass(obj1));
        Assertions.assertEquals(ClassB.class.getName(), Casting.isInstanceOfWhichClass(obj2));
        Assertions.assertEquals(ClassA.class.getName(), Casting.isInstanceOfWhichClass(obj3));

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
        ClassA finalObj = obj3;
        Assertions.assertThrowsExactly(ClassCastException.class, () -> { ((ClassB) finalObj).specialClassBMethod(); });
    }

}
