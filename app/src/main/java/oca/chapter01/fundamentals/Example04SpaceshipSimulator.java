package oca.chapter01.fundamentals;

/**
 * <br>Exemplo de simulador de nave espacial em Java.
 * <br>Esta classe cria objetos da classe Example04Spaceship e exibe suas informações.
 * @author henriqueotogami
 * @since 2026-02-12
 * @version 1.0
 * @see Example04Spaceship  Classe que representa uma nave espacial
 * @see Example04Ship       Classe abstrata que define as características básicas de uma nave
 * @see Example04Dockable   Interface que define o comportamento de acoplamento para naves
 */
public class Example04SpaceshipSimulator {

    public static void main(String[] args) {

        // Cria um objeto SpaceShip com o tipo de nave padrão
        Example04Spaceship ship1 = new Example04Spaceship ();

        // Exibe "The pirate ship is a battleship."
        System.out.println(ship1);

        // Cria um objeto SpaceShip com o tipo de nave especificado
        Example04Spaceship ship2 = new Example04Spaceship (Example04Spaceship.ShipType.FRIGATE);

        // Exibe "The pirate ship is a frigate ship."
        System.out.println(ship2);
    }
}