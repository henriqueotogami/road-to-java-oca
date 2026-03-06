package oca.chapter01.fundamentals.exercise02.planets;

import oca.chapter01.fundamentals.exercise02.Planet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe representando o planeta Marte.
 * <br>Marte é conhecido por sua superfície vermelha e condições inóspitas, tornando-o um dos planetas mais estudados em busca de sinais de vida passada ou presente.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 * @see Planet
 */
public class Mars implements Planet {

    private static final Logger logger = LogManager.getLogger(Mars.class);
    
    public Mars() {
        logger.info("Mars was born!");
    }

    @Override
    public void sayHello() {
        logger.info("Hello from Mars!");
    }

    @Override
    public boolean isHabitable() {
        return false;
    }
}
