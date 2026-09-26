package oca.chapter09.exceptions.example02;

/**
 * Exemplo de Exception customizada e verificada (por herdar a classe {@link Exception}.
 *
 * @author henriqueotogami
 * @since 26/09/2026
 * @version 1.0
 */
public class RecordException extends Exception {

    public RecordException() {
        super();
    }

    public RecordException(String s) {
        super(s);
    }
}
