package oca.chapter02.primitives.example05;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Esta classe representa um peixe e inclui um metodo para gerar um tipo de peixe
 * aleatório. O metodo {@code generateRandomFish()} utiliza a classe {@link Random}
 * para gerar um número aleatório entre 0 e 3, que é então mapeado para um tipo de
 * peixe específico (Blue Fish, Red Drum, Striped Bass) ou um tipo desconhecido.
 *
 * O metodo {@code main} cria uma instância da classe Fish e chama o metodo
 * {@code generateRandomFish()} dez vezes, imprimindo o resultado de cada chamada.
 */
public class Fish {

    private final SecureRandom randomObject = new SecureRandom();
    private int randomNumber = 0;

    public String generateRandomFish() {
        randomNumber = this.randomObject.nextInt(4);
        switch (randomNumber) {
            case 0: return "Blue Fish";
            case 1: return "Red Drum";
            case 2: return "Striped Bass";
            default: return "Unknown Fish Type";
        }
    }

    /**
     * Retorna o número aleatório gerado pela última chamada do metodo {@code generateRandomFish()}.
     *
     * @return o número aleatório gerado, que pode ser 0, 1, 2 ou 3.
     */
    public int getRandomNumber() { return this.randomNumber; }
}
