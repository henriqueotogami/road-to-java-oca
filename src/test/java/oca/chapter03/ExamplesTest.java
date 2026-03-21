package oca.chapter03;

import oca.chapter03.operators.example01.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class ExamplesTest {

    @Test
    @Order(1)
    void example01Test() {
        Operators operators = new Operators();
        final int[] attribution                           = operators.getAttribution();
        final byte[] allAttributionsComposite             = operators.getAllAttributionsComposite((byte) 10);
        final byte[] allArithmeticOperators               = operators.getAllArithmeticOperators((byte) 10);
        final boolean[] allRelationalOperators            = operators.getAllRelationalOperators((byte) 10);
        final boolean[] allRelationalOperatorsWithChar    = operators.getAllRelationalOperatorsWithChar();
        final boolean[] allRelationalOperatorsWithObjects = operators.getAllRelationalOperatorsWithObjects();

        Assertions.assertArrayEquals(new int[] { 10, 20, 30 }, attribution);
        Assertions.assertArrayEquals(new byte[] { 18, 17, 75, 10, 2, 0, 46, 51, -72, 7, 8 }, allAttributionsComposite);
        Assertions.assertArrayEquals(new byte[] { 18, 17, 75, 10, 2 }, allArithmeticOperators);
        Assertions.assertArrayEquals(new boolean[] { true, false, true, false, false, true }, allRelationalOperators);
        Assertions.assertArrayEquals(new boolean[] { true, true, true, true, true, true }, allRelationalOperatorsWithChar);
        Assertions.assertArrayEquals(new boolean[] { false, true, true, true }, allRelationalOperatorsWithObjects);
    }

    @Test
    @Order(2)
    void Example01AttributionsTest(){
        final Operators operators = new Operators();
        Assertions.assertEquals(13,operators.getAttributionSum((byte) 10));
        Assertions.assertEquals(12,operators.getAttributionSubtraction((byte) 15));
        Assertions.assertEquals(60,operators.getAttributionMultiplication((byte) 20));
        Assertions.assertEquals(8,operators.getAttributionDivision((byte) 25));
        Assertions.assertEquals(0,operators.getAttributionModulus((byte) 30));
        Assertions.assertEquals(3,operators.getAttributionAND((byte) 35));
        Assertions.assertEquals(43,operators.getAttributionXOR((byte) 40));
        Assertions.assertEquals(47,operators.getAttributionOR((byte) 45));
        Assertions.assertEquals(-112,operators.getAttributionLeftShift((byte) 50));
        Assertions.assertEquals(6,operators.getAttributionRightShift((byte) 55));
        Assertions.assertEquals(7,operators.getAttributionUnsignedRightShift((byte) 60));
    }

    @Test
    @Order(3)
    void Example01ArithmeticOperatorsTest(){
        final Operators operators = new Operators();
        Assertions.assertEquals(13,operators.getArithmeticOperatorSum((byte) 10));
        Assertions.assertEquals(12,operators.getArithmeticOperatorSubtraction((byte) 15));
        Assertions.assertEquals(60,operators.getArithmeticOperatorMultiplication((byte) 20));
        Assertions.assertEquals(8,operators.getArithmeticOperatorDivision((byte) 25));
        Assertions.assertEquals(0,operators.getArithmeticOperatorModulus((byte) 30));
    }

    @Test
    @Order(4)
    void Example01RelationalOperatorsTest(){
        final Operators operators = new Operators();
        Assertions.assertTrue(operators.getRelationalOperatorGreaterThan((byte) 10));
        Assertions.assertFalse(operators.getRelationalOperatorLessThan((byte) 15));
        Assertions.assertTrue(operators.getRelationalOperatorGreaterThanOrEqual((byte) 20));
        Assertions.assertFalse(operators.getRelationalOperatorLessThanOrEqual((byte) 25));
        Assertions.assertFalse(operators.getRelationalOperatorEqual((byte) 30));
        Assertions.assertTrue(operators.getRelationalOperatorNotEqual((byte) 35));

        Assertions.assertFalse(operators.getRelationalOperatorObjects());
        Assertions.assertTrue(operators.getRelationalOperatorObjectsCompareTo());
        Assertions.assertTrue(operators.getRelationalOperatorObjectsEquals());
        Assertions.assertTrue(operators.getRelationalOperatorSameCopyObject());
    }
}
