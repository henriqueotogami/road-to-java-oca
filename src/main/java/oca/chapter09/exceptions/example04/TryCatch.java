package oca.chapter09.exceptions.example04;

import org.apache.logging.log4j.LogManager;

import java.util.Random;

/**
 * Classe de exemplo de utilização de try/catch.
 *
 * @author henriqueotogami
 * @since 27/09/2026
 * @version 1.0
 */
public class TryCatch {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TryCatch.class);

    public void multi(final int whichTrow) throws NumberFormatException{
        try {
            logger.info("Codigo que faz alguma coisa");
            if(whichTrow == 1) throw new NumberFormatException();
            if(whichTrow == 2) throw new IllegalArgumentException();
        } catch (NumberFormatException nfe) { // A exceção é capturada aqui
            logger.error("NumberFormatException: {}", nfe.getMessage());
            throw nfe;
        } catch (IllegalArgumentException iae) {
            logger.error("IllegalArgumentException: {}", iae.getMessage());
            throw iae;
        } catch (RuntimeException re) {
            logger.error("RuntimeException: {}", re.getMessage());
            throw re;
        } catch (Exception e) {
            logger.error("Exception: {}", e.getMessage());
        }
    }

    public void one() throws ArithmeticException {
        try {
            int result = (3 / 0); // lança ArithmeticException
        } catch (ArithmeticException ae) {
            logger.info("ArithmeticException - message: {} | {}", ae.getMessage(), ae.toString());
//            ae.printStackTrace();
            throw ae;
        }
    }
}
