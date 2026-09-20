package oca.chapter08;

import oca.chapter08.polymorphism.example01.Phone;
import oca.chapter08.polymorphism.example01.SmartPhone;
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

        smartPhone.sendEmail("Hello, this is a test email.", "henrique.map@outlook.com");
        String retrievedEmail = smartPhone.retrieveEmail();
        Assertions.assertEquals("Hello, this is a test email.", retrievedEmail);
    }
}
