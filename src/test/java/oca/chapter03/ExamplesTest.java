package oca.chapter03;

import oca.chapter03.operators.example01.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * <br>Classe de teste para os exemplos de operadores em Java.
 * <br>Esta classe é importante para validar o comportamento dos operadores demonstrados na classe {@link Operators}.
 *
 * @see oca.chapter03.operators.example01.Operators
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
class ExamplesTest {

    /**
     * <br>Teste para validar os resultados dos operadores de atribuição, aritméticos e relacionais.
     * <br>Este teste verifica se os métodos da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(1)
    void example01Test() {
        Operators operators = new Operators();
        final int[] attribution = operators.getAttribution();
        final byte[] allAttributionsComposite = operators.getAllAttributionsComposite((byte) 10);
        final byte[] allArithmeticOperators = operators.getAllArithmeticOperators((byte) 10);
        final boolean[] allRelationalOperators = operators.getAllRelationalOperators((byte) 10);
        final boolean[] allRelationalOperatorsWithChar = operators.getAllRelationalOperatorsWithChar();
        final boolean[] allRelationalOperatorsWithObjects = operators.getAllRelationalOperatorsWithObjects();

        Assertions.assertArrayEquals(new int[]{10, 20, 30}, attribution);
        Assertions.assertArrayEquals(new byte[]{18, 12, 45, 5, 0, 3, 12, 15, 120, 1, 1}, allAttributionsComposite);
        Assertions.assertArrayEquals(new byte[]{18, 12, 45, 5, 0}, allArithmeticOperators);
        Assertions.assertArrayEquals(new boolean[]{true, false, true, false, false, true}, allRelationalOperators);
        Assertions.assertArrayEquals(new boolean[]{true, true, true, true, true, true}, allRelationalOperatorsWithChar);
        Assertions.assertArrayEquals(new boolean[]{true, true, true, true}, allRelationalOperatorsWithObjects);
    }

    /**
     * <br>Teste para validar os resultados dos operadores de atribuição.
     * <br>Este teste verifica se os métodos de atribuição da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(2)
    void Example01AttributionsTest() {
        final Operators operators = new Operators();
        Assertions.assertEquals(13, operators.getAttributionSum((byte) 10));
        Assertions.assertEquals(12, operators.getAttributionSubtraction((byte) 15));
        Assertions.assertEquals(60, operators.getAttributionMultiplication((byte) 20));
        Assertions.assertEquals(8, operators.getAttributionDivision((byte) 25));
        Assertions.assertEquals(0, operators.getAttributionModulus((byte) 30));
        Assertions.assertEquals(3, operators.getAttributionAND((byte) 35));
        Assertions.assertEquals(43, operators.getAttributionXOR((byte) 40));
        Assertions.assertEquals(47, operators.getAttributionOR((byte) 45));
        Assertions.assertEquals(-112, operators.getAttributionLeftShift((byte) 50));
        Assertions.assertEquals(6, operators.getAttributionRightShift((byte) 55));
        Assertions.assertEquals(7, operators.getAttributionUnsignedRightShift((byte) 60));
    }

    /**
     * <br>Teste para validar os resultados dos operadores aritméticos.
     * <br>Este teste verifica se os métodos de operadores aritméticos da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(3)
    void Example01ArithmeticOperatorsTest() {
        final Operators operators = new Operators();
        Assertions.assertEquals(13, operators.getArithmeticOperatorSum((byte) 10));
        Assertions.assertEquals(12, operators.getArithmeticOperatorSubtraction((byte) 15));
        Assertions.assertEquals(60, operators.getArithmeticOperatorMultiplication((byte) 20));
        Assertions.assertEquals(8, operators.getArithmeticOperatorDivision((byte) 25));
        Assertions.assertEquals(0, operators.getArithmeticOperatorModulus((byte) 30));
    }

    /**
     * <br>Teste para validar os resultados dos operadores relacionais.
     * <br>Este teste verifica se os métodos de operadores relacionais da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(4)
    void Example01RelationalOperatorsTest() {
        final Operators operators = new Operators();
        Assertions.assertTrue(operators.getRelationalOperatorGreaterThan((byte) 10));
        Assertions.assertFalse(operators.getRelationalOperatorLessThan((byte) 15));
        Assertions.assertTrue(operators.getRelationalOperatorGreaterThanOrEqual((byte) 20));
        Assertions.assertFalse(operators.getRelationalOperatorLessThanOrEqual((byte) 25));
        Assertions.assertFalse(operators.getRelationalOperatorEqual((byte) 30));
        Assertions.assertTrue(operators.getRelationalOperatorNotEqual((byte) 35));

        Assertions.assertFalse(operators.getRelationalOperatorObjects(new Operators(), new Operators()));
        Assertions.assertFalse(operators.getRelationalOperatorObjectsCompareTo("Hello", "wrong"));
        Assertions.assertFalse(operators.getRelationalOperatorObjectsEquals("Hello", "HELLO"));

        Assertions.assertTrue(operators.getRelationalOperatorObjectsCompareTo("Hello", "Hello"));
        Assertions.assertTrue(operators.getRelationalOperatorObjectsEquals("Hello", "Hello"));
        Assertions.assertTrue(operators.getRelationalOperatorSameCopyObject("Hello"));
    }

    /**
     * <br>Teste para validar os resultados dos operadores lógicos.
     * <br>Este teste verifica se os métodos de operadores lógicos da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(5)
    void example01LogicalOperatorsTest() {
        final Operators operators = new Operators();
        Assertions.assertTrue(operators.getLogicalOperatorAND((byte) 10, (byte) 10));
        Assertions.assertTrue(operators.getLogicalOperatorOR((byte) 10, (byte) 15));
        Assertions.assertTrue(operators.getLogicalOperatorNOT((byte) -10, (byte) -15));
    }

    /**
     * <br>Teste para validar os resultados dos operadores de string.
     * <br>Este teste verifica se os métodos de operadores de string da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(6)
    void example02StringsTest() {
        String s1 = new String("String one");
        String s2 = "String two";
        String s3 = "String " + "three";
        Assertions.assertEquals("String one", s1);
        Assertions.assertEquals("String two", s2);
        Assertions.assertEquals("String three", s3);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string.
     * <br>Este teste verifica se os métodos de string da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(7)
    void example03StringCharAtTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Retorna o caractere de 'espaço em branco' da posição 0 */
        final char c1 = pirateMessage.charAt(0);
        Assertions.assertEquals(' ', c1);

