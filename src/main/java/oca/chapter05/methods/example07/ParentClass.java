package oca.chapter05.methods.example07;

import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para construtores em Java, demonstrando a criação de uma classe pai com dois construtores.
 *
 * @author henriqueotogami
 * @since 2026-04-20
 * @version 0.5
 */
public class ParentClass {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ParentClass.class.getName());

    // Classe pai
    public ParentClass() {
        logger.info("ParentClass Constructor");
    }

    public ParentClass(String s) {
        logger.info("ParentClass Constructor {}", s);
    }
}