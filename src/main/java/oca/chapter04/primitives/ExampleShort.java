package oca.chapter04.primitives;

public class ExampleShort {

    private short unladenWeightInLbs = 2350;        // casting implícita para dois bytes
    private short capacityInCu       = (short) 427; // casting explícita para dois bytes

    public short getUnladenWeightInLbs() { return this.unladenWeightInLbs; }

    public short getCapacityInCu() { return this.capacityInCu;}
}