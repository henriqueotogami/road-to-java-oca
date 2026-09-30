package oca.chapter09.exceptions.example05;

import org.apache.logging.log4j.LogManager;

/**
 * Classe de exemplo de utilização de try/finally.
 *
 * @author henriqueotogami
 * @since 27/09/2026
 * @version 1.0
 */
public class TryFinally {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TryFinally.class);

    public String one() {
        String answer = "";
        try {
            answer += "Jab";
            logger.info(answer);
        } finally {
            answer += " and Roundhouse ";
            logger.info(answer);
        }
        return answer;
    }

    public String two() {
        String answer = "";
        try {
            answer += "Jab";
            logger.info(answer);
            System.exit(0);
        } finally {
            answer += " and Roundhouse ";
            logger.info(answer);
        }
        return answer;
    }

    public String three(){
        String answer = "Bread";
        logger.info(answer);
        try {
            throw new NumberFormatException(); //exceção não verificada
        } finally {
            answer += " and ";
            logger.info(answer); // essa instrução é executada!
        }
//            return answer;
//        answer += " butter";
//        logger.info(answer); // essa instrução não é alcançada
    }
}
