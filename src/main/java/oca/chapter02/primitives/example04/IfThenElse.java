package oca.chapter02.primitives.example04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe demonstrativa sobre estruturas condicionais em Java, comparando o uso
 * tradicional de if-else com a expressão ternária.
 * <p>
 * Esta classe contém dois metodos, {@code defaultIfElse()} e {@code ternaryIfElse()},
 * que ambos calculam o valor absoluto de um número inteiro. O metodo
 * {@code defaultIfElse()} utiliza a estrutura tradicional de if-else, enquanto o
 * metodo {@code ternaryIfElse()} utiliza a expressão ternária para obter o mesmo
 * resultado de forma mais concisa.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class IfThenElse {

    private static final Logger logger = LogManager.getLogger(IfThenElse.class);

    public int ternaryIfElse() {
        final int x = -5;
        final int valorAbsoluto = (x > 0) ? x : -x;
        logger.info(valorAbsoluto);
        return valorAbsoluto;
    }

    public int defaultIfElse() {
        int x = -5;
        int valorAbsoluto;
        if(x > 0){
            valorAbsoluto = x;
        }
        else{
            valorAbsoluto = -x;
        }
        logger.info(valorAbsoluto);
        return valorAbsoluto;
    }
}
