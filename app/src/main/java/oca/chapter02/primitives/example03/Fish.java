package oca.chapter02.primitives.example03;

/**
 * Classe representando um peixe, com um atributo para o tipo de peixe.
 * <p>
 * Esta classe é usada no exemplo de pesca para ilustrar o uso de objetos
 * e atributos em Java. O atributo {@code typeOfFish} é inicializado com um
 * valor padrão ("Striped Bass") e pode ser modificado usando o setter.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class Fish {

    private String typeOfFish = "Striped Bass";

    public String getTypeOfFish() { return this.typeOfFish; }

    public void setTypeOfFish(final String typeOfFish) { this.typeOfFish = typeOfFish; }
}
