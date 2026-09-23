package oca.chapter08.polymorphism.example03;

import org.apache.logging.log4j.LogManager;

import java.io.*;

/**
 * <br> Classe de log que recebe objetos do tipo {@link Logable} e escreve suas informacoes de log em um arquivo de texto.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */
public class Logger {

    private BufferedReader in;
    private BufferedWriter out;

    public static final org.apache.logging.log4j.Logger loggermanager = LogManager.getLogger(Logger.class);

    public Logger() throws IOException {
        out = new BufferedWriter(new FileWriter("logs/logfile.txt", true));
    }

    /**
     * Adiciona as informacoes de log do objeto {@code logable} ao arquivo de log.
     *
     * @param logable objeto que implementa a interface {@link Logable}
     * @throws IOException se ocorrer um erro de escrita no arquivo
     */
    public void appendToLog(Logable logable) throws IOException {
        out.write("Object history: " + logable.getInitInfo());
        out.newLine();
        out.write("Object log event: " + logable.getLogableEvent());
        out.newLine();
    }

    public void close() throws IOException, InterruptedException {
        out.flush();
        out.close();
        Thread.sleep(1000); // Aguarda 1 segundo para garantir que o arquivo seja fechado antes de ser lido
    }

    public void read() throws IOException {
        String line;
        while ((line = in.readLine()) != null) {
            loggermanager.info(line);
        }
        in.close();
    }

    public void open() throws FileNotFoundException {
        in = new BufferedReader(new FileReader("logs/logfile.txt"));
    }

    public BufferedReader getFileRead() {
        return in;
    }
}
