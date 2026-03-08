package oca.chapter01.fundamentals.exemple04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(Example04Spaceship.class);

    private ShipType shipType = ShipType.BATTLESHIP;
    private boolean isDocked = false;

    public Example04Spaceship() {
        super();
    }

    public Example04Spaceship(final ShipType shipType) {
        logger.info("Example04Spaceship - SpaceShip created with specified ship type.");
        this.shipType = shipType;
        this.isDocked = false;
    }

    @Override
    public void dockShip () {
        logger.info("dockShip () - Docking the ship...");
        this.isDocked = true;
    }

    @Override
    public String toString() {
        String shipTypeRefined = this.shipType.name().toLowerCase();
        return "toString() - The pirate ship is a " + shipTypeRefined + " ship.";
    }

    public String getShipType() { return this.shipType.name(); }

    /**
     * <br>Verifica se a nave está acoplada.
     * @return true se a nave estiver acoplada, false caso contrário.
     */
    public boolean isDocked() { return this.isDocked; }
}