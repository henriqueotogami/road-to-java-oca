package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo double em Java, incluindo coerção explícita e implícita.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleDouble {

    private double leafSpringCobraEngine = 4.7D;
    private double chyrsler331Engine     = 5.4d;
    private double ford427Engine         = (double) 7;
    private double ford428Engine         = 7.01;
    private double fordV8Engine          = 5;           // casting implícita de int para double

    public double getLeafSpringCobraEngine() { return this.leafSpringCobraEngine; }

    public double getChyrsler331Engine() { return this.chyrsler331Engine; }

    public double getFord427Engine() { return this.ford427Engine; }

    public double getFord428Engine() { return this.ford428Engine; }

    public double getFordV8Engine() { return this.fordV8Engine; }
}
