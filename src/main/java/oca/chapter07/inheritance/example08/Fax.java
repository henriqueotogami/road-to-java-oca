package oca.chapter07.inheritance.example08;

import java.io.File;

/**
 * A interface {@code Fax} representa um contrato para máquinas de fax.
 * Esta interface define métodos que devem ser implementados por qualquer classe que represente uma máquina de fax.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public interface Fax {

    public void sendFax(File f, int number);

    public Object getReceivedFaxes();

}
