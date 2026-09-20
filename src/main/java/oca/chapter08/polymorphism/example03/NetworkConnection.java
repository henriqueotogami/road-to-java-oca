package oca.chapter08.polymorphism.example03;

/**
 * <br>Classe de conexao de rede que implementa a interface {@link Logable} para fornecer informacoes de log sobre o estado da conexao.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class NetworkConnection implements Logable {

    private long createdTimestamp;
    private String currentLogMessage;

    public NetworkConnection() {
        createdTimestamp = System.currentTimeMillis();
        currentLogMessage = "Initialized";
    }

    public void connect() {
        /*
         * Conexão estabelecida
         */
        currentLogMessage = "Connected at " + System.currentTimeMillis();
    }

    public String getInitInfo() {
        return "NetworkConnection object created " + createdTimestamp;
    }

    public String getLogableEvent() {
        return currentLogMessage;
    }
}