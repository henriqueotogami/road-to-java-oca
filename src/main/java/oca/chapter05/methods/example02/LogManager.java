package oca.chapter05.methods.example02;

import org.apache.logging.log4j.Logger;

/*
 * <br>Classe de exemplo para métodos sobrecarregados em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class LogManager {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(LogManager.class.getName());

    /**
     * Metodo sobrecarregado para registrar mensagens de log com um número de erro.
     *
     * @param message     A mensagem de log a ser registrada.
     * @param errorNumber O número do erro associado à mensagem de log.
     */
    public void logInfo(String message, int errorNumber){
        logger.info("Error: {} | {}", errorNumber, message);
    }

    /**
     * Metodo sobrecarregado para registrar mensagens de log sem um número de erro.
     *
     * @param message A mensagem de log a ser registrada.
     */
    public void logInfo(String message){
        this.logInfo(message, -1);
    }
}
