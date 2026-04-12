package oca.chapter04.exercise01;

/*
 * <br>Exercício 1 do capítulo 4 da OCA, que envolve o cálculo de ERA (Earned Run Average) para um jogador de beisebol.
 *
 * @author henriqueotogami
 * @since 2026-04-10
 * @version 0.5
 */
public class ERACalculator {

    private int earnedRuns            = 3;
    private int inningsPitched        = 6;
    private int inningsInAGame        = 9;
    private float leagueAverageEra    = 4.25f;
    private float era                 = 0;
    private boolean betterThanAverage = false;
    private char yesNo                = 'N';

    public char getYesNo() { return this.yesNo; }

    public void setYesNo(final char yesNo) { this.yesNo = yesNo; }

    public boolean isBetterThanAverage() { return this.betterThanAverage; }

    public void setBetterThanAverage(final boolean betterThanAverage) { this.betterThanAverage = betterThanAverage; }

    public float getEra() { return this.era; }

    public void setEra(final float era) { this.era = era; }

    public float getLeagueAverageEra() { return this.leagueAverageEra; }

    public int getInningsInAGame() { return this.inningsInAGame; }

    public int getInningsPitched() { return this.inningsPitched; }

    public int getEarnedRuns() { return this.earnedRuns; }

    public static void main(String[] args) {

        final ERACalculator calculator = new ERACalculator();
        calculator.setEra((float) calculator.getEarnedRuns() / (float) calculator.getInningsPitched() * calculator.getInningsInAGame());

        if (calculator.getEra() < calculator.getLeagueAverageEra()) {
            calculator.setBetterThanAverage(true);
        } else {
            calculator.setBetterThanAverage(false);
        }

        calculator.setYesNo(calculator.isBetterThanAverage() ? 'Y' : 'N');

        System.out.println("Earned Runs\t\t\t" + calculator.getEarnedRuns());
        System.out.println("Innings Pitched\t\t" + calculator.getInningsPitched());
        System.out.println("ERA\t\t\t\t\t" + calculator.getEra());
        System.out.println("League Average ERA\t" + calculator.getLeagueAverageEra());
        System.out.println("Is player better than league average " + calculator.getYesNo());
    }
}
