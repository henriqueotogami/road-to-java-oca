package oca.chapter03.operators.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Classe de exemplo para demonstrar operadores em Java.
 * <br>Esta classe é importante para ilustrar como os operadores funcionam em Java, incluindo operadores aritméticos, relacionais e de atribuição composta.
 *
 * @see oca.chapter03.operators.example01.MainOperators
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
public class Operators extends MainOperators {

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


    public Operators() {
        this.setLogger(logger);
    }

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

        attributions[index++] = this.getAttributionSum(this.increment(a, 5));
        attributions[index++] = this.getAttributionSubtraction(this.increment(a, 5));
        attributions[index++] = this.getAttributionMultiplication(this.increment(a, 5));
        attributions[index++] = this.getAttributionDivision(this.increment(a, 5));
        attributions[index++] = this.getAttributionModulus(this.increment(a, 5));

//      Opcional já que não faz parte do escopo do exame
        attributions[index++] = this.getAttributionAND(this.increment(a, 5));
        attributions[index++] = this.getAttributionXOR(this.increment(a, 5));
        attributions[index++] = this.getAttributionOR(this.increment(a, 5));
        attributions[index++] = this.getAttributionLeftShift(this.increment(a, 5));
        attributions[index++] = this.getAttributionRightShift(this.increment(a, 5));
        attributions[index]   = this.getAttributionUnsignedRightShift(this.increment(a, 5));

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
                this.getArithmeticOperatorSum(this.increment(a, 5)),
                this.getArithmeticOperatorSubtraction(this.increment(a, 5)),
                this.getArithmeticOperatorMultiplication(this.increment(a, 5)),
                this.getArithmeticOperatorDivision(this.increment(a, 5)),
                this.getArithmeticOperatorModulus(this.increment(a, 5))
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
                this.getRelationalOperatorGreaterThan(this.increment(a, 5)),
                this.getRelationalOperatorLessThan(this.increment(a, 5)),
                this.getRelationalOperatorGreaterThanOrEqual(this.increment(a, 5)),
                this.getRelationalOperatorLessThanOrEqual(this.increment(a, 5)),
                this.getRelationalOperatorEqual(this.increment(a, 5)),
                this.getRelationalOperatorNotEqual(this.increment(a, 5))
        };
    }

    private byte increment(int a, int increment) {
        return (byte) (a += increment);
    }

    /**
     * <br>Obtém o resultado de todas as operações relacionais envolvendo caracteres.
     * <br>Este metodo é importante para demonstrar como os operadores relacionais funcionam com caracteres em Java, mostrando como comparar caracteres usando diferentes tipos de literais.
     *
     * @return Um array de booleanos contendo os resultados de todas as operações relacionais envolvendo caracteres.
     */
    public boolean[] getAllRelationalOperatorsWithChar() {
        return new boolean[]{
                this.getRelationalOperatorCHAR('a', 'b'),
                this.getRelationalOperatorUNICODE('\u0041', '\u0042'),
                this.getRelationalOperatorHEXADECIMAL((byte) 0x0041, (byte) 0x0042),
                this.getRelationalOperatorINTEGER(65, 66),
                this.getRelationalOperatorOCTAL(0101, 0102),
                this.getRelationalOperatorCharAndOctal('A', 0102)
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
                this.getRelationalOperatorObjects(this, this),
                this.getRelationalOperatorObjectsCompareTo("Compare", "Compare"),
                this.getRelationalOperatorObjectsEquals("Equals", "Equals"),
                this.getRelationalOperatorSameCopyObject("Object")
        };
    }

    public boolean getLogicalOperatorNOT(final byte a, final byte b) {
        return this.isValidNOT(a, b);
    }

    public boolean getLogicalOperatorOR(final byte a, final byte b) {
        return this.isValidOR(a, b);
    }

    public boolean getLogicalOperatorAND(final byte a, final byte b) {
        return this.isValidAND(a, b);
    }

    public boolean getRelationalOperatorObjects(final Object object1, final Object object2) {
        // Comparação de referências
        final boolean areObjectsEqual = (object1 == object2);
        logger.info("Operador Relacional (==) = object1 == object2 = {}", areObjectsEqual);
        return areObjectsEqual;
    }

    public boolean getRelationalOperatorObjectsCompareTo(final String object1, final String object2) {
        // Comparação usando compareTo
        final boolean areStringsEqualUsingEquals = (object1.compareTo(object2) == 0);
        logger.info("Operador Relacional (compareTo) = object1.compareTo(object2) == 0 = {}", areStringsEqualUsingEquals);
        return areStringsEqualUsingEquals;
    }

    public boolean getRelationalOperatorObjectsEquals(final String object1, final String object2) {
        // Comparação usando equals
        final boolean areStringsEqualUsingEquals = object1.equals(object2);
        logger.info("Operador Relacional (equals) = object1.equals(object2) = {}", areStringsEqualUsingEquals);
        return areStringsEqualUsingEquals;
    }

    public boolean getRelationalOperatorSameCopyObject(final String original) {
        final String copy = original; // Ambas as variáveis referenciam o mesmo objeto
        final boolean areSameReference = original.equals(copy); // Comparação de referências
        logger.info("Operador Relacional (==) = original == copy = {}", areSameReference);
        return areSameReference;
    }

    public boolean getRelationalOperatorCHAR(final char a, final char b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorUNICODE(final char a, final char b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorHEXADECIMAL(final short a, final short b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorINTEGER(final int a, final int b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorOCTAL(final int a, final int b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorCharAndOctal(final char a, final int b) {
        return this.isGreater(a, b);
    }

    public boolean getRelationalOperatorGreaterThan(byte a) {
        return this.isGreater((byte) 3, a);
    }

    public boolean getRelationalOperatorLessThan(byte a) {
        return this.isLess((byte) 3, a);
    }

    public boolean getRelationalOperatorGreaterThanOrEqual(byte a) {
        return this.isGreaterOrEqual((byte) 3, a);
    }

    public boolean getRelationalOperatorLessThanOrEqual(byte a) {
        return this.isGreaterOrEqual(a, (byte) 3);
    }

    public boolean getRelationalOperatorEqual(byte a) {
        return this.isEqual(a, (byte) 3);
    }

    public boolean getRelationalOperatorNotEqual(byte a) {
        return this.isNotEqual(a, (byte) 3);
    }

    public byte getArithmeticOperatorSum(byte a) {
//        Atribuição Aritmética = 5 + 3 = 8
        return (byte) this.getSum(a, (byte) 3);
    }

    public byte getArithmeticOperatorSubtraction(byte a) {
//        Atribuição Aritmética = 10 - 3 = 7
        return (byte) this.getSubtraction(a, (byte) 3);
    }

    public byte getArithmeticOperatorMultiplication(byte a) {
//        Atribuição Aritmética = 15 * 3 = 45
        return (byte) this.getMultiplication(a, (byte) 3);
    }

    public byte getArithmeticOperatorDivision(byte a) {
//        Atribuição Aritmética = 20 / 3 = 6 (divisão inteira)
        return (byte) this.getDivision(a, (byte) 3);
    }

    public byte getArithmeticOperatorModulus(byte a) {
//        Atribuição Aritmética = 25 % 3 = 1
        return (byte) this.getModulus(a, (byte) 3);
    }

    public byte getAttributionUnsignedRightShift(byte a) {
//        Deslocamento à direita sem sinal
//        60 = 3 = 60 >>> 3 = 00111100 >>> 3 = 00000111 = 7
        return (byte) this.getUnsignedRightShift(a, (byte) 3);
    }

    public byte getAttributionRightShift(byte a) {
//        Deslocamento à direita
//        55 = 3 = 55 >> 3 = 00110111 >> 3 = 00000110 = 6
        return (byte) this.getRightShift(a, (byte) 3);
    }

    public byte getAttributionLeftShift(byte a) {
//        Deslocamento à esquerda
//        50 = 3 = 50 << 3 = 00110010 << 3 = 11001000 = 400
        return (byte) this.getLeftShift(a, (byte) 3);
    }

    public byte getAttributionOR(byte a) {
//        Lógica OR
//        45 = 3 = 45 | 3 = 00101101 | 00000011 = 00101111 = 47
        return (byte) this.getOR(a, (byte) 3);
    }

    public byte getAttributionXOR(byte a) {
//        Lógica XOR
//        40 = 3 = 40 ^ 3 = 00101000 ^ 00000011 = 00101011 = 43
        return (byte) this.getXOR(a, (byte) 3);
    }

    public byte getAttributionAND(byte a) {
//        Lógica AND
//        35 = 3 = 35 & 3 = 00100011 & 00000011 = 00000011 = 3
        return (byte) this.getAND(a, (byte) 3);
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
