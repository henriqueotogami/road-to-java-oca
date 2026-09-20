package oca.chapter08.polymorphism.example02;

/**
 * <br>Interface que representa objetos capazes de fornecer uma descricao textual.
 * <br>
 * <br>Este contrato eh usado para demonstrar polimorfismo: classes como {@link Goat}
 * e {@link GoatShelter} podem ser tratadas pelo tipo {@code Describable}, permitindo
 * que cada implementacao retorne sua propria descricao por meio de {@link #getDescription()}.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public interface Describable {

    /**
     * Retorna a descricao textual especifica da implementacao.
     *
     * @return descricao do objeto que implementa esta interface
     */
    public String getDescription();

}
