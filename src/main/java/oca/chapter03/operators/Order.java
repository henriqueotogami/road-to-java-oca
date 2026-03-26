package oca.chapter03.operators;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para demonstrar a ordem de precedência dos operadores em Java.
 * <br>Esta classe é importante para ilustrar como a ordem de precedência dos operadores afeta a avaliação das expressões em Java.
 *
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
public class Order {

    public static final Logger logger = LogManager.getLogger(Order.class.getName());

    public void printRelativityPriority() {
        logger.info("Precedencia | 01 | - Operador []   - Índice de Array");
        logger.info("Precedencia | 01 | - Operador ()   - Chamada de Método");
        logger.info("Precedencia | 01 | - Operador .    - Acesso atributo ou método");

        logger.info("Precedencia | 02 | - Operador ++   - Pós-incremento");
        logger.info("Precedencia | 02 | - Operador --   - Pós-decremento");
        logger.info("Precedencia | 02 | - Operador +    - Sinal de mais unário");

        logger.info("Precedencia | 03 | - Operador ++   - Pré-incremento");
        logger.info("Precedencia | 03 | - Operador --   - Pré-decremento");
        logger.info("Precedencia | 03 | - Operador !    - Negação");
        logger.info("Precedencia | 03 | - Operador ~    - Complemento bit a bit");

        logger.info("Precedencia | 04 | - Operador (tipo) - Conversão de tipo");
        logger.info("Precedencia | 04 | - Operador new    - Criação de objeto");

        logger.info("Precedencia | 05 | - Operador *      - Multiplicação");
        logger.info("Precedencia | 05 | - Operador /      - Divisão");
        logger.info("Precedencia | 05 | - Operador %      - Resto da divisão");

        logger.info("Precedencia | 06 | - Operador +      - Adição");
        logger.info("Precedencia | 06 | - Operador -      - Subtração");
        logger.info("Precedencia | 06 | - Operador +      - Concatenação de Strings");

        logger.info("Precedencia | 07 | - Operador <<     - Deslocamento à esquerda");
        logger.info("Precedencia | 07 | - Operador >>     - Deslocamento à direita com sinal");
        logger.info("Precedencia | 07 | - Operador >>>    - Deslocamento à direita sem sinal");

        logger.info("Precedencia | 08 | - Operador <      - Menor que");
        logger.info("Precedencia | 08 | - Operador >      - Maior que");
        logger.info("Precedencia | 08 | - Operador <=     - Menor ou igual a");
        logger.info("Precedencia | 08 | - Operador >=     - Maior ou igual a");
        logger.info("Precedencia | 08 | - Operador instanceof - Verificação de tipo");

        logger.info("Precedencia | 09 | - Operador ==     - Igualdade");
        logger.info("Precedencia | 09 | - Operador !=     - Desigualdade");
        logger.info("Precedencia | 09 | - Operador ==     - Igualdade de referência");
        logger.info("Precedencia | 09 | - Operador !=     - Desigualdade de referência");

        logger.info("Precedencia | 10 | - Operador &      - AND bitwise");
        logger.info("Precedencia | 10 | - Operador &      - AND booleano");

        logger.info("Precedencia | 11 | - Operador ^      - XOR bitwise");
        logger.info("Precedencia | 11 | - Operador ^      - XOR booleano");

        logger.info("Precedencia | 12 | - Operador |      - OR bitwise");
        logger.info("Precedencia | 12 | - Operador |      - OR booleano");

        logger.info("Precedencia | 13 | - Operador &&     - AND lógico");

        logger.info("Precedencia | 14 | - Operador ||     - OR lógico");

        logger.info("Precedencia | 15 | - Operador ?:     - Operador ternário");

        logger.info("Precedencia | 16 | - Operador =      - Atribuição");
        logger.info("Precedencia | 16 | - Operador +=     - Atribuição de adição");
        logger.info("Precedencia | 16 | - Operador -=     - Atribuição de subtração");
        logger.info("Precedencia | 16 | - Operador *=     - Atribuição de multiplicação");
        logger.info("Precedencia | 16 | - Operador /=     - Atribuição de divisão");
        logger.info("Precedencia | 16 | - Operador %=     - Atribuição de resto da divisão");
        logger.info("Precedencia | 16 | - Operador &=     - Atribuição de AND bitwise");
        logger.info("Precedencia | 16 | - Operador ^=     - Atribuição de XOR bitwise");
        logger.info("Precedencia | 16 | - Operador |=     - Atribuição de OR bitwise");
        logger.info("Precedencia | 16 | - Operador <<=    - Atribuição de deslocamento à esquerda");
        logger.info("Precedencia | 16 | - Operador >>=    - Atribuição de deslocamento à direita com sinal");
        logger.info("Precedencia | 16 | - Operador >>>=   - Atribuição de deslocamento à direita sem sinal");
    }
}
