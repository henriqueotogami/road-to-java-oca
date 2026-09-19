package oca.chapter08.polymorphism.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de classe Phone para ilustrar polimorfismo em Java.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class Phone {

    public static final Logger logger = LogManager.getLogger(Phone.class.getName());

    public void callNumber(long number) {
        logger.info("Phone: Calling number " + number);
        /* Lógica para discar número e manter conexão. */
    }

    public boolean isRinging() {
        logger.info("Phone: Checking if phone is ringing");
        boolean ringing = false;
        /* Verifica se o telefone está chamando e configura a variável ringing */
        return ringing;
    }

}
