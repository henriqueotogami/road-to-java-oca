package oca.chapter02.primitives.example09;

import oca.chapter02.primitives.example03.FishingSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Esta classe demonstra o uso de um loop do-while para simular uma sessão de pesca. O metodo {@code oldCast()}
 * utiliza um loop do-while para garantir que o pescador lance a linha pelo menos uma vez, mesmo que ele não tenha isca disponível.
 * O metodo {@code newCast()} refatora o código para usar um loop while, garantindo que o pescador só lance a linha se tiver isca disponível.
 *
 * @author henriqueotogami
 * @since 2026-03-01
 * @version 1.0
 */
public class LoopDoWhile {

    // No exemplo de código a seguir, queremos nos certificar de que o pescador lance a linha
    // pelo menos uma vez. Embora isso faça sentido, precisamos sempre considerar casos
    // extremos. E se uma raposa roubar a isca do pescador antes dele ter a chance de lançar
    // a linha? Nesse caso, a variável piecesOfBait (que representa quantas iscas ele possui)
    // seria igual a zero, mas o pescador ainda faria o lançamento, já que o corpo do laço
    // do‑while garante pelo menos uma iteração. Veja se consegue refatorar esse código com
    // uma instrução while para evitar a possível condição de lançamento da linha sem isca.

    private static final Logger logger = LogManager.getLogger(LoopDoWhile.class);

    public static void main(String[] args) {
        final FishingSession fishingSession = new FishingSession();
        fishingSession.setSession("active");
        int piecesOfBait = 5;
//        piecesOfBait = oldCast(fishingSession);
        newCast(piecesOfBait, fishingSession);
    }

    private static void newCast(int piecesOfBait, FishingSession fishingSession) {
        while (piecesOfBait != 0) {
            castForFish();
            /* Verifica se há isca disponível */
            if (fishingSession.isBaitAvailable() == false) {
                /* Coloca uma isca nova no anzol */
                fishingSession.setBaitAvailable(true);
                piecesOfBait--;
            }
        }
    }

    private static int oldCast(FishingSession fishingSession) {
        int piecesOfBait = 0; // A raposa roubou toda a isca!
        do {
            castForFish();
            /* Verifica se há isca disponível */
            if (fishingSession.isBaitAvailable() == false) {
                /* Coloca uma isca nova no anzol */
                fishingSession.setBaitAvailable(true);
                piecesOfBait--;
            }
        } while (piecesOfBait != 0);
        return piecesOfBait;
    }

    private static void castForFish() {
        logger.info("Lançando a linha...");
    }
}
