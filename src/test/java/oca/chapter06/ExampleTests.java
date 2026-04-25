package oca.chapter06;

import oca.chapter06.arrays.example01.ArrayOneDimensional;
import oca.chapter06.arrays.example01.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <br>Classe de teste para os exemplos de arrays em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-25
 * @version 0.7
 */
class ExampleTests {

    /**
     * Teste para o exemplo de uso de arrays unidimensionais em Java.
     */
    @Test
    @Order(1)
    void example01ArrayOneDimensional() {
        final ArrayOneDimensional arrayOneDimensional = new ArrayOneDimensional();
        final int[] expectedAlarms1         = { 1, 2, 3, 4, 5 };
        final int[] expectedAlarms2         = { 730, 900 };
        final String[] expectedClockTypes   = {"Wrist Watch", "Desk Clock", "Wall Clock"};
        final Clock[] expectedClocks        = {new Clock(11, 0, 0), new Clock(22, 50, 0)};

        arrayOneDimensional.setAlarms1(expectedAlarms1);
        Assertions.assertArrayEquals(expectedAlarms1, arrayOneDimensional.getAlarms1());
        Assertions.assertArrayEquals(expectedAlarms2, arrayOneDimensional.getAlarms2());
        Assertions.assertArrayEquals(expectedClockTypes, arrayOneDimensional.getClockTypes());
        Assertions.assertArrayEquals(new String[4], arrayOneDimensional.getClockTypes1());
        Assertions.assertArrayEquals(new String[3], arrayOneDimensional.getClockTypes2());

        int expectedHours = 0;
        int actualHours = 0;
        for (int index = 0; index < arrayOneDimensional.getClocks().length; index++) {
            expectedHours = expectedClocks[index].getHours();
            actualHours   = arrayOneDimensional.getClocks()[index].getHours();
            Assertions.assertEquals(expectedHours, actualHours);
        }

        arrayOneDimensional.printClockTypes();
        arrayOneDimensional.printClockTypesTarget(expectedClockTypes[0]);
        arrayOneDimensional.printClockTarget(expectedClocks[0].toString());
    }

}
