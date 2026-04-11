package oca.chapter04;

import oca.chapter04.exercise01.ERACalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * <br>Classe de teste para os exercícios do capítulo 4 da OCA, incluindo o cálculo de ERA para um jogador de beisebol.
 *
 * @author henriqueotogami
 * @since 2026-04-10
 * @version 0.5
 */
public class ExercisesTest {

    /**
     * Teste para o exercício 1 do capítulo 4, que envolve o cálculo de ERA (Earned Run Average) para um jogador de beisebol.
     */
    @Test
    @Order(1)
    void exercise01ERACalculator() {
        final ERACalculator calculator = new ERACalculator();
        calculator.setEra((float) calculator.getEarnedRuns() / (float) calculator.getInningsPitched() * calculator.getInningsInAGame());

        if (calculator.getEra() < calculator.getLeagueAverageEra()) {
            calculator.setBetterThanAverage(true);
        } else {
            calculator.setBetterThanAverage(false);
        }

        calculator.setYesNo(calculator.isBetterThanAverage() ? 'Y' : 'N');

        Assertions.assertEquals(4.5f, calculator.getEra());
        Assertions.assertFalse(calculator.isBetterThanAverage());
        Assertions.assertEquals('N', calculator.getYesNo());
    }

}