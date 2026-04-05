package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo long em Java, incluindo coerção explícita e implícita.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleLong {

    private long mustangBingResults     = 146000000L;
    private long mustangGoogleResults   = 40500000l;

    /* casting explícita para long */
    private long mustangAmazonBookResults = (long) 5774;

    /* casting implícita para long */
    private long mustangAmazonManualResults = 2380;

    public long getMustangBingResults() { return this.mustangBingResults; }

    public long getMustangGoogleResults() { return this.mustangGoogleResults; }

    public long getMustangAmazonBookResults() { return this.mustangAmazonBookResults; }

    public long getMustangAmazonManualResults() { return this.mustangAmazonManualResults; }

}
