package oca.chapter05.methods.example08;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <br>Classe de exemplo para métodos estáticos em Java, demonstrando a criação de um método estático que formata a data atual.
 *
 * @author henriqueotogami
 * @since 2026-04-20
 * @version 0.5
 */
public class Tools {

    /**
     * Metodo estático para formatar a data atual no formato "MMM-dd-yy".
     *
     * @return A data atual formatada como uma string.
     */
    public static String formatDate(){
        final Date date = new Date();
        final Format formatter = new SimpleDateFormat("MMM-dd-yy");
        return formatter.format(date);
    }
}
