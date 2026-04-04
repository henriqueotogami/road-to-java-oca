package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo int em Java, incluindo conversões implícitas e explícitas.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleInt {

    private int auctionPrice        = 7800000;
    
    private char cylinders          = '\u0008';
    private int cyl                 = cylinders;     // casting implícita de char para int
    
    private byte wheelbase          = 90;
    private int wBase               = wheelbase;     // casting implícita de byte para int
    
    private short horsepower        = 250;
    private int hPower              = horsepower;    // casting implícita de short para int
    
    private int length              = (int) 151.5F;  // floats devem ser convertidos explicitamente
    private int powerToWeightRatio  = (int) 405.1D;  // doubles devem ser convertidos explicitamente

    public int getAuctionPrice() { return this.auctionPrice; }

    public int getCyl() { return this.cyl; }

    public int getwBase() { return this.wBase; }

    public int gethPower() { return this.hPower; }

    public int getLength() { return this.length; }

    public int getPowerToWeightRatio() { return this.powerToWeightRatio; }
}
