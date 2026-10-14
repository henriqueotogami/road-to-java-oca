package oca.chapter09;

import oca.chapter09.exceptions.example01.CEExample;
import oca.chapter09.exceptions.example02.RecordException;
import oca.chapter09.exceptions.example03.Thrower;
import oca.chapter09.exceptions.example04.TryCatch;
import oca.chapter09.exceptions.example05.TryFinally;
import oca.chapter09.exceptions.example06.TryWithResources;
import oca.chapter09.exceptions.example07.MultiCatch;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.awt.*;
import java.io.IOException;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class Chapter09ExamplesTest {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Chapter09ExamplesTest.class.getName());

    @Test
    @Order(1)
    void exampleCETest() {
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
    void recordExceptionTest() {
        try {
            logger.info("Codigo que faz alguma coisa");
            throw new RecordException("Lancando RecordException");
        } catch (RecordException recordException) {
            Assertions.assertInstanceOf(RecordException.class, recordException);
        }
    }

    @Test
    @Order(3)
    void throwerTest() {
        final Thrower thrower = new Thrower();
        Assertions.assertThrows(IOException.class, thrower::throw1);
        Assertions.assertThrows(IOException.class, thrower::throw2);
        Assertions.assertThrows(IOException.class, thrower::throw3);
        Assertions.assertThrows(IOException.class, thrower::throw4);
    }

    @Test
    @Order(4)
    void tryCatchTest() {
        final TryCatch tryCatch = new TryCatch();
        Assertions.assertThrows(ArithmeticException.class, tryCatch::one);
        Assertions.assertThrows(NumberFormatException.class, () -> { tryCatch.multi(1); });
        Assertions.assertThrows(IllegalArgumentException.class, () -> { tryCatch.multi(2); });
    }

    @Test
    @Order(5)
    void tryFinallyTest() {
        final TryFinally tryFinally = new TryFinally();
        Assertions.assertEquals("Jab and Roundhouse ", tryFinally.one());
        Assertions.assertThrows(IOException.class, () -> { tryFinally.two(true); });
        Assertions.assertThrows(NumberFormatException.class, () -> { tryFinally.three(true); });
        try {
            Assertions.assertEquals("Jab and Roundhouse ", tryFinally.two(false));
        } catch (IOException e) {
            Assertions.fail("Falha no teste do tryFinally");
        }
        Assertions.assertEquals("Bread and ", tryFinally.three(false));
    }

    @Test
    @Order(6)
    void tryWithResourcesTest(){
        final TryWithResources tryWithResources = new TryWithResources();
        Assertions.assertThrows(IOException.class, () -> { tryWithResources.tryNoResources(true); });
        try {
            Assertions.assertTrue(tryWithResources.tryNoResources(false));
        } catch (IOException e) {
            Assertions.fail();
        }
        Assertions.assertThrows(IOException.class, () -> {
            Assertions.assertTrue(tryWithResources.tryWithResources(true));
        });

        try {
            Assertions.assertTrue(tryWithResources.tryWithResources(false));
        } catch (IOException e) {
            Assertions.fail();
        }

    }

    @Test
    @Order(7)
    void multiCatchTest() {
        final MultiCatch multiCatch = new MultiCatch();
        Assertions.assertThrows(IOException.class, () -> {
            multiCatch.one(1);
        });
        Assertions.assertThrows(FontFormatException.class, () -> {
            multiCatch.two(1);
        });
    }
}
