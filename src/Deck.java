import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards = new ArrayList<>();


    public Deck() {
        for (int i = 0; i < Card.suits.size(); i++) {
            String suit = Card.suits.get(i);
            for (int j = 0; j < Card.ranks.size(); j++) {
                String rank = Card.ranks.get(j);
                cards.add(new Card(suit, rank));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


    //Shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Cards have been shuffled.");
    }

    //Draw Method
    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(cards.size() - 1);
    }

}