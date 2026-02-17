package oca.chapter01.fundamentals.exercise02;

import oca.chapter01.fundamentals.exercise02.planets.Earth;
import oca.chapter01.fundamentals.exercise02.planets.Mars;
import oca.chapter01.fundamentals.exercise02.planets.Venus;

/**
 * <br>Exercicio 2: Escreva um programa Java que imprima "Greetings, Universe!" no console.
 * <br>Este exercício é projetado para testar sua capacidade de compilar e executar um programa Java simples.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 */
public class Exercise02Compile {

    /**
     * <br>Etapas:
     * <br>- 01. Compilar o progama: javac Exercise02Compile.java
     * <br>- 02. Executar o programa: java -cp oca/chapter01/fundamentals/exercises/Exercise02Compile
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Greetings, Universe!");
        final Earth earth   = new Earth();
        final Mars mars     = new Mars();
        final Venus venus   = new Venus();
    }
}
