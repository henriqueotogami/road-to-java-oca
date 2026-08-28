package oca.chapter07.inheritance.example02;

import org.apache.logging.log4j.Logger;

public abstract class MusicPlayer {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(MusicPlayer.class.getName());

    public abstract void play();
    public abstract void stop();

    public void changeVolume(int volumeLevel) {
        logger.info("Configurando o volume: " + volumeLevel);
    }
}