package oca.chapter09.exceptions.example04;

import org.apache.logging.log4j.LogManager;

/**
 * Classe de exemplo de utilização de try/catch.
 *
 * @author henriqueotogami
 * @since 27/09/2026
 * @version 1.0
 */
public class TryCatch {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TryCatch.class);

    public void multi() throws NumberFormatException{
        try {
            logger.info("Codigo que faz alguma coisa");
            throw new NumberFormatException();
        } catch (NumberFormatException nfe) { // A exceção é capturada aqui
            logger.error("NumberFormatException: {}", nfe.getMessage());
//            nfe.printStackTrace();
            throw nfe;
        } catch (IllegalArgumentException iae) {
            logger.error("IllegalArgumentException: {}", iae.getMessage());
//            iae.printStackTrace();
        } catch (RuntimeException re) {
            logger.error("RuntimeException: {}", re.getMessage());
//            re.printStackTrace();
        } catch (Exception e) {
            logger.error("Exception: {}", e.getMessage());
//            e.printStackTrace();
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

    public static void main(String[] args) {
        TryCatch tryCatch = new TryCatch();
        tryCatch.one();
        tryCatch.multi();
    }
}
