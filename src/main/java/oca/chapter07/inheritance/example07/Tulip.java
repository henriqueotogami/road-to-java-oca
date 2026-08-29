package oca.chapter07.inheritance.example07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe que representa uma tulipa.
 * Esta classe estende a classe abstrata Plant, fornecendo implementações específicas para o crescimento da tulipa em diferentes estações do ano.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class Tulip extends Plant {

    private static final Logger logger = LogManager.getLogger(Tulip.class);
    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;

    /*
     * Uma tulipa cresce cada ano a mesma altura. Durante
     * o inverno elas se recolhem ao nível do solo.
     */
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    private void dieDownForWinter() {
        setHeight(0);
    }

    public void doSpring() {
        grow();
        addYearToAge();
        logger.info("Spring: The tulip is starting to grow " + "up from the ground");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doSummer() {
        logger.info("Summer: The tulip has stopped growing " + "and is flowering");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doFall() {
        logger.info("Fall: The tulip begins to wilt");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doWinter() {
        dieDownForWinter();
        logger.info("Winter: The tulip is dormant underground");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
}