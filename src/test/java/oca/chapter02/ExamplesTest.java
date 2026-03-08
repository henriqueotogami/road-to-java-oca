package oca.chapter02;

import oca.chapter02.primitives.example01.Attribution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ExamplesTest {

    @Test
    @Order(1)
    void example01Test() {
        Attribution attribution = new Attribution();

        attribution.setDefaultDegrees();
        Assertions.assertEquals(100, attribution.getDegrees());

        attribution.sumFishes(100, 50);
        Assertions.assertEquals(150, attribution.getTotalFish());

        attribution.decrementFishes(150);
        Assertions.assertEquals(0, attribution.getTotalFish());

        attribution.incrementFishes(30);
        Assertions.assertEquals(30, attribution.getTotalFish());

        attribution.afterIncrementDegrees();
        Assertions.assertEquals(Arrays.toString(new int[] { 6, 5, 4 }), Arrays.toString(attribution.getRegistersDegrees()));

        attribution.afterDecrementDegrees();
        Assertions.assertEquals(Arrays.toString(new int[] { 6, 7, 8 }), Arrays.toString(attribution.getRegistersDegrees()));

        attribution.beforeIncrementDegrees();
        Assertions.assertEquals(Arrays.toString(new int[] { 2, 3, 4 }), Arrays.toString(attribution.getRegistersDegrees()));

        attribution.beforeDecrementDegrees();
        Assertions.assertEquals(Arrays.toString(new int[] { 9, 10, 11 }), Arrays.toString(attribution.getRegistersDegrees()));
    }
}
