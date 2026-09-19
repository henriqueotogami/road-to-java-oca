package oca.chapter08.polymorphism.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de classe Caller para ilustrar polimorfismo em Java.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class Caller {

    public static final Logger logger = LogManager.getLogger(Caller.class.getName());

    public Caller() {
        Phone landLinePhone   = new Phone();
        SmartPhone smartPhone = new SmartPhone();
        logger.info("Instancia de Phone e sendo utilizada como Phone");
        testPhone(landLinePhone);
        logger.info("Instancia de SmartPhone e sendo utilizada como Phone");
        testPhone(smartPhone);
        logger.info("Instancia de SmartPhone e sendo utilizada como SmartPhone");
        testSmartPhone(smartPhone);
    }

    public static void main(String[] args) {
        new Caller();
    }

    private void testPhone(final Phone phone) {
        phone.callNumber(5559869447L);
        phone.isRinging();
    }

    private void testSmartPhone(final SmartPhone phone) {
        phone.sendEmail("Hi","edward@ocajexam.com");
        phone.retrieveEmail();
    }
}
