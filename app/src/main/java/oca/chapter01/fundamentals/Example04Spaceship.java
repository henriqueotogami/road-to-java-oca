package oca.chapter01.fundamentals;

/**
 * <br>Classe que representa uma nave espacial, estendendo a classe abstrata Example04Ship e implementando a interface Example04Dockable.
 * <br>Esta classe define o tipo de nave e o comportamento de acoplamento para a nave espacial.
 * @author henriqueotogami
 * @since 2026-02-12
 * @version 1.0
 * @see Example04Ship               Classe abstrata que define as características básicas de uma nave
 * @see Example04Dockable           Classe que define o comportamento de acoplamento para naves
 * @see Example04SpaceshipSimulator Classe que simula a criação de uma nave
 * @see ShipType                    Enumeração que define os tipos de naves disponíveis
 */
public class Example04Spaceship extends Example04Ship implements Example04Dockable {

    ShipType shipType = ShipType.BATTLESHIP;

    public Example04Spaceship() {
        super();
    }

    public Example04Spaceship(final ShipType shipType) {
        System.out.println("\nExample04Spaceship - SpaceShip created with specified ship type.");
        this.shipType = shipType;
    }

    @Override
    public void dockShip () {
        System.out.println("\ndockShip () - Docking the ship...");
    }

    @Override
    public String toString() {
        String shipTypeRefined = this.shipType.name().toLowerCase();
        return "toString() - The pirate ship is a " + shipTypeRefined + " ship.";
    }
}