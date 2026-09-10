package oca.chapter07.inheritance.example03;

import oca.chapter07.inheritance.example02.MusicPlayer;
import org.apache.logging.log4j.Logger;

/**
 * A interface {@code Phone} define o contrato para um dispositivo telefônico básico.
 * Permite realizar chamadas telefônicas e verificar o estado atual de uma ligação.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */
public interface Phone {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Phone.class);

    /**
     * Disca o número de telefone especificado para iniciar uma chamada.
     *
     * @param number o número de telefone a ser discado
     */
    public void dialNumber(int number);

    /**
     * Verifica se há uma chamada telefônica em andamento no momento.
     *
     * @return {@code true} se uma chamada estiver ativa; {@code false} caso contrário
     */
    public boolean isCallInProgress();
}