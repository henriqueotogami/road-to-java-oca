package oca.chapter05.methods.example01;

/**
 * <br>Classe de exemplo para métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class MathTools {

    /**
     * Metodo para encontrar o menor valor entre dois números inteiros.
     *
     * @param number1 O primeiro número inteiro a ser comparado.
     * @param number2 O segundo número inteiro a ser comparado.
     * @return O menor valor entre os dois números inteiros fornecidos.
     */
    public int findLowerValue(final int number1, final int number2) {
        int result;
        if (number1 < number2)
            result = number1;
        else
            result = number2;
        return result;
    }

    /**
     * Metodo para encontrar o menor valor entre dois números de ponto flutuante.
     *
     * @param number1 O primeiro número de ponto flutuante a ser comparado.
     * @param number2 O segundo número de ponto flutuante a ser comparado.
     * @return O menor valor entre os dois números de ponto flutuante fornecidos.
     */
    public double findLowerValue(final double number1, final double number2){
        double result;
        if(number1 < number2)
            result = number1;
        else
            result = number2;
        return result;
    }

}
