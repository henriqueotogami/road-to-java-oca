package oca.chapter01.fundamentals.exercise02;

/**
 * <br>Interface representando um planeta.
 * <br>Esta interface define os métodos que devem ser implementados por qualquer classe que represente um planeta, como dizer olá e verificar se é habitável.
 *
 * @author henriqueotogami
 * @since 2026-02-22
 * @version 1.0
 */
public interface Planet {

    /**
     * <br>Este metodo deve ser implementado para imprimir uma saudação específica do planeta.
     */
    void sayHello();

    /**
     * <br>Este metodo deve ser implementado para indicar se o planeta é habitável ou não.
     * @return true se o planeta for habitável, false caso contrário.
     */
    boolean isHabitable();
}
