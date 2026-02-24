package oca.chapter02.primitives.example01;

/**
 * <br>Classe de exemplo para demonstrar atribuições em Java.
 * <br>Esta classe é importante para ilustrar como as atribuições funcionam em Java, incluindo a declaração de variáveis, a atribuição de valores e o uso de operadores de atribuição.
 *
 * @author henriqueotogami
 * @since 2026-02-23
 * @version 0.4
 */
public class Attribution {

    private int degrees = 0; // Declaração de um inteiro
    private int totalFish; // Declaração de um inteiro sem inicialização

    public int foundTotalFish = 0; // Declaração e inicialização de um inteiro

    /**
     * <br>Configura o valor padrão de graus para 100.
     * <br>Este metodo é importante para demonstrar como atribuir um valor a uma variável usando o operador de atribuição.
     */
    public void setDefaultDegrees() {
        this.degrees = 100;
        // Atribuição usando o operador de atribuição
    }

    /**
     * <br>Configura o valor de foundTotalFish a partir de uma string.
     * <br>Este metodo é importante para demonstrar como converter uma string em um inteiro e atribuir esse valor a uma variável, além de mostrar como lidar com possíveis exceções de formato.
     *
     * @param foundTotalFish A string que representa o número total de peixes encontrados.
     * @throws NumberFormatException Se a string não puder ser convertida em um inteiro.
     */
    public void setFoundTotalFish(String foundTotalFish) {
        this.foundTotalFish = Integer.parseInt(foundTotalFish);
    }

    /**
     * <br>Calcula o total de peixes somando os peixes no tanque e no cooler.
     * <br>Este metodo é importante para demonstrar como realizar operações aritméticas e atribuir o resultado a uma variável.
     *
     * @param fishInTank   O número de peixes no tanque.
     * @param fishInCooler O número de peixes no cooler.
     */
    public void sumFishes(final int fishInTank, final int fishInCooler) {
        this.totalFish = fishInTank + fishInCooler;
    }

    /**
     * <br>Obtém o valor atual de graus.
     * <br>Este metodo é importante para permitir o acesso ao valor da variável degrees, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O valor atual de graus.
     */
    public int getDegrees() {
        return degrees;
    }

    /**
     * <br>Obtém o total de peixes calculado.
     * <br>Este metodo é importante para permitir o acesso ao valor da variável totalFish, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O total de peixes calculado.
     */
    public int getTotalFish() {
        return totalFish;
    }

    /**
     * <br>Obtém o número total de peixes encontrados.
     * <br>Este metodo é importante para permitir o acesso ao valor da variável foundTotalFish, demonstrando o conceito de encapsulamento em Java.
     *
     * @return O número total de peixes encontrados.
     */
    public int getFoundTotalFish() {
        return foundTotalFish;
    }

    /**
     * <br>Ponto de entrada para executar o exemplo de atribuição.
     * <br>Este metodo é importante para demonstrar como criar uma instância da classe Attribution, configurar os valores e realizar operações de atribuição.
     *
     * @param args Argumentos de linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        Attribution attribution = new Attribution();
        attribution.setDefaultDegrees();
        attribution.sumFishes(100, 50);
    }
}
