package oca.chapter02.primitives.exercise02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidBigFishes {

    // Nesse exercício, você iterará sobre um ArrayList de floats. Especificamente, exibirá
    // somente os tamanhos válidos de peixes grandes.

    // 1. Crie um ArrayList de floats chamado fishLengthList. Essa lista representará os tamanhos de alguns robalos riscados.
    // 2. Adicione os floats a seguir à lista: 10.0, 15.5, 18.0, 29.5, 45.5. Esses números representam o tamanho em polegadas da pesca.
    // 3. Itere pela lista, exibindo somente os números maiores do que o tamanho requerido.Assuma um tamanho requerido de 28 polegadas.

    // Para conhecer melhor a classe ArrayList, consulte o Capítulo 4.

    private static final Logger logger = LogManager.getLogger(ValidBigFishes.class);

    public static void main(String[] args) {
        final List<Float> allFishesSize         = Arrays.asList(10.0f, 15.5f, 18.0f, 29.5f, 45.5f);
        final ArrayList<Float> fishLengthList   = new ArrayList<>(allFishesSize);
        final float MINIMUM_SIZE                = 28.0f;

        for(Float fish: fishLengthList) {
            if(fish > MINIMUM_SIZE) {
                logger.info("This fish is big: {} inches.", fish);
            }
        }
    }
}
