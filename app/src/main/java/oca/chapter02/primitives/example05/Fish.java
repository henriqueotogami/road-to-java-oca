package oca.chapter02.primitives.example05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(Fish.class);
    
    public String generateRandomFish() {
        String randomFish;
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(4);
        switch (randomNumber) {
            case 0:
                randomFish = "Blue Fish";
                break;
            case 1:
                randomFish = "Red Drum";
                break;
            case 2:
                randomFish = "Striped Bass";
                break;
            default:
                randomFish = "Unknown Fish Type";
                break;
        }
        return randomFish;
    }

    public static void main(String[] args) {
        final Fish fish = new Fish();
        for (int i = 0; i < 10; i++) {
            logger.info(fish.generateRandomFish());
        }
    }
}
