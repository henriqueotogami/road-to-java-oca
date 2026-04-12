package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo byte em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleByte {

    private byte passengers = 4;         // casting implícita de inteiro para byte
    private byte doors      = (byte) 2;  // casting explícita de inteiro para byte

    public byte getPassengers() { return this.passengers; }

    public byte getDoors() { return this.doors; }
}
