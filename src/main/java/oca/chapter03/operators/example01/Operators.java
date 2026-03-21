package oca.chapter03.operators.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para demonstrar operadores em Java.
 * <br>Esta classe é importante para ilustrar como os operadores funcionam em Java, incluindo operadores aritméticos, relacionais e de atribuição composta.
 *
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
public class Operators {

    public static final Logger logger = LogManager.getLogger(Operators.class);

    boolean hasTreasureChestKey = true;
    byte shipmates = 20;
    PirateShip ship = new PirateShip();

//    Já essas atribuições são inválidas e causarão erros de compilação:

    /* Literal inválido, TRUE deve estar em minúsculas */
//    boolean hasTreasureChestKey = TRUE;

    /* Literal inválido, o valor em bytes não pode exceder 127 */
//    byte shipmates = 500;

    /* Construtor inválido */
//    PirateShip ship = new PirateShip(UNEXPECTED_ARG);

    public int[] getAttribution() {
        final int marines   = 10;
        final int soldiers  = 20;
        final int totalCrew = marines + soldiers; // Atribuição usando o operador de adição
        return new int[]{ marines, soldiers, totalCrew };
    }

    /**
     * <br>Obtém o resultado de todas as atribuições compostas.
     * <br>Este metodo é importante para demonstrar como os operadores de atribuição composta funcionam em Java, mostrando como eles combinam uma operação com uma atribuição.
     *
     * @param a O valor inicial para as operações de atribuição composta.
     * @return Um array de bytes contendo os resultados de todas as atribuições compostas.
     */
    public byte[] getAllAttributionsComposite(byte a) {
        byte index = 0;
        final byte[] attributions = new byte[11];

        attributions[index++] = this.getAttributionSum(a += 5);
        attributions[index++] = this.getAttributionSubtraction(a += 5);
        attributions[index++] = this.getAttributionMultiplication(a += 5);
        attributions[index++] = this.getAttributionDivision(a += 5);
        attributions[index++] = this.getAttributionModulus(a += 5);

//      Opcional já que não faz parte do escopo do exame
        attributions[index++] = this.getAttributionAND(a += 5);
        attributions[index++] = this.getAttributionXOR(a += 5);
        attributions[index++] = this.getAttributionOR(a += 5);
        attributions[index++] = this.getAttributionLeftShift(a += 5);
        attributions[index++] = this.getAttributionRightShift(a += 5);
        attributions[index]   = this.getAttributionUnsignedRightShift(a += 5);

        return attributions;
    }

    /**
     * <br>Obtém o resultado de todas as operações aritméticas.
     * <br>Este metodo é importante para demonstrar como os operadores aritméticos funcionam em Java, mostrando como realizar operações básicas como adição, subtração, multiplicação, divisão e módulo.
     *
     * @param a O valor inicial para as operações aritméticas.
     * @return Um array de bytes contendo os resultados de todas as operações aritméticas.
     */
    public byte[] getAllArithmeticOperators(byte a) {
        return new byte[]{
                this.getArithmeticOperatorSum(a += 5),
                this.getArithmeticOperatorSubtraction(a += 5),
                this.getArithmeticOperatorMultiplication(a += 5),
                this.getArithmeticOperatorDivision(a += 5),
                this.getArithmeticOperatorModulus(a += 5)
        };
    }

    /**
     * <br>Obtém o resultado de todas as operações relacionais.
     * <br>Este metodo é importante para demonstrar como os operadores relacionais funcionam em Java, mostrando como comparar valores usando operadores como maior que, menor que, maior ou igual, menor ou igual, igual e diferente.
     *
     * @param a O valor inicial para as operações relacionais.
     * @return Um array de booleanos contendo os resultados de todas as operações relacionais.
     */
    public boolean[] getAllRelationalOperators(byte a) {
        return new boolean[]{
                this.getRelationalOperatorGreaterThan(a += 5),
                this.getRelationalOperatorLessThan(a += 5),
                this.getRelationalOperatorGreaterThanOrEqual(a += 5),
                this.getRelationalOperatorLessThanOrEqual(a += 5),
                this.getRelationalOperatorEqual(a += 5),
                this.getRelationalOperatorNotEqual(a += 5)
        };
    }

    /**
     * <br>Obtém o resultado de todas as operações relacionais envolvendo caracteres.
     * <br>Este metodo é importante para demonstrar como os operadores relacionais funcionam com caracteres em Java, mostrando como comparar caracteres usando diferentes tipos de literais.
     *
     * @return Um array de booleanos contendo os resultados de todas as operações relacionais envolvendo caracteres.
     */
    public boolean[] getAllRelationalOperatorsWithChar() {
        return new boolean[]{
                this.getRelationalOperatorCHAR(),
                this.getRelationalOperatorUNICODE(),
                this.getRelationalOperatorHEXADECIMAL(),
                this.getRelationalOperatorINTEGER(),
                this.getRelationalOperatorOCTAL(),
                this.getRelationalOperatorCharAndOctal()
        };
    }

