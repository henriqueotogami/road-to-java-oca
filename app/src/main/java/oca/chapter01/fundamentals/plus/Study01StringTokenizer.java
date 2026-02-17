package oca.chapter01.fundamentals.plus;

import java.util.StringTokenizer;

/**
 * Exemplo de uso da classe StringTokenizer em Java e NAO CONTEMPLA ESTUDO DO JAVA OCA.
 * A classe StringTokenizer é usada para dividir uma string em tokens com base em um delimitador especificado.
 * @author henriqueotogami
 * @since 2026-02-09
 * @version 1.0
 */
public class Study01StringTokenizer {

    public static void main(String[] args) {

        final StringTokenizer stringTokenizer = new StringTokenizer("um,dois,três", ",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
