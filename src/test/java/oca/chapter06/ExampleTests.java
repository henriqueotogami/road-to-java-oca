package oca.chapter06;

import oca.chapter06.arrays.example01.ArrayOneDimensional;
import oca.chapter06.arrays.example01.Clock;
import oca.chapter06.arrays.example02.ArrayMultiDimensional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    /**
     * Teste para o exemplo de uso de arrays multidimensionais em Java.
     */
    @Test
    @Order(2)
    void example02ArrayMultidimensional() {
        final ArrayMultiDimensional arrayMultiDimensional = new ArrayMultiDimensional();
        final int[][][] expectedMatrix = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                },
                {
                        { 10, 11, 12 },
                        { 13, 14, 15 },
                        { 16, 17, 18 }
                },
                {
                        { 19, 20, 21 },
                        { 22, 23, 24 },
                        { 25, 26, 27 }
                }
        };
        arrayMultiDimensional.setCube1(expectedMatrix);
        Assertions.assertTrue(Arrays.deepEquals(expectedMatrix, arrayMultiDimensional.getCube1()));
        Assertions.assertEquals(7, arrayMultiDimensional.getArray3D()[0][0].length);
        Assertions.assertEquals(2, arrayMultiDimensional.getArray3D()[0][1].length);
        Assertions.assertEquals(4, arrayMultiDimensional.getArray3D()[1][0].length);
    }

    /**
     * Teste para o exemplo de uso de arrays unidimensionais e ArrayList em Java.
     */
    @Test
    @Order(3)
    void example03ArrayListAndArrayPrimitive() {
        // Esse exercício o ajudará a conhecer melhor tanto a classe ArrayList quanto os arrays padrão.

        //1. Crie um projeto Java no IDE de sua escolha.
        //2. Descubra qual foi a temperatura máxima diária dos últimos sete dias.
        //3. Crie um array unidimensional padrão e insira nele a temperatura de cada dia. Ele deve conter sete elementos quando você terminar.
        //4. Crie um ArrayList e insira nele as mesmas sete temperaturas.
        //5. Use tanto o array padrão quanto o ArrayList e encontre a temperatura média com o passar do tempo.
        //6. Exiba cada valor na saída padrão.
        //7. Certifique-se de ter calculado o mesmo valor a partir de cada tipo de array.

        final int[] temperaturesArray             = new int[7];
        final ArrayList<Integer> temperaturesList = new ArrayList<>(7);

        temperaturesArray[0] = 30;
        temperaturesArray[1] = 32;
        temperaturesArray[2] = 28;
        temperaturesArray[3] = 31;
        temperaturesArray[4] = 29;
        temperaturesArray[5] = 27;
        temperaturesArray[6] = 33;

        temperaturesList.add(30);
        temperaturesList.add(32);
        temperaturesList.add(28);
        temperaturesList.add(31);
        temperaturesList.add(29);
        temperaturesList.add(27);
        temperaturesList.add(33);

        int sumArray = 0;
        for (int temp : temperaturesArray) {
            sumArray += temp;
        }
        final double averageArray = (temperaturesArray.length > 0) ? (double) sumArray / temperaturesArray.length : 0D;

        int sumList = 0;
        for (int temp : temperaturesList) {
            sumList += temp;
        }
        final double averageList = (!temperaturesList.isEmpty()) ? (double) sumList / temperaturesList.size() : 0D;
        Assertions.assertEquals(averageArray, averageList, "A temperatura média calculada a partir do array deve ser igual à temperatura média calculada a partir do ArrayList.");
    }

}