    /**
     * <br>Obtém o resultado de todas as operações relacionais envolvendo objetos.
     * <br>Este metodo é importante para demonstrar como os operadores relacionais funcionam com objetos em Java, mostrando as diferenças entre comparação de referências e comparação de conteúdo.
     *
     * @return Um array de booleanos contendo os resultados de todas as operações relacionais envolvendo objetos.
     */
    public boolean[] getAllRelationalOperatorsWithObjects() {
        return new boolean[]{
                this.getRelationalOperatorObjects(),
                this.getRelationalOperatorObjectsCompareTo(),
                this.getRelationalOperatorObjectsEquals(),
                this.getRelationalOperatorSameCopyObject()
        };
    }

    public boolean getRelationalOperatorObjects() {
        final Object object1 = new Object();
        final Object object2 = new Object();
        final boolean areObjectsEqual = (object1 == object2); // Comparação de referências
        logger.info("Operador Relacional (==) = object1 == object2 = {}", areObjectsEqual);
        return areObjectsEqual;
    }

    public boolean getRelationalOperatorObjectsCompareTo() {
        final String object1 = "Hello";
        final String object2 = "Hello";
        final boolean areStringsEqualUsingEquals = (object1.compareTo(object2) == 0); // Comparação usando compareTo
        logger.info("Operador Relacional (compareTo) = object1.compareTo(object2) == 0 = {}", areStringsEqualUsingEquals);
        return areStringsEqualUsingEquals;
    }

    public boolean getRelationalOperatorObjectsEquals() {
        final String object1 = "Hello";
        final String object2 = "Hello";
        final boolean areStringsEqualUsingEquals = object1.equals(object2); // Comparação usando equals
        logger.info("Operador Relacional (equals) = object1.equals(object2) = {}", areStringsEqualUsingEquals);
        return areStringsEqualUsingEquals;
    }

    public boolean getRelationalOperatorSameCopyObject() {
        final String original = "Hello";
        final String copy = original; // Ambas as variáveis referenciam o mesmo objeto
        final boolean areSameReference = original.equals(copy); // Comparação de referências
        logger.info("Operador Relacional (==) = original == copy = {}", areSameReference);
        return areSameReference;
    }

