package oca.chapter01.fundamentals.exercise02.planets;

import oca.chapter01.fundamentals.exercise02.Planet;

/**
 * <br>Classe representando o planeta Marte.
 * <br>Marte é conhecido por sua superfície vermelha e condições inóspitas, tornando-o um dos planetas mais estudados em busca de sinais de vida passada ou presente.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 * @see Planet
 */
public class Mars implements Planet {

    public Mars() {
//        System.out.println("Mars was born!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Mars!");
    }

    @Override
    public boolean isHabitable() {
        return false;
    }
}
