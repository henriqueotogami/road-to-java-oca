package oca.chapter02.primitives.example03;

import org.apache.logging.log4j.EventLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;

/**
 * Classe demonstrativa sobre estruturas condicionais em Java, usando um cenário
 * de pesca para ilustrar o uso de if-else.
 * <p>
 * Esta classe representa uma viagem de pesca, onde o metodo {@code castForFish()}
 * simula lançar a linha e processar o resultado do lançamento (peixe, tubarão,
 * arraia ou nenhum peixe).
 * <p>
 * O metodo {@code castForFish()} utiliza uma instância de {@link FishingSession}
 * para obter o resultado do lançamento e, com base nesse resultado, imprime uma
 * mensagem apropriada. Se um peixe for pego, ele também obtém o tipo do peixe
 * e o exibe.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class FishingTrip {

    private final Logger logger                 = LogManager.getLogger(FishingTrip.class);
    private final FishingSession fishingSession = new FishingSession();

    /**
     * Simula lançar a linha para pescar e processa o resultado do lançamento.
     * <p>
     * O metodo chama {@code setCatch()} da instância de {@link FishingSession}
     * para determinar o resultado do lançamento. Com base no resultado, ele
     * imprime uma mensagem apropriada. Se um peixe for pego, ele também obtém
     * o tipo do peixe e o exibe.
     */
    public void castForFish() {

        fishingSession.setCatch();
        final String resultOfCast = fishingSession.getCastResult();

        if (resultOfCast.equals("fish")) {
            final Fish keeperFish   = fishingSession.getFishResult();
            final String type       = keeperFish.getTypeOfFish();
            logger.info("Wahoo! Keeper fish: {}", type);
        } else if (resultOfCast.equals("shark")) {
            logger.info("Need to throw this one back!");
        } else if (resultOfCast.equals("skate")) {
            logger.info("Yuck, Leo can take this one off the hook!");
        } else {
            logger.info("Darn, no catch!");
        }
    }

    public static void main(String[] args) {
        final FishingTrip trip = new FishingTrip();
        trip.castForFish();
    }
}