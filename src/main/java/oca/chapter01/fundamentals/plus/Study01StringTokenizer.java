package oca.chapter01.fundamentals.plus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.StringTokenizer;

/**
 * Exemplo de uso da classe StringTokenizer em Java e NAO CONTEMPLA ESTUDO DO JAVA OCA.
 * A classe StringTokenizer é usada para dividir uma string em tokens com base em um delimitador especificado.
 * @author henriqueotogami
 * @since 2026-02-09
 * @version 1.0
 */
public class Study01StringTokenizer {

    private static final Logger logger = LogManager.getLogger(Study01StringTokenizer.class);
    private StringTokenizer stringTokenizer = null;

    /**
     * Imprime os tokens gerados pelo StringTokenizer.
     * Este metodo percorre os tokens gerados pelo StringTokenizer e os imprime usando o logger.
     */
    public boolean printTokens() {
        while (stringTokenizer.hasMoreTokens()) {
            try {
                logger.info(stringTokenizer.nextToken());
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /**
     * Define o StringTokenizer usado para dividir a string.
     * @param stringTokenizer O StringTokenizer contendo os tokens da string original.
     */
    public void setStringTokenizer(final StringTokenizer stringTokenizer) { this.stringTokenizer = stringTokenizer; }

    /**
     * Retorna o StringTokenizer usado para dividir a string.
     * @return O StringTokenizer contendo os tokens da string original.
     */
    public StringTokenizer getStringTokenizer() { return this.stringTokenizer; }
}
