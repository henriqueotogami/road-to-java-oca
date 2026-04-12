package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo float em Java, incluindo coerção explícita e implícita.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleFloat {

    private float currentBid    = 80100.99F;
    private float openingBid    = 20000.00f;
    private float reservePrice  = (float) 92000;
    private float myBid         = 36000;            // casting implícita de int para float

    public float getCurrentBid() { return this.currentBid; }

    public float getOpeningBid() { return this.openingBid; }

    public float getReservePrice() { return this.reservePrice; }

    public float getMyBid() { return this.myBid; }
}