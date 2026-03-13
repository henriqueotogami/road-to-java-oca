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

    private final ArrayList<String> planetList = new ArrayList<String>();    // Cria lista de planetas

    public static void main(String[] args) {
        Example01PackageImport example = new Example01PackageImport();
        example.generateCoolPlanets();
    }

    public void generateCoolPlanets() {
        Console console = System.console();// Cria um console a partir do pacote java.io – execute fora de seu IDE
        String planet   = "";

        final boolean isExecutingViaIDE = (console == null);

        try {
            if(isExecutingViaIDE) {
                Scanner scanner = new Scanner(System.in);
                logger.info("Executando via IDE\n");
                logger.info("Enter your favorite planet: ");
                planet = scanner.nextLine();
            } else {
    //          Aqui entra quando eh executado via javac
                logger.info("Executando via console\r\n");
                planet = console.readLine(" \nEnter your favorite planet:");
            }
        } catch (Exception e) {
            planet = "Earth"; // Valor padrão caso haja um erro na leitura do console
             logger.error("Error reading input, defaulting to Earth: {}", e.getMessage());
        }
        this.planetList.add(planet);                    // Adiciona a entrada do usuário à lista
        this.planetList.add("Gliese 581 c");            // Adiciona uma string à lista
        logger.info("Two cool planets: {}", planetList);
    }
//    $ Enter your favorite planet: Jupiter
//    $ Two cool planets: [Jupiter, Gliese 581 c]

     /** Metodo getter para acessar a lista de planetas.
     * @return ArrayList<String> - Retorna a lista de planetas.
     */
    public ArrayList<String> getPlanetList() { return this.planetList; }
}