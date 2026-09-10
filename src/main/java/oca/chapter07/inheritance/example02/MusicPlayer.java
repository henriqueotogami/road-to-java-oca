package oca.chapter07.inheritance.example02;

import org.apache.logging.log4j.Logger;

/**
 * Classe abstrata que representa um reprodutor de musica.
 * Esta classe define os metodos essenciais para tocar e parar a musica, bem como um metodo para alterar o volume.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */

public abstract class MusicPlayer {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(MusicPlayer.class.getName());

    public abstract void play();
    public abstract void stop();

    public void changeVolume(int volumeLevel) {
        logger.info("Configurando o volume: " + volumeLevel);
    }
}