package oca.chapter05.methods.example03;

import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para referencia de objetos e valor em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class Number {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Number.class.getName());
    private int number = 0;

    public Number(int number) {
        this.number = number;
    }

    /**
     * Metodo para obter o valor do número.
     *
     * @return O valor do número.
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Metodo para configurar o valor do número.
     *
     * @param number O valor a ser configurado para o número.
     */
    public void setNumber(final int number) {
        this.number = number;
    }

    /**
     * Metodo para adicionar 2 ao valor do número.
     */
    public void addTwo(int value) {
        logger.info("Parameter: value = {}", value);
        value = value + 2;
        logger.info("Leaving method: value = {}", value);
    }

    public void addThree(Number value) {
        logger.info("Parameter: value = {}", value.getNumber());
        value.setNumber(value.getNumber() + 3);
        logger.info("Leaving method: value = {}", value.getNumber());
    }

}
