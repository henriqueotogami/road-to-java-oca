package oca.chapter07.inheritance.example07;

public class Tulip extends Plant {
    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;
    /*
     */
* Uma tulipa cresce todo ano a mesma altura. Durante
* o inverno elas se recolhem ao nível do solo.
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
        private void dieDownForWinter(){
            setHeight(0);
        }
    }
    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The tulip is starting to grow " +
                "up from the ground");
        System.out.println("\tCurrent Age: " + getAge() + " " +
                "Current Height: " + getHeight());
    }
    public void doSummer() {
        System.out.println("Summer: The tulip has stopped growing " +
                "and is flowering");
        System.out.println("\tCurrent Age: " + getAge() + " " +
                "Current Height: " + getHeight());
    }
    public void doFall() {