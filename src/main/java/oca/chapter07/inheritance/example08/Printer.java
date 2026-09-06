package oca.chapter07.inheritance.example08;

import java.io.File;

/**
 * A interface {@code Printer} representa um contrato para impressoras.
 * Esta interface define métodos que devem ser implementados por qualquer classe que represente uma impressora.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public interface Printer {

    public void printFile(File f);

    default public int getInkLevel(){
        return 0;
    }
}