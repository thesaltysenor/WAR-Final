import java.util.Arrays;
import java.util.List;

public class Card {
    //Lists of suits of cards and ranks, aka values
    public static final List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    public static final List<String> ranks = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");

    //Fields
    private String suit;
    private String rank;
    private int value;
    private String name;

    //Constructor of Card
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = ranks.indexOf(rank) + 2;
        this.name = rank + " of " + suit;
    }

    //Getters and Setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;

    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;

    }

    public void setValue(int value) {
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Describe method
    public void describe() {
        System.out.println("Card: " + name + ", Value: " + value);
    }
}