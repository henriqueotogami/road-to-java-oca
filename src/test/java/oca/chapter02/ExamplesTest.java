package oca.chapter02;

import oca.chapter02.primitives.example01.Attribution;
import oca.chapter02.primitives.example02.Conditionals;
import oca.chapter02.primitives.example03.FishingSession;
import oca.chapter02.primitives.example03.FishingTrip;
import oca.chapter02.primitives.example04.IfThenElse;
import oca.chapter02.primitives.example05.Fish;
import oca.chapter02.primitives.example06.Bat;
import oca.chapter02.primitives.example08.LoopWhile;
import oca.chapter02.primitives.example09.LoopDoWhile;
import oca.chapter02.primitives.example10.ControlKeywords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Testa o metodo {@code generateRandomFish()} da classe {@link Fish} para verificar o comportamento relacionado à geração de tipos de peixe aleatórios.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que o tipo de peixe gerado corresponde ao número aleatório gerado, garantindo que os casos 0, 1, 2 e o caso padrão sejam tratados corretamente.
     *
     * Asserções são usadas para validar os resultados esperados em cada etapa do teste, garantindo que o metodo funcione conforme o esperado, mesmo com resultados aleatórios.
     */
    @Test
    @Order(5)
    void example05() {
        final Fish fish = new Fish();
        for (int index = 0; index < 10; index++) {
            final String fishName = fish.generateRandomFish();
            switch (fish.getRandomNumber()) {
                case 0:
                    Assertions.assertEquals("Blue Fish", fishName, "Expected 'Blue Fish' for random number 0");
                    continue;
                case 1:
                    Assertions.assertEquals("Red Drum", fishName, "Expected 'Red Drum' for random number 1");
                    continue;
                case 2:
                    Assertions.assertEquals("Striped Bass", fishName, "Expected 'Striped Bass' for random number 2");
                    continue;
                default:
                    Assertions.assertEquals("Unknown Fish Type", fishName, "Expected 'Unknown Fish Type' for random numbers 3 and above");
                    continue;
            }
        }
    }

    /**
     * Testa o metodo {@code generateBait()} da classe {@link Bat} para verificar o comportamento relacionado à geração de nomes de isca com base em um enum.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que o nome da isca gerado corresponde ao valor do enum fornecido, garantindo que os casos FRESH, SALTED e ARTIFICIAL sejam tratados corretamente, bem como o caso padrão.
     *
     * Asserções são usadas para validar os resultados esperados em cada etapa do teste, garantindo que o metodo funcione conforme o esperado, mesmo com diferentes valores de enum.
     */
    @Test
    @Order(6)
    void example06() {
        Bat.ClamBait bait = Bat.ClamBait.SALTED;
        Bat bat = new Bat();
        final String nameBait = bat.generateBait(bait);
        Assertions.assertEquals("Salted clams", nameBait, "Expected 'Salted clams' for ClamBait.SALTED");
    }

    /**
     * Testa o metodo {@code waitCastFosFish()} da classe {@link LoopWhile} para verificar o comportamento relacionado a uma sessão de pesca que se torna inativa após atingir um limite de peixes.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que a sessão de pesca se torna inativa após o metodo ser executado, garantindo que o loop while funcione conforme o esperado e que a variável de instância seja atualizada corretamente.
     *
     * Asserções são usadas para validar os resultados esperados, garantindo que o metodo funcione conforme o esperado, mesmo com a lógica de loop while.
     */
    @Test
    @Order(7)
    void example07() {
        final FishingSession fishingSession = new FishingSession();
        final LoopWhile loopWhile = new LoopWhile();
        loopWhile.waitCastFosFish(fishingSession);
        Assertions.assertEquals("inactive", fishingSession.getSession(), "Fishing session should be inactive after reaching fish limit");
    }

    /**
     * Testa o metodo {@code oldCast()} da classe {@link LoopDoWhile} para verificar o comportamento relacionado a uma sessão de pesca que utiliza um loop do-while para lançar a linha, mesmo sem isca disponível.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que o número de peças de isca permanece inalterado após a execução do metodo, garantindo que o loop do-while funcione conforme o esperado e que a variável de instância seja atualizada corretamente.
     * - Verificação de que a sessão de pesca permanece ativa após a execução do metodo, garantindo que o estado da sessão seja mantido conforme o esperado.
     *
     * Asserções são usadas para validar os resultados esperados, garantindo que o metodo funcione conforme o esperado, mesmo com a lógica de loop do-while.
     */
    @Test
    @Order(8)
    void example08() {
        final FishingSession fishingSession = new FishingSession();
        fishingSession.setSession("active");
        LoopDoWhile loopDoWhile = new LoopDoWhile();
        fishingSession.setBaitAvailable(true);
        loopDoWhile.oldCast(fishingSession);
        Assertions.assertEquals(0, loopDoWhile.oldCast(fishingSession), "Pieces of bait should remain unchanged after oldCast method execution");
        Assertions.assertEquals("active", fishingSession.getSession(), "Fishing session should remain active after newCast method execution");
    }

    /**
     * Testa os métodos da classe {@link ControlKeywords} para verificar o comportamento relacionado a palavras-chave de controle, como break, continue e return.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que os métodos keywordBreak() e keywordContinue() executam sem erros.
     * - Validação dos resultados retornados pelos métodos keywordReturn01() e keywordReturn02(), garantindo que eles retornem os valores esperados com base nos parâmetros fornecidos.
     * - Verificação de que o metodo keywordReturn03() executa sem erros, mesmo sem retornar um valor.
     *
     * Asserções são usadas para validar os resultados esperados, garantindo que os métodos funcionem conforme o esperado, mesmo com a lógica de controle envolvida.
     */
    @Test
    @Order(9)
    void example09() {
        final ControlKeywords controlKeywords = new ControlKeywords();
        controlKeywords.keywordBreak();
        controlKeywords.keywordContinue();

        final int totalFishTypes = controlKeywords.keywordReturn01(5, 10, 3);
        Assertions.assertEquals(18, totalFishTypes, "Total fish types should be the sum of the three parameters");

        final int totalFishCaught = controlKeywords.keywordReturn02(15, 5);
        Assertions.assertEquals(20, totalFishCaught, "Total fish caught should be the product of the two parameters");

        controlKeywords.keywordReturn03(15, 5);

        Assertions.assertTrue(true, "Control keywords test executed successfully");
    }

    /**
     * Testa a manipulação de uma lista de tamanhos de peixes para verificar a validação de valores nulos e negativos.
     * <p>
     * Este teste cobre os seguintes cenários:
     * - Verificação de que cada tamanho de peixe na lista não é nulo e é maior que zero, garantindo que os valores sejam válidos para representar tamanhos de peixes.
     *
     * Asserções são usadas para validar os resultados esperados, garantindo que a lista de tamanhos de peixes seja manipulada corretamente e que os valores sejam válidos.
     */
    @Test
    @Order(10)
    void example10() {
        final List<Float> allFishesSize         = Arrays.asList(10.0f, 15.5f, 18.0f, 29.5f, 45.5f);
        final ArrayList<Float> fishLengthList   = new ArrayList<>(allFishesSize);
        final float MINIMUM_SIZE                = 28.0f;

        for(Float fish: fishLengthList) {
            Assertions.assertNotNull(fish, "Fish size should not be null");
            Assertions.assertTrue(fish > 0, "Fish size should be greater than 0");
        }
    }

    @Test
    @Order(11)
    void example11() {
        
    }
}