        /* Retorna o caractere 'B' da posição 2 */
        final char c2 = pirateMessage.charAt(2);
        Assertions.assertEquals('B', c2);

        /* Retorna o caractere '!' da posição 23 */
        final char c3 = pirateMessage.charAt(23);
        Assertions.assertEquals('!', c3);

        /* Retorna o caractere de 'espaço em branco' da posição 24 */
        final char c4 = pirateMessage.charAt(24);
        Assertions.assertEquals(' ', c4);

        /* Lança uma exceção StringIndexOutOfBoundsException*/
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> pirateMessage.charAt(25));
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string indexOf.
     * <br>Este teste verifica se os métodos de string indexOf da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(8)
    void example04StringIndexOfTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        // Retorna o inteiro 3 já que ele representa o primeiro 'u' da string.
        final int i1 = pirateMessage.indexOf('u'); // 3
        Assertions.assertEquals(3, i1);

        // Retorna o inteiro 14 já que ele representa o primeiro 'u' da string após a posição 9.
        final int i2 = pirateMessage.indexOf('u', 9); // 14
        Assertions.assertEquals(14, i2);

        // Retorna o inteiro 13 já que ele começa na posição 13 da string.
        final int i3 = pirateMessage.indexOf("sure"); // 13
        Assertions.assertEquals(13, i3);

        // Retorna o inteiro −1 já que não há uma string Treasure na posição 14 ou depois dela
        final int i4 = pirateMessage.indexOf("Treasure", 14); // -1!
        Assertions.assertEquals(-1, i4);

        // Retorna o inteiro −1 já que não há um caractere u na posição 18 ou depois dela
        final int i5 = pirateMessage.indexOf("u", 18); // -1!
        Assertions.assertEquals(-1, i5);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string length.
     * <br>Este teste verifica se os métodos de string length da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(9)
    void example05StringLengthTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";
        final int length = pirateMessage.length();
        Assertions.assertEquals(25, length);

        /* Retorna o tamanho da string que é 25 */
        final int i = pirateMessage.length(); // 25
        Assertions.assertEquals(25, i);

        // Uso do metodo length de String
        final String string = "box";
        final int value1 = string.length(); // 3
        Assertions.assertEquals(3, value1);

        // Uso do atributo length dos arrays
        final String[] stringArray = new String[3];
        final int value2 = stringArray.length; // 3
        Assertions.assertEquals(3, value2);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string concat.
     * <br>Este teste verifica se os métodos de string concat da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(10)
    void example06StringConcat() {
        /* Retorna a string concatenada
         *" Buried Treasure Chest! Weigh anchor!"
         */
        final String pirateMessage = " Buried Treasure Chest! ";
        final String c = pirateMessage.concat ("Weigh anchor!");
        Assertions.assertEquals(" Buried Treasure Chest! Weigh anchor!", c);
    }


    /**
     * <br>Teste para validar os resultados dos métodos de string replace.
     * <br>Este teste verifica se os métodos de string replace da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(11)
    void example07StringReplaceTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Retorna uma string com todos os caracteres 'B' substituídos por 'J'. */
        final String s1 = pirateMessage.replace('B', 'J'); // Juried Treasure Chest!
        Assertions.assertEquals("  Juried Treasure Chest! ", s1);

        /* Retorna uma string com todos os caracteres de espaço em branco ' ' substituídos por 'X'.
         */
        final String s2 = pirateMessage.replace(' ', 'X'); // XXBuriedXTreasureXChest!X
        Assertions.assertEquals("XXBuriedXTreasureXChest!X", s2);

        /* Retorna uma string com todas as strings 'Chest' substituídas por 'Coins'
         */
        final String s3 = pirateMessage.replace("Chest", "Coins"); // Buried Treasure Coins!
        Assertions.assertEquals("  Buried Treasure Coins! ", s3);
    }

}
