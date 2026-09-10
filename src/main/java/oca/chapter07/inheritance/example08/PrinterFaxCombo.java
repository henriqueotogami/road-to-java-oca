package oca.chapter07.inheritance.example08;

import java.io.File;

/**
 * A classe {@code PrinterFaxCombo} representa um dispositivo que combina as funcionalidades de uma impressora e de um fax.
 * Esta classe implementa as interfaces {@link Printer} e {@link Fax}, fornecendo métodos para enviar faxes e imprimir arquivos.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 * @see oca.chapter07.inheritance.example08.Fax
 * @see oca.chapter07.inheritance.example08.Printer
 */
public class PrinterFaxCombo implements Printer, Fax {

    private Object incomingFax;
    private int inkLevel;

    public void sendFax(File f, int number) {
        dialNumber(number);
        faxFile(f);
    }

    public Object getReceivedFaxes() {
        return incomingFax;
    }

    public void printFile(File f) {
        sendFileToPrinter(f);
    }

    public int getInkLevel() {
        return inkLevel;
    }

    private boolean dialNumber(int number) {
        boolean success = true;
        /* dialNumber configura success como false se não for bem-sucedido */
        return success;
    }

    private void faxFile(File f) {
        /* Envia o arquivo f como um fax */
    }

    private void sendFileToPrinter(File f) {
        /* Imprime o arquivo f */
    }

    /*
     * Essa classe conteria muitos outros métodos para
     * implementar toda a sua funcionalidade.
     */
}