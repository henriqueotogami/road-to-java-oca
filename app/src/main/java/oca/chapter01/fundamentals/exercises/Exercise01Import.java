package oca.chapter01.fundamentals.exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.*;
/**
 * <br>Exercício 1: Crie um programa que registre mensagens de log em um arquivo.
 * <br>
 * <br>Use classes do pacote java.util.logging para configurar o logger e gravar
 * <br>mensagens de log em um arquivo com um nome baseado na data e hora atuais.
 * <br>
 * @author henriqueotogami
 * @since 2026-02-05
 * @version 1.0
 */
public class Exercise01Import {

    public static void main(String[] args) throws IOException {
        System.out.println("Exercise01Import - BEGIN");

        try {
            /* Assegura que o diretório seja criado */
            Files.createDirectories(Paths.get("logs"));
        } catch (IOException e) {
            System.out.println("Exercise01Import - Falha na criação do diretório logs");
        }

        /* Obtém a data a ser usada no nome do arquivo */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime localDateTimeNow      = LocalDateTime.now();
        String date                         = localDateTimeNow.format(dateTimeFormatter);

        /* Define o nome do arquivo no diretório logs */
        String logFileName = "logs/testlog-" + date + ".txt";
        System.out.println("Nome do arquivo: " + logFileName);
        FileHandler myFileHandler = null;

        try {
            /* Define Logger */
            myFileHandler = new FileHandler(logFileName);
            myFileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            System.out.println("Exercise01Import - Falha na criação do arquivo de log");
        } catch (SecurityException e) {
            System.out.println("Exercise01Import - Falha na permissão de impressão de logs  ");
        }

        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);

        /* Mensagem de log */
        ocajLogger.info("\nThis is a logged information message. ");
        try {
            Thread.sleep(500);
            /* Fecha o arquivo */
            myFileHandler.flush();
            myFileHandler.close();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Falha no salvamento do arquivo");
        } finally {
            System.out.println("Exercise01Import - END");
        }
    }

//    Instruções:
//    1. Digite o aplicativo de exemplo em um novo arquivo e chame-o de Exercise01Import.java.
//    Salve o arquivo.

//    2. Compile e execute o aplicativo para verificar se criou o conteúdo do arquivo sem erro:
//    - Compilar: javac Exercise01Import.java
//    - Executar: java Exercise01Import.java

//    Verifique se a mensagem de log está sendo exibida na tela. Verifique também se um
//    arquivo foi criado no subdiretórios logs com a mesma mensagem.

//    3. Desative com um símbolo de comentário todas as instruções import:
//
//    import java.io.*;
//    import java.text.*;
//    import java.time.*;
//    import java.time.format.*;
//    import java.util.*;
//    import java.util.logging.*;

//    4. Compile o aplicativo: javac Exercise01Import.java. Você verá vários erros de compilação relacionados
//    às importações de classe ausentes.
//
//    Como exemplo, a ilustração a seguir demonstra os erros que são exibidos quando só o pacote java.io é desativado
//    com um comentário.

//    5. Para cada classe que não puder ser encontrada, use a especificação online da API do Java para determinar a
//    que pacote ela pertence e atualize o arquivo-fonte com a instrução import explícita necessária.
//
//    Quando terminar, você terá substituído as quatro instruções import implícitas por nove instruções import
//    explícitas.
//
//    6. Execute o aplicativo novamente para verificar se ele funciona com as instruções import explícitas da mesma
//    forma que com as instruções implícitas.
}