package oca.chapter01.fundamentals.exemple04;

/**
 * <br>Interface que define o comportamento de acoplamento para naves.
 * <br>Qualquer classe que implemente esta interface deve fornecer uma implementação para o metodo dockShip().
 * @author henriqueotogami
 * @since 2026-02-12
 * @version 1.0
 * @see Example04Spaceship          Classe que representa uma nave espacial
 * @see Example04SpaceshipSimulator Classe que simula a criação de uma nave
 * @see Example04Ship               Classe abstrata que define as características básicas de uma nave
 */
public interface Example04Dockable {
    /**
     * Metodo para acoplar a nave.
     * A implementação deste metodo deve definir o comportamento específico de como a nave será acoplada.
     */
    public void dockShip ();
}
