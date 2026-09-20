package oca.chapter08;

import oca.chapter08.polymorphism.example01.Phone;
import oca.chapter08.polymorphism.example01.SmartPhone;
import oca.chapter08.polymorphism.example02.Describable;
import oca.chapter08.polymorphism.example02.Farm;
import oca.chapter08.polymorphism.example02.Goat;
import oca.chapter08.polymorphism.example02.GoatShelter;
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
}
