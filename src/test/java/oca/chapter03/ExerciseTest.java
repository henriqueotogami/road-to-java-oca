package oca.chapter03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**<br>Exercício 01: Testar os construtores da classe StringBuilder.
 * <br>Este teste valida os diferentes construtores disponíveis na classe StringBuilder, verificando a capacidade, comprimento e conteúdo resultante.
 *
 * @see java.lang.StringBuilder
 */
class ExerciseTest {


    /** Testa os construtores da classe StringBuilder.
     * <br>Valida a capacidade, comprimento e conteúdo resultante para cada tipo de construtor.
     */
    @Test
    @Order(1)
    void exercise01StringBuilderConstructor() {

        final StringBuilder constructorEmpty = new StringBuilder();
        Assertions.assertEquals(16, constructorEmpty.capacity());
        Assertions.assertEquals(0, constructorEmpty.length());
        Assertions.assertEquals("", constructorEmpty.toString());

        final StringBuilder constructorCharSequence = new StringBuilder("Java");
        Assertions.assertEquals(20, constructorCharSequence.capacity());
        Assertions.assertEquals(4, constructorCharSequence.length());
        Assertions.assertEquals("Java", constructorCharSequence.toString());

        final StringBuilder constructorCapacity = new StringBuilder(50);
        Assertions.assertEquals(50, constructorCapacity.capacity());
        Assertions.assertEquals(0, constructorCapacity.length());
        Assertions.assertEquals("", constructorCapacity.toString());

        final StringBuilder constructorStringBuilder = new StringBuilder(constructorCharSequence);
        Assertions.assertEquals(20, constructorStringBuilder.capacity());
        Assertions.assertEquals(4, constructorStringBuilder.length());
        Assertions.assertEquals("Java", constructorStringBuilder.toString());
    }

    /** Exercício 02: Testar a comparação de Strings usando equals() e ==.
     * <br>Este teste valida a comparação de Strings utilizando o metodo equals() para verificar o conteúdo e o operador == para verificar a referência.
     *
     * @see java.lang.String
     */
    @Test
    @Order(2)
    void exercise02StringEquals() {
        final String msg1 = "WALK THE PLANK!";
        final String msg2 = "WALK THE PLANK!";
        final String msg3 = ("WALK THE PLANK!");
        final String msg4 = new String ("WALK THE PLANK!");

        Assertions.assertTrue(msg1.equals(msg2)); // true
        Assertions.assertTrue(msg1.equals(msg3)); // true
        Assertions.assertTrue(msg1.equals(msg4)); // true
        Assertions.assertTrue(msg2.equals(msg3)); // true
        Assertions.assertTrue(msg3.equals(msg4)); // true

        final String cmd     = "Set Sail!";
        final String command = cmd;
        Assertions.assertTrue((cmd == command)); // true
    }

    /** Exercício 03: Testar a comparação de Strings usando compareTo().
     * <br>Este teste valida a comparação de Strings utilizando o metodo compareTo(), verificando as diferenças lexicográficas entre as strings.
     *
     * @see java.lang.String
     */
    @Test
    @Order(3)
    void exercise03StringComparesTo() {
        final String eggs1 = "Cackle fruit";
        final String eggs2 = "Cackle fruit";
        Assertions.assertEquals(0, eggs1.compareTo(eggs2));

        final String eggs3 = "Cackle fruiy";
        Assertions.assertEquals(-5, eggs1.compareTo(eggs3));
        // A letra 't' tem um valor ASCII de 116, enquanto a letra 'y' tem um valor ASCII de 121.
        // Portanto, a diferença é 116 - 121 = -5.

        Assertions.assertEquals(5, eggs3.compareTo(eggs1));
        // A letra 'y' tem um valor ASCII de 121, enquanto a letra 't' tem um valor ASCII de 116.
        // Portanto, a diferença é 121 - 116 = 5.

        final String eggs4 = "Cackle fruits";
        Assertions.assertEquals(-1, eggs1.compareTo(eggs4));

        Assertions.assertEquals(1, eggs4.compareTo(eggs1));

    }
}
