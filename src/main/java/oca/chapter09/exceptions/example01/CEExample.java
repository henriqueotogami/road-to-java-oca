package oca.chapter09.exceptions.example01;

import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Exemplo utilizado para demonstrar o tratamento de excecoes verificadas
 * (checked exceptions), criacao de threads e implementacao da interface
 * {@link Runnable}.
 * <p>A classe cria uma nova thread durante a execucao de seu construtor.
 * A thread executa o metodo {@link #run()} e permanece ativa por um periodo
 * determinado, realizando pausas de cinco segundos entre cada execucao.</p>
 * <p>O construtor tambem demonstra o uso da excecao verificada
 * {@link IOException}, declarando-a na assinatura do metodo e lancando-a
 * explicitamente ao final da execucao.</p>
 *
 * @author henriqueotogami
 * @since 25/09/2026
 * @version 1.0
 */
public class CEExample implements Runnable {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(CEExample.class.getName());
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public CEExample() throws IOException, InterruptedException {
        final Thread thread = CEExample.generateNewThread(this);
        thread.start();
        final String format = sdf.format(System.currentTimeMillis());
        logger.info("Thread gerada : {} às {}", thread.getName(), format);
        try {
            Thread.sleep(5000);
            logger.info("Primeira soneca de 5 segundos da thread principal");
        } catch (InterruptedException ie) {
            logger.error("Falha ao dormir a thread: {}", ie.getMessage());
            throw new InterruptedException("thread nao dorme");
        }
        throw new IOException("Oops");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            new CEExample();
        } catch (IOException e) {
            logger.error("Falha ao gerar a thread: {}", e.getMessage());
            throw new IOException("Thread esta em coma reverso");
        } catch (InterruptedException e) {
            throw new InterruptedException("its over");
        }
    }

    public static Thread generateNewThread(final Runnable runnable) {
        return new Thread(runnable);
    }

    public void run() {
        final long MAX_TIME = 30000;
        final long startTime = System.currentTimeMillis();
        String format = "";
        while (System.currentTimeMillis() - startTime < MAX_TIME) {
            try {
                Thread.sleep(5000);
                format = sdf.format(System.currentTimeMillis());
                logger.info("Thread dormiu - {}", format);
            } catch (InterruptedException ie) {
                logger.error("Falha ao dormir a execucao da thread: {}", ie.getMessage());
                Thread.currentThread().interrupt();
            }
            logger.info("Thread está acordada");
        }
        format = sdf.format(System.currentTimeMillis());
        logger.info("Thread capotou de vez - {}", format);
    }
}