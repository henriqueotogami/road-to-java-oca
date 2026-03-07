package oca.chapter01.fundamentals.exemple02;

/* Importa o membro estático ITALY */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.Locale.ITALY;

/**
 * Exemplo de importação estática em Java.
 * Mostra como importar um membro estático específico de uma classe.
 * @author henriqueotogami
 * @since 2026-02-04
 * @version 1.0
 */
public class Example02SingleStaticImport {

    private static final Logger logger = LogManager.getLogger(Example02SingleStaticImport.class);
    private boolean hasImportedStaticMember = false;

    public static void main(String[] args) {
        Example02SingleStaticImport example02 = new Example02SingleStaticImport();
        example02.getSingleStaticImport(); // Exibe "Local: it_IT"
    }

    /** Metodo para demonstrar a importação de um membro estático específico.
     * Este metodo utiliza o membro estático ITALY importado para exibir a locale correspondente.
     */
    public void getSingleStaticImport() {
        logger.info("Locale: {}", ITALY);
        this.hasImportedStaticMember = true;
    }

    /** Metodo getter para verificar se o membro estático foi importado.
    * @return boolean - Retorna true se o membro estático foi importado, caso contrário, retorna false.
    */
    public boolean isHasImportedStaticMember() { return this.hasImportedStaticMember; }

    /** Metodo setter para definir o status de importação do membro estático.
     * @param hasImportedStaticMember - booleano que indica se o membro estático foi importado ou não.
     */
    public void setHasImportedStaticMember(final boolean hasImportedStaticMember) { this.hasImportedStaticMember = hasImportedStaticMember; }
}