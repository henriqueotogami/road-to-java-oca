package oca.chapter05.methods.example07;

import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para construtores em Java, demonstrando a criação de uma classe filha que herda de uma classe pai com dois construtores.
 *
 * @author henriqueotogami
 * @since 2026-04-20
 * @version 0.5
 */
public class ChildClass extends ParentClass {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ChildClass.class.getName());

    //Classe filha
    public ChildClass() {
        logger.info("ChildClass Constructor");
    }

    public ChildClass(String s) {
        super(s);
        logger.info("ChildClass Constructor {}", s);
    }
}
