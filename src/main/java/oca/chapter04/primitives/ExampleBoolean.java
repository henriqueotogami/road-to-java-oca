package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo boolean em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleBoolean {

    private boolean hasTurboCharger = false;

    public void activateTurboCharger() {
        this.hasTurboCharger = true;
    }
    public boolean getTurboCharger() {
        return this.hasTurboCharger;
    }
}
