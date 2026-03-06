package oca.chapter01.fundamentals.exercise02;

import oca.chapter01.fundamentals.exercise02.planets.Earth;
import oca.chapter01.fundamentals.exercise02.planets.Mars;
import oca.chapter01.fundamentals.exercise02.planets.Venus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <br>Exercicio 2: Escreva um programa Java que imprima "Greetings, Universe!" no console.
 * <br>Este exercício é projetado para testar sua capacidade de compilar e executar um programa Java simples.
 *
 * @author henriqueotogami
 * @since 2026-02-17
 * @version 1.0
 */
public class Exercise02Compile {

    private static final Logger logger = LogManager.getLogger(Exercise02Compile.class);
    private boolean loggingEnabled = false;

    /**
     * <br>Etapas:
     * <br>- 01. Compilar o progama: javac Exercise02Compile.java
     * <br>- 02. Executar o programa: java -cp oca/chapter01/fundamentals/exercises/Exercise02Compile
     * @param args
     */
    public static void main(String[] args) {
        final Exercise02Compile exercise = new Exercise02Compile();
        exercise.setLoggingEnabled(true);
        if (exercise.startUniverse()) {
            if(exercise.isLoggingEnabled()) logger.info("Universe started successfully!");
        } else {
            if(exercise.isLoggingEnabled()) logger.info("Failed to start the universe.");
        }
    }

    /**
     * <br>Este metodo inicia o universo, criando instâncias dos planetas Terra, Marte e Venus, e chamando seus métodos para dizer olá e verificar se são habitáveis.
     * @return true se o universo foi iniciado com sucesso, false caso contrário.
     */
    public boolean startUniverse() {
        try {
            final Earth earth   = new Earth();
            final Mars mars     = new Mars();
            final Venus venus   = new Venus();

            logger.info("Greetings, Universe!");

            earth.sayHello();
            mars.sayHello();
            venus.sayHello();

            logger.info("Is Earth habitable? {}", earth.isHabitable());
            logger.info("Is Mars habitable?  {}", mars.isHabitable());
            logger.info("Is Venus habitable? {}", venus.isHabitable());

            return true;

        } catch (Exception e) {
            if(isLoggingEnabled()) logger.info("An error occurred while starting the universe: {}", e.getMessage());
            return false;
        }
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public void setLoggingEnabled(boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }
}
