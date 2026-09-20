package oca.chapter08.polymorphism.example03;

import org.apache.logging.log4j.LogManager;

public class StartLogging {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(StartLogging.class.getName());

    public StartLogging() throws Exception {
        Logger logger                       = new Logger();
        SystemStatus systemStatus           = new SystemStatus();
        NetworkConnection networkConnection = new NetworkConnection();

        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);

        networkConnection.connect();
        Thread.sleep(2000);

        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);
        logger.close();
    }

    public static void main(String[] args) {
        try {
            new StartLogging();
        } catch (Exception exception) {
            logger.info("Exception: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
