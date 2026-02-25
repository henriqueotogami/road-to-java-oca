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

    public boolean isItRaining = false;

    /**
     * <br>Obtém o tempo atual.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherByDefault() {
        if (isItRaining) {
            return "It's raining!";
        } else {
            return "It's not raining!";
        }
    }

    /**
     * <br>Obtém o tempo atual.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherByTernary() {
        return isItRaining ? "It's raining!" : "It's not raining!";
    }

    /**
     * <br>Obtém o tempo atual.
     * <br>Este metodo é importante para demonstrar como obter o tempo atual, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O tempo atual.
     */
    public String getWeatherWithSwitch() {
        switch (String.valueOf(isItRaining).toLowerCase()) {
            case "true":
                return "It's raining!";
            case "false":
                return "It's not raining!";
            default:
                return "Unknown weather condition!";
        }
    }

    /**
     * <br>Método principal.
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
