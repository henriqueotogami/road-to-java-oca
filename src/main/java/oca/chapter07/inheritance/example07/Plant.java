package oca.chapter07.inheritance.example07;

/**
 * Classe abstrata que representa uma planta.
 * Esta classe fornece métodos para obter e definir a idade e altura da planta, bem como métodos abstratos para simular o crescimento da planta em diferentes estações do ano.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public abstract class Plant {

    private int age=0;
    private int height=0;

    public int getAge() {
        return age;
    }

    public void addYearToAge() {
        age++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    abstract public void doSpring();
    abstract public void doSummer();
    abstract public void doFall();
    abstract public void doWinter();
}