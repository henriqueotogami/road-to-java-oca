package oca.chapter02.primitives.example08;

import oca.chapter02.primitives.example03.FishingSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Esta classe demonstra o uso de um loop while para simular uma sessão de pesca. O metodo {@code waitCastFosFish()}
 * mantém a sessão ativa enquanto o número de peixes pescados for menor do que um limite especificado. O metodo {@code castForFish()}
 * incrementa o número de peixes pescados a cada chamada.
 *
 * @author henriqueotogami
 * @since 2026-03-01
 * @version 1.0
 */
public class LoopWhile {

    private static final Logger logger = LogManager.getLogger(LoopWhile.class);
    private int fishLimit = 0;

    public static void main(String[] args) {
        final FishingSession fishingSession = new FishingSession();
        final LoopWhile loopWhile = new LoopWhile();
        loopWhile.waitCastFosFish(fishingSession);
    }

    public void waitCastFosFish(FishingSession fishingSession) {
        fishingSession.setSession("active");
        /* INSTRUÇÃO WHILE */
        while (fishingSession.getSession().equals("active")) {
            this.castForFish(); // Atualiza a variável de instância fishLimit
            if (this.fishLimit == 10) {
                fishingSession.setSession("inactive");
                logger.info("Limite de espera por peixes");
            }
        }
    }

    private void castForFish() { this.fishLimit++; }
}
