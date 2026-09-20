package oca.chapter08.polymorphism.example02;

/**
 * <br>Exemplo de classe de bode para ilustrar polimorfismo em Java.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class Goat implements Describable{

    private String description;

    public Goat(String name){
        description = "A goat named " + name;
    }

    public String getDescription() {
        return description;
    }
}
