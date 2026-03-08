package oca.chapter02;

import oca.chapter02.primitives.example01.Attribution;
import oca.chapter02.primitives.example02.Conditionals;
import oca.chapter02.primitives.example03.FishingTrip;
import oca.chapter02.primitives.example04.IfThenElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Classe de teste para os exemplos de atribuição e estruturas condicionais.
 * <p>
 * Esta classe contém testes unitários para validar o comportamento das classes
 * {@link Attribution} e {@link Conditionals}, garantindo que os métodos
 * implementados nessas classes funcionem conforme o esperado.
 *
 * Principais responsabilidades:
 * - Testar os métodos de manipulação de graus e peixes na classe {@code Attribution}.
 * - Testar os métodos relacionados a eventos climáticos e condições booleanas na classe {@code Conditionals}.
 *
 * Observações:
 * - Os testes utilizam asserções para verificar os resultados esperados.
 * - A ordem dos testes é definida usando a anotação {@code @Order} para garantir a sequência correta de execução.
 *
 * @author henriqueotogami
 * @since 2026-02-25
 * @version 1.1
 */
public class ExamplesTest {


    /**
     * Testa os métodos da classe {@link Attribution} para verificar a manipulação de graus e peixes.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Configuração dos graus padrão.
     * - Soma e decremento de peixes.
     * - Incremento de peixes.
     * - Manipulação dos graus antes e depois de incrementos e decrementos.
     *
     * Asserções são usadas para validar os resultados esperados em cada etapa do teste.
     */
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

    /**
     * Testa os métodos da classe {@link Conditionals} para verificar o comportamento relacionado a eventos climáticos e condições booleanas.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação do mapeamento de id para {@code Weather}.
     * - Validação de eventos climáticos e tipos de clima usando métodos específicos.
     * - Avaliação de condições booleanas usando métodos que retornam valores booleanos.
     *
     * Asserções são usadas para validar os resultados esperados em cada etapa do teste, garantindo que os métodos funcionem conforme o esperado.
     */
    @Test
    @Order(2)
    void example02Test() {

        final Conditionals conditionals = new Conditionals();
        final int randomIndex = Conditionals.Weather.ITS_SUNNY.getId();
        Assertions.assertEquals(3, randomIndex);

        Assertions.assertNotNull(conditionals.getWeatherEvent(Conditionals.Weather.ITS_SUNNY), "Weather event should not be null!");
        Assertions.assertNotNull(conditionals.getWeatherType(randomIndex),"Weather type should not be null!");
        Assertions.assertNotNull(conditionals.getWeatherType("ITS_RAINING"), "Weather type should not be null!");

        Assertions.assertFalse(conditionals.strangeBooleanCondition());
        Assertions.assertTrue(conditionals.wrapperBooleanCondition());
    }

    /**
     * Testa o metodo {@code castForFish()} da classe {@link FishingTrip} para verificar o comportamento relacionado a lançamentos de pesca.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que o resultado do lançamento não é nulo.
     * - Se um peixe for pego, validação de que o resultado do peixe e o tipo do peixe não são nulos.
     *
     * Asserções são usadas para validar os resultados esperados em cada etapa do teste, garantindo que o metodo funcione conforme o esperado, mesmo com resultados aleatórios.
     */
    @Test
    @Order(3)
    void example03Test() {
        final FishingTrip trip = new FishingTrip();
        trip.castForFish();
        Assertions.assertNotNull(trip.getFishingSession().getCastResult(), "Cast result should not be null!");
        if (trip.getFishingSession().getCastResult().equals("fish")) {
            Assertions.assertNotNull(trip.getFishingSession().getFishResult(), "Fish result should not be null when a fish is caught!");
            Assertions.assertNotNull(trip.getFishingSession().getFishResult().getTypeOfFish(), "Type of fish should not be null when a fish is caught!");
        }
    }

    /**
     * Testa os métodos {@code defaultIfElse()} e {@code ternaryIfElse()} da classe {@link IfThenElse} para verificar o cálculo do valor absoluto.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que ambos os métodos retornam o valor absoluto correto para um número negativo.
     *
     * Asserções são usadas para validar os resultados esperados, garantindo que ambos os métodos funcionem conforme o esperado, mesmo com a mesma lógica subjacente.
     */
    @Test
    @Order(4)
    void example04() {
        final IfThenElse ifThenElse = new IfThenElse();
        Assertions.assertEquals(5, ifThenElse.defaultIfElse(), "Default if-else should return the absolute value of -5");
        Assertions.assertEquals(5, ifThenElse.ternaryIfElse(), "Ternary if-else should return the absolute value of -5");
    }
}
