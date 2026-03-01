package oca.chapter02.primitives.example03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe representando uma sessão de pesca, onde o metodo {@code setCatch()}
 * simula o lançamento da linha e determina o resultado do lançamento (peixe,
 * tubarão, arraia ou nenhum peixe) usando um número aleatório.
 * <p>
 * O metodo {@code setCatch()} gera um número aleatório entre 0 e 1 e, com base
 * nesse número, define o resultado do lançamento. Se um peixe for pego, ele
 * também cria uma instância de {@link Fish} e define o tipo de peixe.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class FishingSession {

    private static final Logger logger = LogManager.getLogger(FishingSession.class);

    private String castResult;
    private Fish fishResult;

    /**
     * Simula o lançamento da linha e determina o resultado do lançamento usando
     * um número aleatório. O resultado pode ser "fish", "shark", "skate" ou
     * "no catch". Se um peixe for pego, ele também cria uma instância de {@link Fish}
     * e define o tipo de peixe como "trout".
     */
    public void setCatch() {

        double random = Math.random();

        if (random < 0.25) {
            castResult = "fish";
            fishResult = new Fish();
            fishResult.setTypeOfFish("trout");
        } else if (random < 0.5) {
            castResult = "shark";
        } else if (random < 0.75) {
            castResult = "skate";
        } else {
            castResult = "no catch";
        }
    }

    public String getCastResult() { return this.castResult; }

    public Fish getFishResult() { return this.fishResult; }
}
