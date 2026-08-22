package oca.chapter07.inheritance.example01;

import org.apache.logging.log4j.Logger;

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
