package oca.chapter04;

import oca.chapter04.primitives.*;
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

    /**
     * Teste para o exemplo de uso do tipo primitivo int, incluindo conversões implícitas e explícitas.
     */
    @Test
    @Order(5)
    void example05Int() {
        final ExampleInt exampleInt = new ExampleInt();
        Assertions.assertEquals(7800000, exampleInt.getAuctionPrice());
        Assertions.assertEquals(8, exampleInt.getCyl());
        Assertions.assertEquals(90, exampleInt.getwBase());
        Assertions.assertEquals(250, exampleInt.gethPower());
        Assertions.assertEquals(151, exampleInt.getLength());
        Assertions.assertEquals(405, exampleInt.getPowerToWeightRatio());
    }

    /**
     * Teste para o exemplo de uso do tipo primitivo long, incluindo coerção explícita e implícita.
     */
    @Test
    @Order(6)
    void example06Long() {
        final ExampleLong exampleLong = new ExampleLong();
        Assertions.assertEquals(146000000L, exampleLong.getMustangBingResults());
        Assertions.assertEquals(40500000L, exampleLong.getMustangGoogleResults());
        Assertions.assertEquals(5774L, exampleLong.getMustangAmazonBookResults());
        Assertions.assertEquals(2380L, exampleLong.getMustangAmazonManualResults());
    }

}