package Chapter1.Section3.Structures;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.48 <br>
 * 11.06.2022
 * @author xairaven
 */
public class TwoStacksDeque<Item> {
    private final Deque<Item> deque;
    private int fStackSize;
    private int sStackSize;

    public TwoStacksDeque() {
        deque = new Deque<>();
    }

    public boolean isFirstStackEmpty() {
        return fStackSize == 0;
    }

    public boolean isSecondStackEmpty() {
        return sStackSize == 0;
    }

    public int firstStackSize() {
        return fStackSize;
    }

    public int secondStackSize() {
        return sStackSize;
    }

    public Item firstStackPeek() {
        return deque.first();
    }

    public Item secondStackPeek() {
        return deque.last();
    }

    public void firstStackPush(Item item) {
        if (item == null) throw new IllegalArgumentException("Item can't be null");

        deque.pushLeft(item);
        fStackSize++;
    }

    public Item firstStackPop() {
        if (isFirstStackEmpty()) throw new NoSuchElementException("First stack is empty");

        fStackSize--;
        return deque.popLeft();
    }

    public void secondStackPush(Item item) {
        if (item == null) throw new IllegalArgumentException("Item can't be null");

        deque.pushRight(item);
        sStackSize++;
    }

    public Item secondStackPop() {
        if (isSecondStackEmpty()) throw new NoSuchElementException("First stack is empty");

        sStackSize--;
        return deque.popRight();
    }

    @Override
    public String toString() {
        if (deque.isEmpty()) return "Stacks are empty";

        var sb = new StringBuilder();

        if (isFirstStackEmpty()) {
            sb.append("First stack: empty");
        } else {
            int i = 1;
            sb.append("First stack: ");
            for (Item item : deque) {
                if (i > fStackSize) break;
                sb.append(item).append(" ");
                i++;
            }
            sb.append("\n");
        }

        if (isSecondStackEmpty()) {
            sb.append("Second stack: empty");
        } else {
            int i = 0;
            sb.append("Second stack: ");
            for (Item item : deque) {
                i++;
                if (i <= fStackSize) continue;
                sb.append(item).append(" ");
            }
        }

        return sb.toString();
    }
}
