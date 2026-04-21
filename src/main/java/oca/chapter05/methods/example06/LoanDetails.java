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
        this.term = 180;
        this.rate = .0265; //Taxa de juros em formato decimal
        this.principal = 0;
    }

    public LoanDetails(int t, double r, double p){
        this.term = t;
        this.rate = r;
        this.principal = p;
    }

    /**
     * Metodo para definir o valor do termo do empréstimo.
     * @param p O valor do termo do empréstimo a ser definido.
     */
    public void setPrincipal(double p) {
        this.principal = p;
    }

    /**
     * Metodo para calcular o pagamento mensal do empréstimo com base no termo, taxa de juros e valor principal.
     *
     * @return O valor do pagamento mensal do empréstimo.
     */
    public double monthlyPayment() {
        return (this.rate * this.principal / 12) / (1.0 - Math.pow(((this.rate / 12) + 1.0), (-this.term)));
    }
}
