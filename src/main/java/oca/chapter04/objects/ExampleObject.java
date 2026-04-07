package oca.chapter04.objects;

/**
 * <br>Exemplo de uso de objetos em Java, incluindo inicialização e acesso a métodos.
 *
 * @author henriqueotogami
 * @since 2026-04-06
 * @version 0.5
 */
public class ExampleObject {

    public static class Car {
        int topSpeed;
        boolean running;
        Car(int topSpeed, boolean running){
            this.running = running;
            this.topSpeed = topSpeed;
        }
        public boolean isRunning(){
            return running;
        }
    }

    // Isso é válido. Você pode usar o metodo isRunning porque o objeto foi inicializado.
    final Car bigCar              = new Car(125,true);
    final boolean isBigCarRunning = bigCar.isRunning();

    /* Esse exemplo também é válido. Você pode usar o metodo isRunning
    porque o objeto smallCar foi configurado com o mesmo objeto inicializado
    de bigCar. Isso fará com que smallCar e bigCar sejam o mesmo objeto. */

    final Car smallCar              = bigCar;
    final boolean isSmallCarRunning = smallCar.isRunning();

    /* Esse exemplo não é válido. Você não pode usar um metodo em um objeto não inicializado. */
    final Car oldCar              = null;
    final boolean isOldCarRunning = false; // oldCar.isRunning(); // Isso causaria um erro de compilação.

    public Car getBigCar() { return this.bigCar; }

    public boolean isBigCarRunning() { return this.isBigCarRunning; }

    public Car getSmallCar() { return this.smallCar; }

    public boolean isSmallCarRunning() { return this.isSmallCarRunning; }

    public Car getOldCar() { return this.oldCar; }

    public boolean isOldCarRunning() { return this.isOldCarRunning; }
}
