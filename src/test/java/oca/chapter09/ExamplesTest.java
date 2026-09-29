package oca.chapter09;

import oca.chapter09.exceptions.example01.CEExample;
import oca.chapter09.exceptions.example02.RecordException;
import oca.chapter09.exceptions.example03.Thrower;
import oca.chapter09.exceptions.example04.TryCatch;
import oca.chapter09.exceptions.example05.TryFinally;
import oca.chapter09.exceptions.example06.TryWithResources;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class ExamplesTest {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ExamplesTest.class.getName());

    @Test
    @Order(1)
    void testCEExample() {
        try {
            Thread thread = CEExample.generateNewThread(new CEExample());
            thread.start();

            Assertions.assertInstanceOf(Thread.class, CEExample.generateNewThread(new CEExample()));
            Assertions.assertThrows(IOException.class, CEExample::new);
        } catch (IOException | InterruptedException e) {
            logger.error("Falha na execucão da thread: {}", e.getMessage());
        }
    }

    @Test
    @Order(2)
    void testRecordException() {
        try {
            logger.info("Codigo que faz alguma coisa");
            throw new RecordException("Lancando RecordException");
        } catch (RecordException recordException) {
            Assertions.assertInstanceOf(RecordException.class, recordException);
        }
    }

    @Test
    @Order(3)
    void testThrower() {
        final Thrower thrower = new Thrower();
        Assertions.assertThrows(IOException.class, thrower::throw1);
        Assertions.assertThrows(IOException.class, thrower::throw2);
        Assertions.assertThrows(IOException.class, thrower::throw3);
        Assertions.assertThrows(IOException.class, thrower::throw4);
    }

    @Test
    @Order(4)
    void testTryCatch() {
        final TryCatch tryCatch = new TryCatch();
        Assertions.assertThrows(ArithmeticException.class, tryCatch::one);
        Assertions.assertThrows(NumberFormatException.class, tryCatch::multi);
    }

    @Test
    @Order(5)
    void testTryFinally() {
        final TryFinally tryFinally = new TryFinally();
        Assertions.assertEquals("Jab and Roundhouse ", tryFinally.one());
        Assertions.assertNotNull(tryFinally.two());
        Assertions.assertNotNull(tryFinally.three());
    }

    @Test
    @Order(6)
    void testTryWithResources(){
        final TryWithResources tryWithResources = new TryWithResources();
        Assertions.assertTrue(tryWithResources.tryNoResources());
        Assertions.assertTrue(tryWithResources.tryWithResources());
    }
}
