package oca.chapter01.fundamentals.exemple03;

/* Importa todos os membros estáticos da classe Locale */
import static java.util.Locale.*;
/**
 * Exemplo de importação estática múltipla em Java.
 * Mostra como importar todos os membros estáticos de uma classe.
 * @author henriqueotogami
 * @since 2026-02-04
 * @version 1.0
 */
public class Example03MultiStaticImport {
    public static void main(String[] args) {
        System.out.println("Locale: " + ITALY); // Exibe "Local: it_IT"
        System.out.println("Locale: " + GERMANY); // Exibe "Local: de_DE"
        System.out.println("Locale: " + JAPANESE); // Exibe "Local: ja"
    }
}
