package oca.chapter07.inheritance.example02;

public class CDPlayer extends MusicPlayer {

    @Override
    public void play() {
        logger.info("Tocando música de CD");
    }

    @Override
    public void stop() {
        logger.info("Parando música de CD");
    }
}
