package oca.chapter05.methods.example06;

/**
 * <br>Classe de exemplo para demonstrar o uso de métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-20
 * @version 0.5
 */
public class LoanDetails {

    private int term;
    private double rate;
    private double principal;

    public LoanDetails() {
        term = 180;
        rate = .0265; //Taxa de juros em formato decimal
        principal = 0;
    }

    public LoanDetails(int t, double r, double p){
        term = t;
        rate = r;
        principal = p;
    }

    public void setPrincipal(double p) {
        principal = p;
    }

    public double monthlyPayment() {
        return (rate * principal / 12) / (1.0 - Math.pow(((rate / 12) + 1.0), (-term)));
    }
}
