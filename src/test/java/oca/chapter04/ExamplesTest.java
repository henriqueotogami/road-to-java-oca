package oca.chapter04;

import oca.chapter04.primitives.ExampleBoolean;
import oca.chapter04.primitives.ExampleByte;
import oca.chapter04.primitives.ExampleChar;
import oca.chapter04.primitives.ExampleShort;
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

    /**
     * Teste para o exemplo de uso do tipo primitivo char.
     */
    @Test
    @Order(2)
    void example02Char() {
        final ExampleChar exampleChar = new ExampleChar();
        Assertions.assertEquals('S', exampleChar.getCharCharacter());
        Assertions.assertEquals('h', exampleChar.getCharUnicode());
        Assertions.assertEquals('e', exampleChar.getCharHexadecimal());
        Assertions.assertEquals('l', exampleChar.getCharOctal());
        Assertions.assertEquals('b', exampleChar.getCharCasting1());
        Assertions.assertEquals('y', exampleChar.getCharCasting2());
        Assertions.assertEquals('\'', exampleChar.getCharSpecial());
        Assertions.assertEquals('s', exampleChar.getCharSimple());
        Assertions.assertEquals("Shelby's Mustang", exampleChar.getMessage());
    }

    /**
     * Teste para o exemplo de uso do tipo primitivo byte.
     */
    @Test
    @Order(3)
    void example03Byte() {
        final ExampleByte exampleByte = new ExampleByte();
        Assertions.assertEquals(4, exampleByte.getPassengers());
        Assertions.assertEquals(2, exampleByte.getDoors());
    }

    /**
     * Teste para o exemplo de uso do tipo primitivo short.
     */
    @Test
    @Order(4)
    void example04Short() {
        final ExampleShort exampleShort = new ExampleShort();
        Assertions.assertEquals(2350, exampleShort.getUnladenWeightInLbs());
        Assertions.assertEquals(427, exampleShort.getCapacityInCu());
    }


}