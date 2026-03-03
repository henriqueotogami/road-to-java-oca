package oca.chapter01.fundamentals.exemple02;

/* Importa o membro estático ITALY */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.Locale.ITALY;

/**
 * Exemplo de importação estática em Java.
 * Mostra como importar um membro estático específico de uma classe.
 * @author henriqueotogami
 * @since 2026-02-04
 * @version 1.0
 */
public class Example02SingleStaticImport {

    private static final Logger logger = LogManager.getLogger(Example02SingleStaticImport.class);

    public static void main(String[] args) {
            logger.info("Locale: {}", ITALY); // Exibe "Local: it_IT"
    }
}