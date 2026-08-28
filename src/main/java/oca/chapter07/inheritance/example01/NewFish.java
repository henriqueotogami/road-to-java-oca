package oca.chapter07.inheritance.example01;

import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de classe NewFish para ilustrar herança em Java.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */
public class NewFish extends Animal {

    @Override
    public void move(int direction) {
        logger.info("Nada na direção " + direction);
    }

    @Override
    public void rest() {
        logger.info("Descansa debaixo d'água");
    }
}
