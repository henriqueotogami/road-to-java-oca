package oca.chapter05.methods.example09;

/**
 * <br>Classe de exemplo para métodos estáticos em Java, demonstrando a criação de uma classe ShippingPackage com um método estático para gerar números de rastreamento.
 *
 * @author henriqueotogami
 * @since 2026-04-20
 * @version 0.5
 */
public class ShippingPackage {

    public static int nextTrackingNumber = 100000;
    private int packageTrackingNumber;

    public ShippingPackage() {
        this.packageTrackingNumber = this.nextTrackingNumber;
        this.nextTrackingNumber++;
    }

    public int getPackageTrackingNumber(){
        return this.packageTrackingNumber;
    }

}
