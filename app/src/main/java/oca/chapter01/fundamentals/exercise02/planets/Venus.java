package oca.chapter01.fundamentals.exercise02.planets;

import oca.chapter01.fundamentals.exercise02.Planet;

/**
 * <br>Classe representando o planeta Venus.
 * <br>Venus é conhecido por sua atmosfera densa e temperaturas extremas, tornando-o inóspito para a vida como conhecemos.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 * @see Planet
 */
public class Venus implements Planet {

    public Venus() {
//        System.out.println("Venus was born!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Venus!");
    }

    @Override
    public boolean isHabitable() {
        return false;
    }
}
