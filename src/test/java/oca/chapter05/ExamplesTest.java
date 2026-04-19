package oca.chapter05;

import oca.chapter05.methods.example01.MathTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * <br>Classe de teste para os exemplos de métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
class ExamplesTest {

    /**
     * Teste para o exemplo de uso de métodos em Java.
     */
    @Test
    @Order(1)
    void example01CreateMethod() {
        final MathTools mTools = new MathTools();
        final int x = 8;
        final int y = 13;
        final int lowestInt = mTools.findLowerValue(x,y);
        Assertions.assertEquals(8, lowestInt);
        Assertions.assertEquals(8, mTools.findLowerValue(x,y));
    }

    /**
     * Teste para o exemplo de uso de métodos sobrecarregados em Java.
     */
    @Test
    @Order(2)
    void example01OverloadMethod() {
        final MathTools mTools = new MathTools();
        final double x = 8.5;
        final double y = 13.2;
        final double lowestDouble = mTools.findLowerValue(x,y);
        Assertions.assertEquals(8.5, lowestDouble);
        Assertions.assertEquals(8.5, mTools.findLowerValue(x,y));
    }

    /**
     * Teste para o exemplo de uso de métodos sobrecarregados em Java.
     */
    @Test
    @Order(3)
    void example02OverloadMethod() {
        final oca.chapter05.methods.example02.LogManager logManager = new oca.chapter05.methods.example02.LogManager();
        logManager.logInfo("This is a log message without an error number.");
        logManager.logInfo("This is a log message with an error number.", 404);
        Assertions.assertTrue(true); // Apenas para garantir que o teste passe, já que os métodos de log não retornam valores
    }

}
