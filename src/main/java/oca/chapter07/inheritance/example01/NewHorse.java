package oca.chapter07.inheritance.example01;

/**
 * <br>Exemplo de classe NewHorse para ilustrar herança em Java.
 *
 * @author henriqueotogami
 * @since 2026-08-22
 * @version 0.9
 */
public class NewHorse extends Animal {

    public void neigh() {
        logger.info("Relincha");
    }

    @Override
    public void rest() {
        logger.info("Descansa em pé");
    }
}
