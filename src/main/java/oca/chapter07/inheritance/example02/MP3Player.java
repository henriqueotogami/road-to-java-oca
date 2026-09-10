package oca.chapter07.inheritance.example02;

/**
 * Classe que representa um MP3 player, como exemplo de implementação de classe abstrata MusicPlayer.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */
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
