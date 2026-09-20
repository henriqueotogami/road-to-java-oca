package oca.chapter08.polymorphism.example02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de classe Farm para ilustrar polimorfismo em Java.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class Farm {

    public static final Logger logger = LogManager.getLogger(Farm.class.getName());

    public Farm() {
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter (4, 4, 6);
        logger.info(description(goat));
        logger.info(description(goatShelter));
        /*
         * A ideia eh demonstrar que as classes que implementam a interface Describable podem ser tratadas de forma
         * polimorfica, ou seja, podemos chamar o metodo description() passando qualquer objeto que implemente a
         * interface Describable, e o metodo getDescription() sera chamado de acordo com a classe do objeto passado.
         */
    }

    public static String description(final Describable describable) {
        return describable.getDescription();
    }

    public static void main(String[] args) {
        new Farm();
    }
}
