package oca.chapter08.polymorphism.example03;

/**
 * <br>Interface que define o contrato para objetos que podem ser logados, fornecendo metodos para obter
 * informacoes iniciais e eventos de log.
 * <br>
 * <br>Este contrato eh usado para demonstrar polimorfismo:
 * classes como {@link NetworkConnection} podem ser tratadas pelo tipo {@code Logable}, permitindo que cada
 * implementacao retorne suas proprias informacoes de log por meio de {@link #getInitInfo()} e {@link #getLogableEvent()}.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public interface Logable {

    /**
     * Retorna informacoes iniciais sobre o objeto que implementa esta interface.
     *
     * @return informacoes iniciais do objeto
     */
    public String getInitInfo();

    /**
     * Retorna o evento de log atual do objeto que implementa esta interface.
     *
     * @return evento de log do objeto
     */
    public String getLogableEvent();

}
