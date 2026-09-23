package oca.chapter08.polymorphism.example02;

/**
 * <br>Exemplo de classe de abrigo para bodes para ilustrar polimorfismo em Java.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class GoatShelter implements Describable {

    private String description;
    private int height;
    private int width;
    private int length;

    public GoatShelter (int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.description = "A goat shelter that is " + height + " high, " + length + " long and " + width + " wide ";
    }

    public String getDescription() {
        return description;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    /*
     * Implementa outros metodos relacionados ao abrigo de um bode
     */
}
