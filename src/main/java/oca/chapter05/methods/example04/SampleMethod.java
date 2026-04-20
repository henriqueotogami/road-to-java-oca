package oca.chapter05.methods.example04;

/**
 * <br>Classe de exemplo para demonstrar o escopo de variáveis em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class SampleMethod {

    /**
     * <br>Exemplo de metodo para demonstrar o escopo de variáveis em Java.
     */
    public int sampleMethod() { // Início do bloco de código A

        int totalCount = 0;
        for (int i = 0; i < 3; i++) { // Início do bloco de código B

            int forCount = 0;
            totalCount++;
            forCount++;

            { // Início do bloco de código C
                int block1Count = 0;
                totalCount++;
                forCount++;
                block1Count++;
            } // Fim do bloco de código C

            { // Início do bloco de código D
                int block2Count = 0;
                totalCount++;
                forCount++;
                block2Count++;
            } // Fim do bloco de código D

            /* Essas duas variáveis não têm relação com as variáveis de mesmo nome mostradas anteriormente */
            int block1Count;
            int block2Count;
        } // Fim do bloco de código B
        return totalCount;
    } // Fim do bloco de código A
}
