package oca.chapter01.fundamentals.exemple01; // -> Declara o pacote de Fundamentos

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList; // Importa a classe ArrayList a partir do pacote java.util
import java.io.*;           // Importa todas as classes do pacote java.io
import java.util.Scanner;

/**
 * Exemplo de importação de pacotes em Java.
 * Mostra como importar classes específicas e todas as classes de um pacote.
 * @author henriqueotogami
 * @since 2026-02-04
 * @version 1.0
 */
public class Example01PackageImport {

    private static final Logger logger = LogManager.getLogger(Example01PackageImport.class);

    public static void main(String[] args) {
        Example01PackageImport example = new Example01PackageImport();
        example.generateCoolPlanets();
    }

    private void generateCoolPlanets() {
        Console console = System.console();// Cria um console a partir do pacote java.io – execute fora de seu IDE
        String planet   = "";

        final boolean isExecutingViaIDE = (console == null);

        if(isExecutingViaIDE) {
            Scanner scanner = new Scanner(System.in);
            logger.info("Executando via IDE\n");
            logger.info("nEnter your favorite planet: ");
            planet = scanner.nextLine();
        } else {
//          Aqui entra quando eh executado via javac
            logger.info("Executando via console\r\n");
            planet = console.readLine(" \nEnter your favorite planet:");
        }
        ArrayList planetList = new ArrayList();    // Cria lista de planetas
        planetList.add(planet);                    // Adiciona a entrada do usuário à lista
        planetList.add("Gliese 581 c");            // Adiciona uma string à lista
        logger.info("\nTwo cool planets: {}", planetList);
    }
//    $ Enter your favorite planet: Jupiter
//    $ Two cool planets: [Jupiter, Gliese 581 c]
}