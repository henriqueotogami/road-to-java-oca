package oca.chapter04.enums;

public class ExampleEnum {

    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }

     private Suit suit = Suit.CLUBS;

     public Suit getSuit() {
         return this.suit;
     }

     public void setSuit(Suit suit) {
         this.suit = suit;
     }
}
