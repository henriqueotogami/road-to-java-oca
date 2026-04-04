package oca.chapter02.instructions.example03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    private FishingSession fishingSession = new FishingSession();

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
        this.getKindOfCast(resultOfCast);
    }

    /**
     * Processa o resultado do lançamento e imprime uma mensagem apropriada.
     *
     * @param resultOfCast o resultado do lançamento, que pode ser "fish", "shark",
     *                     "skate" ou "no catch".
     * @return uma string indicando o tipo de resultado ("fish", "shark", "skate" ou "no catch").
     */
    public String getKindOfCast(String resultOfCast) {
        if (resultOfCast.equals("fish")) {
            final Fish keeperFish   = fishingSession.getFishResult();
            final String type       = keeperFish.getTypeOfFish();
            logger.info("Wahoo! Keeper fish: {}", type);
            return "fish";
        } else if (resultOfCast.equals("shark")) {
            logger.info("Need to throw this one back!");
            return "shark";
        } else if (resultOfCast.equals("skate")) {
            logger.info("Yuck, Leo can take this one off the hook!");
            return "skate";
        } else {
            logger.info("Darn, no catch!");
            return "no catch";
        }
    }

    /**
     * Retorna a instância de {@link FishingSession} associada a esta viagem de pesca.
     *
     * @return a instância de {@code FishingSession} usada para simular os lançamentos de pesca.
     */
    public FishingSession getFishingSession() { return this.fishingSession; }

    public void setFishingSession(FishingSession fishingSession) {
        this.fishingSession = fishingSession;
    }
}