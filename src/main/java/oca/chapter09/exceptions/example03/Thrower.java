package oca.chapter09.exceptions.example03;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;

/**
 * Classe de exemplo de lancamento de exceptions em efeito cascata.
 * Ou seja, uma exception que ocorre no "metodo mais inferior", vai sendo relancada ate o "metodo mais superior".
 * <p>Nesse caso, a sequencia de execucao eh a seguinte:
 * <p>{@code throw1() -> throw2() -> throw3() -> throw4() }
 * <p>Enquanto a sequencia de lancamento de exception ocorre no sentido inverso:
 * <p>{@code throw1() <- throw2() <- throw3() <- throw4() }
 *
 * @author henriqueotogami
 * @since 26/09/2026
 * @version 1.0
 */
public class Thrower {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Thrower.class);

    public static void main(String[] args) {
        Thrower t = new Thrower();
        t.cascading();
    }

    public void cascading() {
        final Thrower thrower = new Thrower();
        try {
            thrower.throw1();
        } catch (IOException e) {
            logger.error("Exception: {}", e.getMessage());
        }
    }

    public void throw1() throws IOException {
        logger.info("throw 1");
        throw2();
    }

    public void throw2() throws IOException {
        logger.info("throw 2");
        throw3();
    }

    public void throw3() throws IOException {
        logger.info("throw 3");
        throw4();
    }

    public void throw4() throws IOException {
        logger.info("throw 4");
        throw new IOException("Explosion");
    }

}
