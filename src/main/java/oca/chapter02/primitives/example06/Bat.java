package oca.chapter02.primitives.example06;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger logger = LogManager.getLogger(Bat.class);
    
    public enum ClamBait { FRESH, SALTED, ARTIFICIAL}

    String nameBait = "No bait";

    public static void main(String[] args) {

        ClamBait bait = ClamBait.SALTED;
        Bat bat = new Bat();
        bat.generateBait(bait);
        logger.info(bat.getNameBait());
    }

    /**
     * Gera o nome da isca com base no valor do enum {@code ClamBait} fornecido.
     *
     * @param bait o tipo de isca representado pelo enum {@code ClamBait}, que pode ser FRESH, SALTED ou ARTIFICIAL.
     * @return o nome da isca correspondente ao valor do enum, que pode ser "No bait", "Fresh clams", "Salted clams" ou "Artificial clams".
     */
    public String generateBait(ClamBait bait) {
        final String nameBait;
        switch (bait) {
            default:
                nameBait = "No bait";
                break;
            case FRESH:
                nameBait = "Fresh clams";
                break;
            case SALTED:
                nameBait = "Salted clams";
                break;
            case ARTIFICIAL:
                nameBait = "Artificial clams";
                break;
        }
        return nameBait;
    }

    /**
     * Retorna o nome da isca atualmente definida.
     *
     * @return o nome da isca, que pode ser "No bait", "Fresh clams", "Salted clams" ou "Artificial clams".
     */
    public String getNameBait() { return this.nameBait; }

    /**
     * Define o nome da isca com base no valor fornecido.
     *
     * @param nameBait o nome da isca a ser definido, que pode ser "No bait", "Fresh clams", "Salted clams" ou "Artificial clams".
     */
    public void setNameBait(final String nameBait) { this.nameBait = nameBait; }
}
