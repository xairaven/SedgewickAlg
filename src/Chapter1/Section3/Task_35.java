package Chapter1.Section3;
import  Chapter1.Section3.Structures.Card;
import  Chapter1.Section3.Structures.RandomQueue;
import java.util.ArrayList;

/**
 * Ex. 1.3.35 <br>
 * {@link RandomQueue} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_35 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.35 --");

        var cards = new RandomQueue<Card>();
        for (String suit : Card.suits) {
            for (String value : Card.values) {
                cards.enqueue(new Card(value, suit));
            }
        }

        ArrayList<Card>[] players = new ArrayList[4];
        for (int i = 0; i < players.length; i++) {
            players[i] = new ArrayList<>();
        }

        for (int i = 1; i <= 52; i++) {
            players[i % 4].add(cards.dequeue());
        }

        int i = 1;
        for (ArrayList<Card> player : players) {
            System.out.printf("Player %d:\n%s\n\n", i++, player);
        }
    }
}

/*
Result example:
Player 1:
[10-H, 3-S, 9-D, Q-H, 5-C, 10-D, A-H, A-C, Q-S, 8-S, 2-D, 8-D, J-S]

Player 2:
[A-S, K-S, 6-H, K-C, 5-H, 8-C, 9-S, 7-D, 2-C, 7-H, J-D, 4-S, K-D]

Player 3:
[2-S, 6-C, J-C, 10-S, J-H, 8-H, 3-C, 7-C, 10-C, A-D, 2-H, Q-C, 4-H]

Player 4:
[9-H, 6-S, 7-S, 9-C, 3-D, 4-D, 4-C, 5-D, 5-S, Q-D, 6-D, K-H, 3-H]
 */

