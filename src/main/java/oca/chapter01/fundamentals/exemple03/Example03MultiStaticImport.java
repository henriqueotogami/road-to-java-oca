package oca.chapter01.fundamentals.exemple03;

/* Importa todos os membros estáticos da classe Locale */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.Locale.*;
/**
 * Exemplo de importação estática múltipla em Java.
 * Mostra como importar todos os membros estáticos de uma classe.
 * @author henriqueotogami
 * @since 2026-02-04
 * @version 1.0
 */
public class Example03MultiStaticImport {

    private static final Logger logger = LogManager.getLogger( Example03MultiStaticImport.class);

    public static void main(String[] args) {
        logger.info("Locale: {}", ITALY); // Exibe "Local: it_IT"
        logger.info("Locale: {}", GERMANY); // Exibe "Local: de_DE"
        logger.info("Locale: {}", JAPANESE); // Exibe "Local: ja"
    }
}
