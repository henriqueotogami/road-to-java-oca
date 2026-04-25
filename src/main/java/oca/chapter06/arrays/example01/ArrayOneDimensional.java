package oca.chapter06.arrays.example01;

import org.apache.logging.log4j.Logger;

/**
 * <br>Exemplo de uso de arrays unidimensionais em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-25
 * @version 0.7
 */
public class ArrayOneDimensional {

    public static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ArrayOneDimensional.class.getName());

    /*
     * Todas essas linhas são maneiras válidas de inicializar um array com o operador new
     */
    String[] clockTypes1 = new String[3];
    String clockTypes2[] = new String[3];

    /* Até mesmo arrays de primitivos usam o operador new */
    int alarms1[] = new int[2];
    int[] alarms2 = { 730, 900 };

    String[] clockTypes = { "Wrist Watch","Desk Clock","Wall Clock" };
    Clock[] clocks      = { new Clock(11, 0, 0), new Clock(22,50,0) };

    public ArrayOneDimensional() {
        this.clockTypes1 = new String[4];
    }

    public String[] getClockTypes1() {
        return clockTypes1;
    }

    public void setClockTypes1(String[] clockTypes1) {
        this.clockTypes1 = clockTypes1;
    }

    public String[] getClockTypes2() {
        return clockTypes2;
    }

    public void setClockTypes2(String[] clockTypes2) {
        this.clockTypes2 = clockTypes2;
    }

    public int[] getAlarms1() {
        return alarms1;
    }

    public void setAlarms1(int[] alarms1) {
        this.alarms1 = alarms1;
    }

    public int[] getAlarms2() {
        return alarms2;
    }

    public void setAlarms2(int[] alarms2) {
        this.alarms2 = alarms2;
    }

    public String[] getClockTypes() {
        return clockTypes;
    }

    public void setClockTypes(String[] clockTypes) {
        this.clockTypes = clockTypes;
    }

    public Clock[] getClocks() {
        return clocks;
    }

    public void setClocks(Clock[] clocks) {
        this.clocks = clocks;
    }

    public void printClockTypes() {
        for (String clockType : this.clockTypes) {
            logger.info(clockType);
        }
    }

    public void printClockTarget(final String target) {
        for (Clock clock : this.clocks) {
            if (clock.toString().equals(target)) {
                logger.info("Found clock: {}", clock);
            }
        }
    }

    public void printClockTypesTarget(final String target) {
        for (String clockType : this.clockTypes) {
            if (clockType.equals(target)) {
                logger.info("Found clock type: {}", clockType);
            }
        }
    }
}
