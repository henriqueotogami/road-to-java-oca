package oca.chapter05.methods.example01;

/**
 * <br>Classe de exemplo para métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class MathTools {

    public int findLowerValue(final int number1, final int number2) {
        int result;
        if (number1 < number2)
            result = number1;
        else
            result = number2;
        return result;
    }

    public double findLowerValue(final double number1, final double number2){
        double result;
        if(number1 < number2)
            result = number1;
        else
            result = number2;
        return result;
    }

}
