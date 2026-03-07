package oca.chapter02.primitives.exercise01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Esta classe demonstra o uso de estruturas de controle switch para validar uma string
 * e verificar seu tamanho. O metodo {@code main} solicita ao usuário que insira uma
 * string, e então chama os metodos {@code isInputValid} e {@code hasSizeValid} para
 * verificar se a string é "valid" e se tem exatamente 5 caracteres, respectivamente.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class ValidString {

    private static final Logger logger = LogManager.getLogger(ValidString.class);
    
    // Construa um programa pequeno que demonstre o uso da classe String sendo avaliada
    // em uma instrução switch. Siga o modelo que é usado para a instrução switch com os
    // outros tipos de dados e seu aplicativo será executado corretamente.
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        logger.info("Enter a string to be valid: ");
        final String userInput          = scanner.nextLine();
        final ValidString validString   = new ValidString();
        validString.isInputValid(userInput);
        validString.hasSizeValid(userInput);
    }

    private void hasSizeValid(String userInput) {
        switch(userInput.length()) {
            case 5:
                logger.info("This string has 5 characters.");
                break;
            default:
                logger.info("This string does not have 5 characters.");
                break;
        }
    }

    private void isInputValid(String userInput) {
        switch(userInput) {
            case "valid":
                logger.info("This string is valid.");
                break;
            default:
                logger.info("This string is not valid.");
                break;
        }
    }
}
