package oca.chapter01.fundamentals.exercise01;

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

    private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Exercise01Import.class);

    public static void main(String[] args) {
        Exercise01Import exercise = new Exercise01Import();
        if (exercise.createFileLog()) {
            logger.info("Exercise01Import - Arquivo de log criado com sucesso");
        } else {
            logger.info("Exercise01Import - Falha na criação do arquivo de log");
        }
    }
    /**
     * <br>Cria um arquivo de log com mensagens de log usando o pacote java.util.logging.
     * <br>O arquivo de log é criado no diretório "logs" com um nome baseado na data e hora atuais.
     *
     * @return true se o arquivo de log foi criado e as mensagens foram registradas com sucesso, false caso contrário.
     */
    public boolean createFileLog() {
//        logger.info("Exercise01Import - BEGIN");

        try {
            /* Assegura que o diretório seja criado */
            Files.createDirectories(Paths.get("logs"));
        } catch (IOException e) {
            logger.info("Exercise01Import - Falha na criação do diretório logs");
            return false;
        }

        /* Obtém a data a ser usada no nome do arquivo */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime localDateTimeNow      = LocalDateTime.now();
        String date                         = localDateTimeNow.format(dateTimeFormatter);

        /* Define o nome do arquivo no diretório logs */
        String logFileName = "logs/testlog-" + date + ".txt";
//        logger.info("Nome do arquivo: " + logFileName);
        final FileHandler myFileHandler = getFileHandler(logFileName);
        
        if (myFileHandler == null) return false;

        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);

        if (createFile(myFileHandler)) return true;

        return true;
    }

    public boolean createFile(FileHandler myFileHandler) {
        /* Mensagem de log */
//        ocajLogger.info("\nThis is a logged information message. ");
        try {
            Thread.sleep(500);
            /* Fecha o arquivo */
            myFileHandler.flush();
            myFileHandler.close();
            Thread.sleep(500);
        } catch (InterruptedException e) {
//            logger.info("Falha no salvamento do arquivo");
            return false;
        } finally {
//            logger.info("Exercise01Import - END");
        }
        return true;
    }

    public FileHandler getFileHandler(String logFileName) {
        FileHandler myFileHandler = null;
        try {
            /* Define Logger */
            myFileHandler = new FileHandler(logFileName);
            myFileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            logger.info("Exercise01Import - Falha na criação do arquivo de log");
            return null;
        } catch (SecurityException e) {
            logger.info("Exercise01Import - Falha na permissão de impressão de logs  ");
            return null;
        }
        return myFileHandler;
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