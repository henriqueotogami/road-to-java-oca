package oca.chapter07.inheritance.example06;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe de execução para demonstrar o uso das classes Bicycle e TenSpeedBicycle.
 * Esta classe cria instâncias de bicicletas, define suas propriedades e exibe informações sobre a rotação da roda.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class Run {

    private static final Logger logger = LogManager.getLogger(Run.class);
    
    public static void main(String[] args) {
        logger.info("Starting...");

        logger.info("Creating a bicycle...");
        Bicycle b = new Bicycle();
        b.setDegreeOfTurn(0);
        b.pedalRPM(50);
        logger.info("Turning: {}", b.getDegreeOfTurn());
        logger.info("Wheel RPM: {}", b.getWheelRPM());

        logger.info("Creating a 10 speed bicycle...");
        TenSpeedBicycle tb = new TenSpeedBicycle();
        tb.setDegreeOfTurn(10);
        tb.setGearRatio(3f);
        tb.pedalRPM(40);
        logger.info("Turning: {}", tb.getDegreeOfTurn());
        logger.info("Wheel RPM: {}", tb.getWheelRPM());
    }
}
