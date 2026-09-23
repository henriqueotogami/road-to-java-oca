package oca.chapter08.polymorphism.example03;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;

public class StartLogging {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(StartLogging.class.getName());

    public StartLogging() throws Exception {
        Logger fileLog                       = null;
        SystemStatus systemStatus           = null;
        NetworkConnection networkConnection = null;
        try {
            fileLog = getLogger();
            systemStatus = getSystemStatus();
            networkConnection = getNetworkConnection();
        } catch (IOException e) {
            logger.error("Falha na instancia do Logging: {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
        } catch (IOException e) {
            logger.error("Falha ao escrever no log 1 : {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            networkConnection.connect();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Falha na conexão de rede: {} ", e.getMessage());
            e.printStackTrace();
        }

        try {
            fileLog.appendToLog(systemStatus);
            fileLog.appendToLog(networkConnection);
            fileLog.close();
        } catch (IOException e) {
            logger.error("Falha ao escrever no log 2 : {} ", e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            logger.error("Falha no encerramento do fileLog: {} ", e.getMessage());
            e.printStackTrace();
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
            exception.printStackTrace();
        }
    }
}
