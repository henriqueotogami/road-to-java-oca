package oca.chapter02.primitives.example02;

/**
 * <br>Classe representando as condições em Java.
 * <br>Demonstrando o uso de condições em Java, como if, else, switch, ternário, etc.
 *
 * @author henriqueotogami
 * @since 2026-02-25
 * @version 1.0
 */
public class Conditionals {

    /**
     * <br>Constante representando o tempo de chuva.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public static final String ITS_RAINING      = "It's raining!";
    
    /**
     * <br>Constante representando o tempo de não chuva.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public static final String ITS_NOT_RAINING  = "It's not raining!";

    /**
     * <br>Variável representando o tempo de chuva.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    private boolean isItRaining = false;

    /**
     * <br>Obtém o tempo atual.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public boolean isItRaining() { return this.isItRaining; }

    /**
     * <br>Define o tempo atual.
     * <br>Este metodo é importante para demonstrar como definir o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @param itRaining O tempo atual.
     */
    public void setItRaining(final boolean itRaining) { this.isItRaining = itRaining; }

    /**     
     * <br>Obtém o tempo atual por default.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherByDefault() {
        if (isItRaining) {
            return ITS_RAINING;
        } else {
            return ITS_NOT_RAINING;
        }
    }

    /**
     * <br>Obtém o tempo atual por ternário.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherByTernary() { return isItRaining ? ITS_RAINING : ITS_NOT_RAINING; }

    /**
     * <br>Obtém o tempo atual por switch.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherWithSwitch() {
        switch (String.valueOf(isItRaining).toLowerCase()) {
            case "true":
                return ITS_RAINING;
            case "false":
                return ITS_NOT_RAINING;
            default:
                return "Unknown weather condition!";
        }
    }

    /**
     * <br>Metodo principal.
     * <br>Este metodo é importante para demonstrar como executar o programa, demonstrando o conceito de encapsulamento em Java.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        final Conditionals conditionals = new Conditionals();
        System.out.println(conditionals.getWeatherByDefault());
        System.out.println(conditionals.getWeatherByTernary());
        System.out.println(conditionals.getWeatherWithSwitch());
    }
}
