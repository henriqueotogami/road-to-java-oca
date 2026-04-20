package oca.chapter05.methods.example05;

/**
 * <br>Classe de exemplo para demonstrar métodos getters e setters em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
public class Television {

    int channel = 0;
    boolean on = false;

    /**
     * Metodo para definir o canal da televisão.
     *
     * @param channelValue O número do canal a ser definido.
     */
    public void setChannel(int channelValue) {
        this.channel = channelValue;
    }

    /**
     * Metodo para obter o número do canal da televisão.
     *
     * @return O número do canal atualmente definido na televisão.
     */
    public int getChannel() {
        return this.channel;
    }

    /**
     * Metodo para ligar ou desligar a televisão.
     *
     * @param on Um valor booleano indicando se a televisão deve ser ligada (true) ou desligada (false).
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Metodo para verificar se a televisão está ligada ou desligada.
     *
     * @return Um valor booleano indicando se a televisão está ligada (true) ou desligada (false).
     */
    public boolean isOn() {
        return this.on;
    }
}
