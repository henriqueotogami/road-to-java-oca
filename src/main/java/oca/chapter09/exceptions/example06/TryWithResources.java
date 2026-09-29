package oca.chapter09.exceptions.example06;

import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe de exemplo de try with resources.
 * Ou seja, um bloco de try com parâmetros, dedicado para gerenciar arquivos, buffers e etc.
 * <p>Por exemplo:
 * <p>{@code try(something){}catch{} }
 *
 * @author henriqueotogami
 * @since 28/09/2026
 * @version 1.0
 */
public class TryWithResources {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TryWithResources.class);

    public boolean tryNoResources(){
        BufferedReader reader = null;
        boolean answer = false;
        try {
            reader = new BufferedReader(new FileReader("logs/log-try-no-resources.txt"));
            logger.info(reader.readLine());
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    answer = true;
                } catch (IOException e) {
                    logger.error(e.getMessage());
                }
            }
        }
        return answer;
    }

    public boolean tryWithResources() {
        boolean answer = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("logs/log-try-with-resources.txt"))) {
            logger.info(reader.readLine());
            answer = true;
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return answer;
    }
}
