package oca.chapter01.fundamentals.exercise02.planets;

import oca.chapter01.fundamentals.exercise02.Planet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe representando o planeta Venus.
 * <br>Venus é conhecido por sua atmosfera densa e temperaturas extremas, tornando-o inóspito para a vida como conhecemos.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 * @see Planet
 */
public class Venus implements Planet {

    private static final Logger logger = LogManager.getLogger(Venus.class);
    
    public Venus() {
        logger.info("Venus was born!");
    }

    @Override
    public void sayHello() {
        logger.info("Hello from Venus!");
    }

    @Override
    public boolean isHabitable() {
        return false;
    }
}
