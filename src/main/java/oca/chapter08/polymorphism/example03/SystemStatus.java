package oca.chapter08.polymorphism.example03;

/**
 * <br>Classe de status do sistema que implementa a interface {@link Logable} para fornecer informacoes de log sobre o estado do sistema.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class SystemStatus implements Logable {

    private long createdTimestamp;

    public SystemStatus() {
        createdTimestamp = System.currentTimeMillis();
    }

    /**
     * Retorna o status do sistema com base no tempo decorrido desde a criacao do objeto.
     * Se o tempo decorrido for maior que 1000 milissegundos, retorna 1 (ativo), caso contrario retorna -1 (inativo).
     *
     * @return 1 se o sistema estiver ativo, -1 se estiver inativo
     */
    private int getStatus() {
        if (System.currentTimeMillis() - createdTimestamp > 1000) {
            return 1;
        } else {
            return -1;
        }
    }

    public String getInitInfo() {
        return "SystemStatus object created " + createdTimestamp;
    }

    public String getLogableEvent() {
        return String.valueOf("Status: "+getStatus());
    }

}
