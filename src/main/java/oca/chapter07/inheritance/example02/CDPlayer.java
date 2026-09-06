package oca.chapter07.inheritance.example02;

/**
 * Classe que representa um CD player, como exemplo de implementação de classe abstrata MusicPlayer.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */

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
