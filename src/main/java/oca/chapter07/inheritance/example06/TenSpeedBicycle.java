package oca.chapter07.inheritance.example06;

/**
 * Classe que representa uma bicicleta de 10 marchas.
 * Esta classe estende a classe Bicycle, fornecendo a funcionalidade de definir a relação de marchas e calcular a rotação da roda com base na rotação do pedal.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class TenSpeedBicycle extends Bicycle {

    private float gearRatio = 2f;
    private float wheelRPM;

    public void setGearRatio(float gearRatio) {
        this.gearRatio = gearRatio;
    }

    public void pedalRPM(float pedalRPM) {
        this.wheelRPM = pedalRPM * gearRatio;

    }

    public float getWheelRPM() {
        return this.wheelRPM;
    }
}