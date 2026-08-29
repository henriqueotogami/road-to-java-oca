package oca.chapter07.inheritance.example06;

/**
 * Classe que representa uma bicicleta.
 * Esta classe fornece métodos para calcular a rotação da roda com base na rotação do pedal e para obter e definir o grau de giro da bicicleta.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class Bicycle {

    private float wheelRPM;
    private int degreeOfTurn;

    public void pedalRPM(float pedalRPM) {
        float gearRatio = 2f;
        this.wheelRPM = pedalRPM * gearRatio;
    }

    public float getWheelRPM() {
        return this.wheelRPM;
    }

    public int getDegreeOfTurn() {
        return this.degreeOfTurn;
    }

    public void setDegreeOfTurn(int degreeOfTurn) {
        this.degreeOfTurn = degreeOfTurn;
    }

}