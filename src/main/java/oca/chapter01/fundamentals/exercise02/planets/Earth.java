package oca.chapter01.fundamentals.exercise02.planets;

import oca.chapter01.fundamentals.exercise02.Planet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe representando o planeta Terra.
 * <br>A Terra é o terceiro planeta do sistema solar e o único conhecido por abrigar vida, graças à sua atmosfera rica em oxigênio e condições favoráveis.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 * @see Planet
 */
public class Earth implements Planet {

    private static final Logger logger = LogManager.getLogger(Earth.class);
    private boolean loggingEnabled = false;

    public Earth() {
//        logger.info("Earth was born!");
    }

    public void sayHello() {
        logger.info("Hello from Earth!");
    }

    public boolean isHabitable() { return true; }
}
