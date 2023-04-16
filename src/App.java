public class App {
    public static void main(String[] args) {
        // Instantiate a Deck object
        Deck deck = new Deck();

        //Instantiate two Player objects
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        //Call the shuffle method on the Deck object
        deck.shuffle();

        //Game goes here
        for (int i = 0; i < 52; i++) {
            // Determine which player should draw based on the value of the loop counter
            if (i % 2 == 0) {
                // Even iteration, player1 draws a card
                player1.draw(deck);

            } else {
                // Odd iteration, player2 draws a card
                player2.draw(deck);

            }
        }

        for (int j = 0; j < 26; j++) {
            //both players flip their top cards
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Player 1 flips: ");
            card1.describe();
            System.out.println("Player 2 flips: ");
            card2.describe();

            //get value of each card from flip
            int card1Value = card1.getValue();
            int card2Value = card2.getValue();

            // compare the card values and increment the score according to the player with the higher card
            if (card1Value > card2Value) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round!");
            } else if (card2Value > card1Value) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("It's a tie in this round!");
            }
            System.out.println();
            System.out.println("Updated Scores:");
            System.out.println("Player 1: " + player1.getScore());
            System.out.println("Player 2: " + player2.getScore());
            System.out.println(); // Print an empty line to separate rounds visually

        }

        int player1Score = player1.getScore();
        int player2Score = player2.getScore();

        if (player1Score > player2Score) {

            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {

            System.out.println("Player 2 wins!");
        } else {

            System.out.println("It's a draw!");
        }
        System.out.println();
        System.out.println("Final Score: ");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);

    }
}
