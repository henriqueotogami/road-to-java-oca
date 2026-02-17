package oca.chapter01.fundamentals.exemple04;

/**
 * <br>Classe abstrata que define as características básicas de uma nave.
 * <br>Esta classe é estendida pela classe Example04Spaceship, que representa uma nave espacial específica.
 * @author henriqueotogami
 * @since 2026-02-12
 * @version 1.0
 * @see Example04Spaceship          Classe que representa uma nave espacial
 * @see Example04SpaceshipSimulator Classe que simula a criação de uma nave
 * @see Example04Dockable           Interface que define o comportamento de acoplamento para naves
 */
public abstract class Example04Ship {

    public enum ShipType {
        FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
    }

    public Example04Ship() {
        System.out.println("\nExample04Ship() - Ship created with default ship type.");
    }
}