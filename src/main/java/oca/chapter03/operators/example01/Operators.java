package oca.chapter03.operators.example01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Operators {

    private static final Logger logger = LogManager.getLogger(Operators.class);

    boolean hasTreasureChestKey = true;
    byte shipmates = 20;
    PirateShip ship = new PirateShip();

//    Já essas atribuições são inválidas e causarão erros de compilação:

    /* Literal inválido, TRUE deve estar em minúsculas */
//    boolean hasTreasureChestKey = TRUE;

    /* Literal inválido, o valor em bytes não pode exceder 127 */
//    byte shipmates = 500;

    /* Construtor inválido */
//    PirateShip ship = new PirateShip(UNEXPECTED_ARG);


    public Operators() {

    }

    public int[] getAttribution() {
        int marines = 10;
        int soldiers = 20;
        int totalCrew = marines + soldiers; // Atribuição usando o operador de adição
        return new int[]{ marines, soldiers, totalCrew };
    }

    private void getAttributionComposite() {
        byte a = 10;
        logger.info("Atribuição Composta (+=) = 10 += 3 = 10 + 3 = {}", a += 3);

        a = 15;
        logger.info("Atribuição Composta (-=) = 15 -= 3 = 15 - 3 = {}", a -= 3);

        a = 20;
        logger.info("Atribuição Composta (*=) = 20 *= 3 = 20 * 3 = {}", a *= 3);

        a = 25;
        logger.info("Atribuição Composta (/=) = 25 /= 3 = 25 / 3 = {}", a /= 3);

        a = 30;
//        30 = 3 = 30 % 3 = 30 % 3 = 0
        logger.info("Atribuição Composta (%=) = 30 %= 3 = 30 % 3 = {}", a %= 3);

        // Opcional já que não faz parte do escopo do exame
        a = 35;
//        35 = 3 = 35 & 3 = 00100011 & 00000011 = 00000011 = 3
        logger.info("Atribuição Composta (&=) = 35 &= 3 = 35 & 3 = {}", a &= 3);

        a = 40;
//        40 = 3 = 40 ^ 3 = 00101000 ^ 00000011 = 00101011 = 43
        logger.info("Atribuição Composta (^=) = 40 ^= 3 = 40 ^ 3 = {}", a ^= 3);

        a = 45;
//        45 = 3 = 45 | 3 = 00101101 | 00000011 = 00101111 = 47
        logger.info("Atribuição Composta (|=) = 45 |= 3 = 45 | 3 = {}", a |= 3);

        a = 50;
//        50 = 3 = 50 << 3 = 00110010 << 3 = 11001000 = 400
        logger.info("Atribuição Composta (<<=) = 50 <<= 3 = 50 * 2^3 = {}", a <<= 3);

        a = 55;
//        55 = 3 = 55 >> 3 = 00110111 >> 3 = 00000110 = 6
        logger.info("Atribuição Composta (>>=) = 55 >>= 3 = 55 >> 3 = {}", a >>= 3);

        a = 60;
//        60 = 3 = 60 >>> 3 = 00111100 >>> 3 = 00000111 = 7
        logger.info("Atribuição Composta (>>>=) = 60 >>>= 3 = 60 >>> 3 = {}", a >>>= 3);
        // Fim opcional
    }
}
