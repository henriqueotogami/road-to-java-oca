package oca.chapter01.fundamentals.exemple01; // -> Declara o pacote de Fundamentos

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

    public static void main(String[] args) {
        Console console = System.console();// Cria um console a partir do pacote java.io – execute fora de seu IDE
        String planet   = "";

        final boolean isExecutingViaIDE = (console == null);

        if(isExecutingViaIDE) {
            System.out.printf("Executando via IDE\r\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print(" \nEnter your favorite planet: ");
            planet          = scanner.nextLine();
        } else {
//          Aqui entra quando eh executado via javac
            System.out.printf("Executando via console\r\n");
            planet          = console.readLine(" \nEnter your favorite planet:");
        }
        ArrayList planetList    = new ArrayList();                  // Cria lista de planetas
        planetList.add(planet);                                     // Adiciona a entrada do usuário à lista
        planetList.add("Gliese 581 c");                             // Adiciona uma string à lista
        System.out.println("\nTwo cool planets: " + planetList);
    }
//    $ Enter your favorite planet: Jupiter
//    $ Two cool planets: [Jupiter, Gliese 581 c]
}