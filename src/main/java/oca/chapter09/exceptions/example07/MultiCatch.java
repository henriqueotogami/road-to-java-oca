package oca.chapter09.exceptions.example07;

import org.apache.logging.log4j.LogManager;

/**
 * Classe de exemplo de multi catch
 * Ou seja, um bloco de catch que simplifica a captura de exceptions tratadas pelo metodo.
 * <p>Por exemplo:
 * <p>{@code try(){}catch(exception1 | exception2 e){} }
 *
 * @author henriqueotogami
 * @since 28/09/2026
 * @version 1.0
 */
public class MultiCatch {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MultiCatch.class);

    public void one(int i) throws ArrayIndexOutOfBoundsException, NullPointerException {
        try {
            logger.info("Number = {}", i);
            if (i == 0) {
                throw new ArrayIndexOutOfBoundsException("Zero is out");
            } else {
                throw new NullPointerException("Any number is null");
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            logger.error(e.getMessage());
            throw e;
        }
    }
}
