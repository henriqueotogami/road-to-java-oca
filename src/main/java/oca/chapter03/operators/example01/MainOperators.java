package oca.chapter03.operators.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para demonstrar operadores em Java.
 * <br>Esta classe é importante para ilustrar como os operadores funcionam em Java, incluindo operadores aritméticos, relacionais e de atribuição composta.
 *
 * @see Operators
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
public abstract class MainOperators {

    private Logger logger = LogManager.getLogger(MainOperators.class.getName());

    /**
     * Construtor padrão para a classe MainOperators.
     * Este construtor é necessário para permitir a criação de instâncias de subclasses que herdam desta classe.
     */
    public Logger getLogger() {
        return this.logger;
    }

    /**
     * Define o logger para a classe MainOperators.
     * Este metodo é útil para permitir a injeção de um logger personalizado, caso seja necessário.
     *
     * @param logger O logger a ser definido para esta classe.
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    protected boolean isGreater(final int a, final int b) {
        final boolean isGreater = (a < b);
        logger.info("Operador Relacional (<) = {} < {}  = {}", a, b, isGreater);
        return isGreater;
    }

    protected boolean isLess(final int a, final int b) {
        final boolean isLess = (a > b);
        logger.info("Operador Relacional (>) = {} > {}  = {}", a, b, isLess);
        return isLess;
    }

    protected boolean isGreaterOrEqual(final int a, final int b) {
        final boolean isGreaterOrEqual = (a <= b);
        logger.info("Operador Relacional (<=) = {} <= {}  = {}", a, b, isGreaterOrEqual);
        return isGreaterOrEqual;
    }

    protected boolean isLessOrEqual(final int a, final int b) {
        final boolean isLessOrEqual = (a >= b);
        logger.info("Operador Relacional (>=) = {} >= {}  = {}", a, b, isLessOrEqual);
        return isLessOrEqual;
    }

    protected boolean isEqual(final int a, final int b) {
        final boolean isEqual = (a == b);
        logger.info("Operador Relacional (==) = {} == {}  = {}", a, b, isEqual);
        return isEqual;
    }

    protected boolean isNotEqual(final int a, final int b) {
        final boolean isNotEqual = (a != b);
        logger.info("Operador Relacional (!=) = {} != {}  = {}", a, b, isNotEqual);
        return isNotEqual;
    }

    protected int getSum(final int a, final int b) {
        final int sum = a + b;
        logger.info("Operador Aritmético (+) = {} + {}  = {}", a, b, sum);
        return sum;
    }

    protected int getSubtraction(final int a, final int b) {
        final int subtraction = a - b;
        logger.info("Operador Aritmético (-) = {} - {}  = {}", a, b, subtraction);
        return subtraction;
    }

    protected int getMultiplication(final int a, final int b) {
        final int multiplication = a * b;
        logger.info("Operador Aritmético (*) = {} * {}  = {}", a, b, multiplication);
        return multiplication;
    }

    protected int getDivision(final int a, final int b) {
        final int division = a / b;
        logger.info("Operador Aritmético (/) = {} / {}  = {}", a, b, division);
        return division;
    }

    protected int getModulus(final int a, final int b) {
        final int modulus = a % b;
        logger.info("Operador Aritmético (%) = {} % {}  = {}", a, b, modulus);
        return modulus;
    }

    protected int getLeftShift(final int a, final int b) {
        final int leftShift = a << b;
        logger.info("Operador Aritmético (<<) = {} << {}  = {}", a, b, leftShift);
        return leftShift;
    }

    protected int getRightShift(final int a, final int b) {
        final int rightShift = a >> b;
        logger.info("Operador Aritmético (>>) = {} >> {}  = {}", a, b, rightShift);
        return rightShift;
    }

    protected int getUnsignedRightShift(final int a, final int b) {
        final int unsignedRightShift = a >>> b;
        logger.info("Operador Aritmético (>>>) = {} >>> {}  = {}", a, b, unsignedRightShift);
        return unsignedRightShift;
    }

    protected int getAND(final int a, final int b) {
        final int and = a & b;
        logger.info("Operador Aritmético (&) = {} & {}  = {}", a, b, and);
        return and;
    }

    protected int getOR(final int a, final int b) {
        final int or = a | b;
        logger.info("Operador Aritmético (|) = {} | {}  = {}", a, b, or);
        return or;
    }

    protected int getXOR(final int a, final int b) {
        final int xor = a ^ b;
        logger.info("Operador Aritmético (^) = {} ^ {}  = {}", a, b, xor);
        return xor;
    }

    protected boolean isValidAND(final byte a, final byte b) {
        final boolean isValid = (a > 0) && (b > 0);
        logger.info("Operador Lógico AND (&&) = {} && {}  = {}", a, b, isValid);
        return isValid;
    }

    protected boolean isValidOR(final byte a, final byte b) {
        final boolean isValid = (a > 0) || (b > 0);
        logger.info("Operador Lógico OR (||) = {} || {}  = {}", a, b, isValid);
        return isValid;
    }

    protected boolean isValidNOT(final byte a, final byte b) {
        final boolean isValid = !((a > 0) && (b > 0));
        logger.info("Operador Lógico NOT (!) = !({} > 0)  = {}", a, isValid);
        return isValid;
    }
}
