package oca.chapter07.inheritance.example07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A classe {@code MapleTree} representa uma árvore de bordo e estende a classe {@link Plant}.
 * Esta classe implementa o crescimento da árvore ao longo das estações do ano.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class MapleTree extends Plant {
    private static final Logger logger = LogManager.getLogger(MapleTree.class);
    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

    /*
     * Uma árvore cresce em direção ao alto alguns centímetros por ano.
     * Uma árvore não se recolhe ao nível do solo durante o inverno.
     */
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    public void doSpring() {
        grow();
        addYearToAge();
        logger.info("Spring: The maple tree is starting to grow " + "leaves and new branches");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doSummer() {
        grow();
        logger.info("Summer: The maple tree is continuing to grow");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doFall() {
        logger.info("Fall: The maple tree has stopped growing" + " and is losing its leaves");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doWinter() {
        logger.info("Winter: The maple tree is dormant");
        logger.info("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
}