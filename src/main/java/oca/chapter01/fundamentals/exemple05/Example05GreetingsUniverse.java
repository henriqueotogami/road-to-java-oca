package oca.chapter01.fundamentals.exemple05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example05GreetingsUniverse {

    private static final Logger logger = LogManager.getLogger(Example05GreetingsUniverse.class);

    public static void main(final String[] args) {
        Example05GreetingsUniverse example = new Example05GreetingsUniverse();
        example.getGreetings();
    }

    public String getGreetings() { return "Greetings, Universe!"; }
}
