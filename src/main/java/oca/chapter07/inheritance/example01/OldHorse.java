package oca.chapter07.inheritance.example01;

import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de classe OldHorse para ilustrar herança em Java.
 *
 * @author henriqueotogami
 * @since 2026-08-22
 * @version 0.9
 */
public class OldHorse {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(OldHorse.class.getName());

    int weight;
    int age;
    String hairColor;

    public void eat(){ logger.info("Alimenta-se mastigando"); }
    public void rest(){ logger.info("Descansa"); }
    public void move(int direction) { logger.info("Move-se na direção " + direction); }
    public void neigh() { logger.info("Relincha");  }
}
