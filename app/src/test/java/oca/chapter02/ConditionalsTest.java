package oca.chapter02;

import oca.chapter02.primitives.example02.Conditionals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * <br>Teste de condições em Java.
 * <br>Este teste verifica o comportamento das condições em Java, incluindo o uso de switch, default e ternário.
 * @author henriqueotogami
 * @since 2026-02-25
 * @version 1.0
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class ConditionalsTest {

    /**
     * <br>Teste de condições em Java.
     * <br>Este teste verifica o comportamento das condições em Java, incluindo o uso de switch, default e ternário.
     * @author henriqueotogami
     * @since 2026-02-25
     * @version 1.0
     */
    @Test
    @Order(1)
    public void weatherTest() {
        final Conditionals conditionals = new Conditionals();

        conditionals.setItRaining(true);
        Assertions.assertEquals(Conditionals.ITS_RAINING, conditionals.getWeatherWithSwitch());
        Assertions.assertEquals(Conditionals.ITS_RAINING, conditionals.getWeatherByDefault());
        Assertions.assertEquals(Conditionals.ITS_RAINING, conditionals.getWeatherByTernary());

        conditionals.setItRaining(false);
        Assertions.assertEquals(Conditionals.ITS_NOT_RAINING, conditionals.getWeatherWithSwitch());
        Assertions.assertEquals(Conditionals.ITS_NOT_RAINING, conditionals.getWeatherByDefault());
        Assertions.assertEquals(Conditionals.ITS_NOT_RAINING, conditionals.getWeatherByTernary());
    }
}
