import java.util.ArrayList;
import java.util.List;
public class Player {
    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Describe method
    public void describe() {
        System.out.println("Player: " + name + ", Score: " +score);
        for (Card card : hand) {
            card.describe();
        }
    }
    //Flip method
    public Card flip() {
        return hand.isEmpty() ? null : hand.remove(0);
    }
    //Draw method
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    //IncrementScore method
    public void incrementScore() {
        score++;
    }

    //Getters and Setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

}