package oca.chapter02;

import oca.chapter02.primitives.example02.Conditionals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Random;

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
        final Random random             = new Random();
        final int randomIndex           = random.nextInt(Conditionals.Weather.values().length);

        Assertions.assertEquals("SUN", conditionals.getWeatherEvent(Conditionals.Weather.ITS_SUNNY));
        Assertions.assertEquals(Conditionals.Weather.values()[randomIndex], conditionals.getWeatherType(randomIndex));
        Assertions.assertEquals(Conditionals.Weather.ITS_RAINING, conditionals.getWeatherType("ITS_RAINING"));
    }
}
