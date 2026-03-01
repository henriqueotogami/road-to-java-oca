package oca.chapter02.primitives.example06;

/**
 * Esta classe demonstra o uso de enums e estruturas de controle switch em Java.
 * <p>
 * A classe define um enum chamado {@code ClamBait} com três valores: FRESH, SALTED e ARTIFICIAL.
 * No metodo {@code main}, uma variável do tipo {@code ClamBait} é inicializada com o valor SALTED.
 * O metodo então utiliza uma estrutura switch para verificar o valor da variável e imprimir
 * uma mensagem correspondente a cada caso. O caso default é usado para lidar com qualquer
 * valor que não corresponda aos casos definidos, embora neste exemplo específico, isso
 * não ocorra devido à definição do enum.
 *
 * @author henriqueotogami
 * @since 2026-02-27
 * @version 1.0
 */
public class Bat {

    private enum ClamBait { FRESH, SALTED, ARTIFICIAL}

    public static void main(String[] args) {

        ClamBait bait = ClamBait.SALTED;
        switch (bait) {
            default:
                System.out.println("No bait");
                break;
            case FRESH:
                System.out.println("Fresh clams");
                break;
            case SALTED:
                System.out.println("Salted clams");
                break;
            case ARTIFICIAL:
                System.out.println("Artificial clams");
                break;
        }
    }
}
