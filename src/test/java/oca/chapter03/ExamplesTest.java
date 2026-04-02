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

    /**
     * <br>Teste para validar os resultados dos métodos de string startsWith.
     * <br>Este teste verifica se os métodos de string startsWith da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(12)
    void example08StringStartsWithTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        // Retorna true quando a string referenciada começa com a string comparada.
        final boolean b1 = pirateMessage.startsWith("  Buried Treasure"); // true
        Assertions.assertTrue(b1);

        // Retorna false quando a string referenciada não começa com a string comparada.
        final boolean b2 = pirateMessage.startsWith(" Discovered"); // false
        Assertions.assertFalse(b2);

        // Retorna false quando a string referenciada não começa com a string comparada na posição 8.
        final boolean b3 = pirateMessage.startsWith("Treasure", 8); // false
        Assertions.assertFalse(b3);

        // Retorna true quando a string referenciada começa com a string comparada na posição 9.
        final boolean b4 = pirateMessage.startsWith("Treasure", 9); // true
        Assertions.assertTrue(b4);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string endsWith.
     * <br>Este teste verifica se os métodos de string endsWith da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(13)
    void example09StringEndsWithTest() {
        final String pirateMessage = " Buried Treasure Chest! ";

        // Retorna true quando a string referenciada termina com a string comparada.
        final boolean e1 = pirateMessage.endsWith("Treasure Chest! "); // true
        Assertions.assertTrue(e1);

        // Retorna false quando a string referenciada não termina com a string comparada.
        final boolean e2 = pirateMessage.endsWith("Treasure Rest "); // false
        Assertions.assertFalse(e2);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string substring.
     * <br>Este teste verifica se os métodos de string substring da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(14)
    void example10StringSubstringTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Retorna a string inteira começando no índice 9. */
        final String ss1 = pirateMessage.substring(9); // Treasure Chest!
        Assertions.assertEquals("Treasure Chest! ", ss1);

        /* Retorna a string no índice 9. */
        final String ss2 = pirateMessage.substring(9, 10); // T
        Assertions.assertEquals("T", ss2);

        /* Retorna a string no índice 9 e terminando no índice 23. */
        final String ss3 = pirateMessage.substring(9, 23); // Treasure Chest
        Assertions.assertEquals("Treasure Chest", ss3);

        /* Produz erro de tempo de execução. */
        // final String ss4 = pirateMessage.substring(9, 8); // faixa inválida
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> pirateMessage.substring(9, 8));

        /* Retorna um espaço em branco */
        final String ss5 = pirateMessage.substring(9, 9); // Espaço em branco
        Assertions.assertEquals("", ss5);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string trim.
     * <br>Este teste verifica se os métodos de string trim da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(15)
    void example11StringTrimTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* ""Buried Treasure Chest!" sem espaços em branco iniciais ou finais */
        String t = pirateMessage.trim();
        Assertions.assertEquals("Buried Treasure Chest!", t);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string toLowerCase.
     * <br>Este teste verifica se os métodos de string toLowerCase da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(16)
    void example12StringToLowerCaseTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Retorna todos os caracteres em letras minúsculas " buried treasure chest! " */
        final String l1 = pirateMessage.toLowerCase();
        Assertions.assertEquals("  buried treasure chest! ", l1);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string toUpperCase.
     * <br>Este teste verifica se os métodos de string toUpperCase da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(17)
    void example13StringToUpperCaseTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Retorna todos os caracteres em letras maiúsculas " BURIED TREASURE CHEST! " */
        final String u1 = pirateMessage.toUpperCase();
        Assertions.assertEquals("  BURIED TREASURE CHEST! ", u1);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string equalsIgnoreCase.
     * <br>Este teste verifica se os métodos de string equalsIgnoreCase da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(18)
    void example14StringEqualsIgnoreCaseTest() {
        final String pirateMessage = "  Buried Treasure Chest! ";

        /* Compara " Buried Treasure Chest! " com " Buried TREASURE Chest! */
        final Boolean b1 = pirateMessage.equalsIgnoreCase("  Buried TREASURE Chest! "); // true
        Assertions.assertTrue(b1);

        /* Compara " Buried Treasure Chest! " com " Buried XXXXXXX Chest! "*/
        final Boolean b2 = pirateMessage.equalsIgnoreCase("  Buried XXXXXXX Chest! "); // false
        Assertions.assertFalse(b2);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string trim, replace e substring.
     * <br>Este teste verifica se os métodos de string trim, replace e substring da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(19)
    void example15StringExamTest() {

        // Três alterações precisam ser feitas para ajustarmos a string como desejado:
        // 1. Remover os espaços em branco do início e do final.
        // 2. Substituir a substring First Mate por Quartermaster.
        // 3. Remover and a pistol!.
        // 4. Adicionar um ponto no fim da frase.

        String msg = " Maroon the First Mate with a flagon of water and a pistol! ";

        msg = msg.trim(); // Remove o espaço em branco
        Assertions.assertEquals("Maroon the First Mate with a flagon of water and a pistol!", msg);

        msg = msg.replace("First Mate", "Quartermaster");// Substitui o texto
        Assertions.assertEquals("Maroon the Quartermaster with a flagon of water and a pistol!", msg);

        msg = msg.substring(0,47); // Retorna os primeiros 48 caracteres.
        Assertions.assertEquals("Maroon the Quartermaster with a flagon of water", msg);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string trim, replace e substring.
     * <br>Este teste verifica se os métodos de string trim, replace e substring da classe {@link Operators} estão retornando os valores esperados.
     */
    @Test
    @Order(20)
    void example16StringExamTest() {

        // Três alterações precisam ser feitas para ajustarmos a string como desejado:
        // 1. Remover os espaços em branco do início e do final.
        // 2. Substituir a substring First Mate por Quartermaster.
        // 3. Remover and a pistol!.
        // 4. Adicionar um ponto no fim da frase.

        String msg = " Maroon the First Mate with a flagon of water and a pistol! ";
        msg = msg.trim().replace("First Mate", "Quartermaster").substring(0,47) + ".";
        Assertions.assertEquals("Maroon the Quartermaster with a flagon of water.", msg);
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string StringBuilder append.
     * <br>Este teste verifica se os métodos de string StringBuilder append estão retornando os valores esperados.
     */
    @Test
    @Order(21)
    void example17StringBuilderAppendTest() {
        final StringBuilder mateyMessage = new StringBuilder ("Shiver Me Timbers!");
        Assertions.assertEquals("Shiver Me Timbers!", mateyMessage.toString());

        /* Exibe "Shivers! Bad Storm! */
        Assertions.assertEquals("Shiver Me Timbers! Bad Storm!", mateyMessage.append(" Bad Storm!").toString());

        final StringBuilder examples = new StringBuilder ("Examples:");
        Assertions.assertEquals("Examples:", examples.toString());

        examples.append(" ").append("1");                                                           // String
        Assertions.assertEquals("Examples: 1", examples.toString());

        examples.append(" ").append(new StringBuffer("2"));                                         // StringBuffer
        Assertions.assertEquals("Examples: 1 2", examples.toString());

        examples.append(" ").append('\u0031');                                                      // char
        Assertions.assertEquals("Examples: 1 2 1", examples.toString());

        examples.append(" ").append((int)2);                                                        // int
        Assertions.assertEquals("Examples: 1 2 1 2", examples.toString());

        examples.append(" ").append(1L);                                                            // long
        Assertions.assertEquals("Examples: 1 2 1 2 1", examples.toString());

        examples.append(" ").append(2F);                                                            // float
        Assertions.assertEquals("Examples: 1 2 1 2 1 2.0", examples.toString());

        examples.append(" ").append(1D);                                                            // double
        Assertions.assertEquals("Examples: 1 2 1 2 1 2.0 1.0", examples.toString());

        examples.append(" ").append(true);                                                          // true
        Assertions.assertEquals("Examples: 1 2 1 2 1 2.0 1.0 true", examples.toString());
        /* Exibe "Examples: 1 2 1 2 1 2.0 1.0 true" */
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string StringBuilder insert.
     * <br>Este teste verifica se os métodos de string StringBuilder insert estão retornando os valores esperados.
     */
    @Test
    @Order(22)
    void example18StringBuilderInsertTest() {
        final StringBuilder mateyMessage = new StringBuilder ("Shiver Me Timbers!");
        Assertions.assertEquals("Shiver Me Timbers!", mateyMessage.toString());

        /* Exibe "Shivers Me Timbers! Bad Storm! */
        Assertions.assertEquals("Shiver Me Timbers! Bad Storm!", mateyMessage.insert(mateyMessage.length(), " Bad Storm!").toString());
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string StringBuilder delete.
     * <br>Este teste verifica se os métodos de string StringBuilder delete estão retornando os valores esperados.
     */
    @Test
    @Order(23)
    void example19StringBuilderDeleteTest() {
        final StringBuilder mateyMessage = new StringBuilder ("Shiver Me Timbers!");
        Assertions.assertEquals("Shiver Me Timbers!", mateyMessage.toString());

        /* Exibe "Shivers! */
        Assertions.assertEquals("Shiver", mateyMessage.delete(6, mateyMessage.length()).toString());
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string StringBuilder reverse.
     * <br>Este teste verifica se os métodos de string StringBuilder reverse estão retornando os valores esperados.
     */
    @Test
    @Order(24)
    void example20StringBuilderReverseTest() {
        final StringBuilder mateyMessage = new StringBuilder ("Part");
        Assertions.assertEquals("Part", mateyMessage.toString());

        Assertions.assertEquals("traP", mateyMessage.reverse().toString());
    }

    /**
     * <br>Teste para validar os resultados dos métodos de string StringBuilder reverse.
     * <br>Este teste verifica se os métodos de string StringBuilder reverse estão retornando os valores esperados.
     */
    @Test
    @Order(25)
    void example21OrderTest() {
        final oca.chapter03.operators.Order order = new oca.chapter03.operators.Order();
        Assertions.assertTrue(order.printRelativityPriority());
    }
}