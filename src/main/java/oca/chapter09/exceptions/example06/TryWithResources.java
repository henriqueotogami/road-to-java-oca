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

    public boolean tryNoResources(final boolean trow){
        BufferedReader reader = null;
        boolean answer = false;
        try {
            final FileReader in = new FileReader("logs/log-try-no-resources.txt");
            reader = new BufferedReader(in);
            if(reader.lines() != null) logger.info("Linha do arquivo: {}", reader.readLine());
            if(trow) throw new IOException("Exceção lançada propositalmente");
        } catch (IOException e) {
            logger.error("Execption: {}", e.getMessage());
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
            if(reader.lines() != null) logger.info("Linha lida do arquivo: {}", reader.readLine());
            answer = true;
        } catch (IOException e) {
            logger.error("Exception1: {}", e.getMessage());
        }
        return answer;
    }
}
