package oca.chapter02.primitives.example10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Esta classe demonstra o uso de palavras-chave de controle em Java, como break, continue e return.
 * <br>
 * <br>O metodo {@code keywordBreak()} utiliza a palavra-chave break para sair de um loop quando um limite de horas de pesca é excedido.
 * <br>
 * <br>O metodo {@code keywordContinue()} usa a palavra-chave continue para pular o restante do código em um loop quando um limite de dias de acampamento é excedido.
 * <br>
 * <br>Os metodos {@code keywordReturn01()} e {@code keywordReturn02()} demonstram o uso da palavra-chave return para retornar valores calculados, enquanto
 * o metodo {@code keywordReturn03()} mostra como usar return para sair prematuramente de um metodo sem retornar um valor.
 * <br>
 * <br>Os metodos {@code labeledInstructions01()} e {@code labeledInstructions02()} ilustram o uso de rótulos com as palavras-chave break e continue para controlar
 * o fluxo de loops aninhados.
 *
 * @author henriqueotogami
 * @since 2026-03-01
 * @version 1.0
 */
public class ControlKeywords {

    private static final Logger logger = LogManager.getLogger(ControlKeywords.class);

    public static void main(String[] args) {

        final ControlKeywords controlKeywords = new ControlKeywords();
        controlKeywords.keywordBreak();
        controlKeywords.keywordContinue();

        final int totalFishTypes = controlKeywords.keywordReturn01(5, 10, 3);
        logger.info("Total fish types: {}.", totalFishTypes);

        final int totalFishCaught = controlKeywords.keywordReturn02(15, 5);
        logger.info("Total fish caught: {}.", totalFishCaught);

        controlKeywords.keywordReturn03(15, 5);

        controlKeywords.labeledInstructions01();
        controlKeywords.labeledInstructions02();
    }

    public void keywordBreak() {
        int totalHoursFishing   = 0;
        int hoursAllowedFishing = 4;

        for (int index = 1; index < 25; ++index) {
            totalHoursFishing = ++totalHoursFishing;

            if (totalHoursFishing > hoursAllowedFishing) break;

            logger.info("Fishing for hour {} .", index);
        }
    }

    public void keywordContinue() {
        int totalDaysCamping   = 0;
        int daysAllowedFishing = 5;

        for (int index = 1; index < 8; ++index) {

            logger.info("\nDay {} : camping ", index);
            totalDaysCamping++;

            if (totalDaysCamping > daysAllowedFishing) continue;

            logger.info("and fishing");
        }
    }

    public int keywordReturn01(int saltWaterFishTotal, int freshWaterFishTotal, int brackishFishTotal) {
        int fishTypesTotal = saltWaterFishTotal + freshWaterFishTotal + brackishFishTotal;
        return fishTypesTotal;
    }

    public int keywordReturn02(int keeperFish, int throwBackFish) {
        return keeperFish + throwBackFish;
    }

    public void keywordReturn03(int keeperFish, int throwBackFish) {
        for (int index = 1; index < 10; ++index) {
            if (keeperFish + throwBackFish > 20) return;
            logger.info("Fishing for hour {} .", index);
        }
    }

    public void labeledInstructions01() {
        myBreakLabel:
        while (true) {
            logger.info("While loop 1");
            while (true) {
                logger.info("While loop 2");
                while (true) {
                    logger.info("While loop 3");
                    break myBreakLabel;
                }
            }
        }
    }

    public void labeledInstructions02() {
        myContinueLabel:
        while (true) {
            logger.info("While loop 1");
            while (true) {
                logger.info("While loop 2");
                while (true) {
                    logger.info("While loop 3");
                    continue myContinueLabel;
//                    while (true) {
//                        logger.info("While loop 4");
//                    }
                }
            }
        }
    }
}