    public boolean getRelationalOperatorCHAR() {
        final boolean isBGreaterThanA = ('A' < 'B'); // Literais de caracteres
        logger.info("Operador Relacional (<) = 'A' < 'B' = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorUNICODE() {
        final boolean isBGreaterThanA = ('\u0041' < '\u0042'); // Literais Unicode
        logger.info("Operador Relacional (<) = '\\u0041' < '\\u0042' = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorHEXADECIMAL() {
        final boolean isBGreaterThanA = (0x0041 < 0x0042); // Literais hexadecimais
        logger.info("Operador Relacional (<) = 0x0041 < 0x0042 = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorINTEGER() {
        final boolean isBGreaterThanA = (65 < 66); // Literais inteiros que cabem em um char
        logger.info("Operador Relacional (<) = 65 < 66 = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorOCTAL() {
        final boolean isBGreaterThanA = (0101 < 0102); //Literais octais
        logger.info("Operador Relacional (<) = 0101 < 0102 = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorCharAndOctal() {
        final boolean isBGreaterThanA = ('A' < 0102); // Literais de caractere e octal
        logger.info("Operador Relacional (<) = 'A' < 0102 = {}", isBGreaterThanA);
        return isBGreaterThanA;
    }

    public boolean getRelationalOperatorGreaterThan(byte a) {
        final boolean isGreater = (a > 3);
        logger.info("Operador Relacional (>) = {} > 3 = {}", a, isGreater);
        return isGreater;
    }

    public boolean getRelationalOperatorLessThan(byte a) {
        final boolean isLess = (a < 3);
        logger.info("Operador Relacional (<) = {} < 3 = {}", a, isLess);
        return isLess;
    }

    public boolean getRelationalOperatorGreaterThanOrEqual(byte a) {
        final boolean isGreaterThanOrEqual = (a >= 3);
        logger.info("Operador Relacional (>=) = {} >= 3 = {}", a, isGreaterThanOrEqual);
        return isGreaterThanOrEqual;
    }

    public boolean getRelationalOperatorLessThanOrEqual(byte a) {
        final boolean isLessThanOrEqual = (a <= 3);
        logger.info("Operador Relacional (<=) = {} <= 3 = {}", a, isLessThanOrEqual);
        return isLessThanOrEqual;
    }

    public boolean getRelationalOperatorEqual(byte a) {
        final boolean isEqual = (a == 3);
        logger.info("Operador Relacional (==) = {} == 3 = {}", a, isEqual);
        return isEqual;
    }

    public boolean getRelationalOperatorNotEqual(byte a) {
        final boolean isNotEqual = (a != 3);
        logger.info("Operador Relacional (!=) = {} != 3 = {}", a, isNotEqual);
        return isNotEqual;
    }

    public byte getArithmeticOperatorSum(byte a) {
//        Atribuição Aritmética = 5 + 3 = 8
        final byte sum = (byte) (a + 3);
        logger.info("Atribuição Aritmética = {} + 3 = {}", a, sum);
        return sum;
    }

    public byte getArithmeticOperatorSubtraction(byte a) {
//        Atribuição Aritmética = 10 - 3 = 7
        final byte subtraction = (byte) (a - 3);
        logger.info("Atribuição Aritmética = {} - 3 = {}", a, subtraction);
        return subtraction;
    }

    public byte getArithmeticOperatorMultiplication(byte a) {
//        Atribuição Aritmética = 15 * 3 = 45
        final byte multiplication = (byte) (a * 3);
        logger.info("Atribuição Aritmética = {} * 3 = {}", a, multiplication);
        return multiplication;
    }

    public byte getArithmeticOperatorDivision(byte a) {
//        Atribuição Aritmética = 20 / 3 = 6 (divisão inteira)
        final byte division = (byte) (a / 3);
        logger.info("Atribuição Aritmética = {} / 3 = {}", a, division);
        return division;
    }

    public byte getArithmeticOperatorModulus(byte a) {
//        Atribuição Aritmética = 25 % 3 = 1
        final byte modulus = (byte) (a % 3);
        logger.info("Atribuição Aritmética = {} % 3 = {}", a, modulus);
        return modulus;
    }

    public byte getAttributionUnsignedRightShift(byte a) {
        final byte unsignedRightShift = (a >>>= 3);
//        Deslocamento à direita sem sinal
//        60 = 3 = 60 >>> 3 = 00111100 >>> 3 = 00000111 = 7
        logger.info("Atribuição Composta (>>>=) = 60 >>>= 3 = 60 >>> 3 = {}", unsignedRightShift);
        return unsignedRightShift;
    }

    public byte getAttributionRightShift(byte a) {
        final byte rightShift = (a >>= 3);
//        Deslocamento à direita
//        55 = 3 = 55 >> 3 = 00110111 >> 3 = 00000110 = 6
        logger.info("Atribuição Composta (>>=) = 55 >>= 3 = 55 >> 3 = {}", rightShift);
        return rightShift;
    }

    public byte getAttributionLeftShift(byte a) {
        final byte leftShift = (a <<= 3);
//        Deslocamento à esquerda
//        50 = 3 = 50 << 3 = 00110010 << 3 = 11001000 = 400
        logger.info("Atribuição Composta (<<=) = 50 <<= 3 = 50 * 2^3 = {}", leftShift);
        return leftShift;
    }

    public byte getAttributionOR(byte a) {
        final byte or = (a |= 3);
//        Lógica OR
//        45 = 3 = 45 | 3 = 00101101 | 00000011 = 00101111 = 47
        logger.info("Atribuição Composta (|=) = 45 |= 3 = 45 | 3 = {}", or);
        return or;
    }

    public byte getAttributionXOR(byte a) {
        final byte xor = (a ^= 3);
//        Lógica XOR
//        40 = 3 = 40 ^ 3 = 00101000 ^ 00000011 = 00101011 = 43
        logger.info("Atribuição Composta (^=) = 40 ^= 3 = 40 ^ 3 = {}", xor);
        return xor;
    }

    public byte getAttributionAND(byte a) {
        final byte and = (a &= 3);
//        Lógica AND
//        35 = 3 = 35 & 3 = 00100011 & 00000011 = 00000011 = 3
        logger.info("Atribuição Composta (&=) = 35 &= 3 = 35 & 3 = {}", and);
        return and;
    }

    public byte getAttributionModulus(byte a) {
        final byte modulus = (a %= 3);
//        30 = 3 = 30 % 3 = 30 % 3 = 0
        logger.info("Atribuição Composta (%=) = 30 %= 3 = 30 % 3 = {}", modulus);
        return modulus;
    }

    public byte getAttributionDivision(byte a) {
        final byte division = (a /= 3);
//        Atribuição Composta (/=) = 25 /= 3 = 25 / 3 = 8 (divisão inteira)
        logger.info("Atribuição Composta (/=) = 25 /= 3 = 25 / 3 = {}", division);
        return division;
    }

    public byte getAttributionMultiplication(byte a) {
        final byte multiplication = (a *= 3);
//        Atribuição Composta (*=) = 20 *= 3 = 20 * 3 = 60
        logger.info("Atribuição Composta (*=) = 20 *= 3 = 20 * 3 = {}", multiplication);
        return multiplication;
    }

    public byte getAttributionSubtraction(byte a) {
        final byte subtraction = (a -= 3);
//        Atribuição Composta (-=) = 15 -= 3 = 15 - 3 = 12
        logger.info("Atribuição Composta (-=) = 15 -= 3 = 15 - 3 = {}", subtraction);
        return subtraction;
    }

    public byte getAttributionSum(byte a) {
        final byte sum = (a += 3);
//        Atribuição Composta (+=) = 10 += 3 = 10 + 3 = 13
        logger.info("Atribuição Composta (+=) = 10 += 3 = 10 + 3 = {}", sum);
        return sum;
    }
}
