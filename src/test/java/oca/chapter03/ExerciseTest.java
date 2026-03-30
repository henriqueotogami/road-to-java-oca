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
}
