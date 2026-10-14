package oca.chapter09.exceptions.example07;

import org.apache.logging.log4j.LogManager;

import java.awt.*;
import java.io.IOException;
import java.io.InterruptedIOException;

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

    public void one(int i) throws IOException {

            logger.info("Number = {}", i);
            i++;
            if (i == 2) {
                logger.info("Number is zero= {}", i);
                throw new IOException("Zero is out");
            }
    }

    public void two(int i) throws FontFormatException {
        i +=2;
        if(i == 3) {
            logger.info("Number is one = {}", i);
            throw new FontFormatException("Any number is null");
        }
    }
}
