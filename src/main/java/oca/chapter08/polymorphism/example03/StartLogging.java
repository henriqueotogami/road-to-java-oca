package oca.chapter08.polymorphism.example03;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;

public class StartLogging {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(StartLogging.class.getName());

    public StartLogging() throws IOException, InterruptedException {
        Logger fileLog                       = null;
        SystemStatus systemStatus           = null;
        NetworkConnection networkConnection = null;
        try {
            fileLog = getLogger();
            systemStatus = getSystemStatus();
            networkConnection = getNetworkConnection();
        } catch (IOException e) {
            logger.error("Falha na instancia do Logging: {} ", e.getMessage());
        }

        try {
            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
        } catch (IOException e) {
            logger.error("Falha ao escrever no log 1 : {} ", e.getMessage());
        }

        try {
            networkConnection.connect();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Falha na conexão de rede: {} ", e.getMessage());
            throw new InterruptedException("Falha na conexão de rede: " + e.getMessage());
        }

        try {
            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
            fileLog.close();
        } catch (IOException e) {
            logger.error("Falha ao escrever no log 2 : {} ", e.getMessage());
            throw new IOException("Falha ao escrever no log 2 : " + e.getMessage());
        } catch (InterruptedException e) {
            logger.error("Falha no encerramento do fileLog: {} ", e.getMessage());
            throw new InterruptedException("Falha no encerramento do fileLog: " + e.getMessage());
        }
    }

    public NetworkConnection getNetworkConnection() {
        return new NetworkConnection();
    }

    public SystemStatus getSystemStatus() {
        return new SystemStatus();
    }

    public Logger getLogger() throws IOException {
        return new Logger();
    }

    public static void main(String[] args) {
        try {
            new StartLogging();
        } catch (Exception exception) {
            logger.error("Falha na Inicialização do Logging: {} ", exception.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
