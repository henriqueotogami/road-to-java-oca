package oca.chapter07.inheritance.example02;

public class MP3Player extends MusicPlayer {

    @Override
    public void play() {
        logger.info("Tocando música MP3");
    }

    @Override
    public void stop() {
        logger.info("Parando música MP3");
    }
}
