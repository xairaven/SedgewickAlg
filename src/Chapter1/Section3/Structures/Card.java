package Chapter1.Section3.Structures;
import java.util.Set;

/**
 * For ex. 1.3.35 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Card {
    public final static Set<String> values =
            Set.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
    public final static Set<String> suits = Set.of("S", "H", "D", "C");

    private final String value;
    private final String suit;

    public Card(String value, String suit) {
        verify(value, suit);
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + "-" + suit;
    }

    private void verify(String value, String suit) {
        if (!values.contains(value)) throw new IllegalArgumentException("this value doesn't exist");
        if (!suits.contains(suit)) throw new IllegalArgumentException("this suit doesn't exist");
    }
}
