package oca.chapter04;

import oca.chapter04.primitives.ExampleBoolean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * <br>Classe de teste para os exemplos de tipos primitivos e objetos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
class ExamplesTest {

    /**
     * Teste para o exemplo de uso do tipo primitivo boolean.
     */
    @Test
    @Order(1)
    void example01Boolean() {
        final ExampleBoolean exampleBoolean = new ExampleBoolean();
        Assertions.assertFalse(exampleBoolean.getTurboCharger());

        exampleBoolean.activateTurboCharger();
        Assertions.assertTrue(exampleBoolean.getTurboCharger());
    }
}