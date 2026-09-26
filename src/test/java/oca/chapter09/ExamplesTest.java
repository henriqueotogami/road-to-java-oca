package oca.chapter09;

import oca.chapter09.exceptions.example01.CEExample;
import oca.chapter09.exceptions.example02.RecordException;
import oca.chapter09.exceptions.example03.Thrower;
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
    public void testCEExample() {
        try {
            Thread thread = CEExample.generateNewThread(new CEExample());
            thread.start();

            Assertions.assertInstanceOf(Thread.class, CEExample.generateNewThread(new CEExample()));
            Assertions.assertThrows(IOException.class, () -> { new CEExample(); });
        } catch (IOException e) {
            logger.error("Falha na execucão da thread: " + e.getMessage());
        }
    }

    @Test
    @Order(2)
    public void testRecordException() {
        try {
            logger.info("Codigo que faz alguma coisa");
            throw new RecordException("Lancando RecordException");
        } catch (RecordException recordException) {
            Assertions.assertInstanceOf(RecordException.class, recordException);
        }
    }

    @Test
    @Order(3)
    public void testThrower() {
        final Thrower thrower = new Thrower();
        Assertions.assertThrows(IOException.class, () -> { thrower.throw1(); });
        Assertions.assertThrows(IOException.class, () -> { thrower.throw2(); });
        Assertions.assertThrows(IOException.class, () -> { thrower.throw3(); });
        Assertions.assertThrows(IOException.class, () -> { thrower.throw4(); });
    }
}
