package Chapter1.Section3.Structures;
import  java.util.Iterator;

/**
 * For ex. 1.3.38 <br>
 * 10.06.2022
 * @author xairaven
 */
@SuppressWarnings("unchecked")
public class GeneralizedQueueArray<Item> implements Iterable<Item> {
    private Item[] queue;
    private int size;

    public GeneralizedQueueArray() {
        queue = (Item[]) new Object[2];
    }

    public GeneralizedQueueArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("capacity must be greater than 0");
        queue = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(Item x) {
        if (size == queue.length) resize(queue.length * 2);
        queue[size++] = x;
    }

    public Item delete(int k) {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        if (k <= 0 || size < k) throw new IllegalArgumentException("given illegal index to delete()");

        Item item = queue[k - 1];
        for (int i = k; i < size; i++) {
            queue[i - 1] = queue[i];
        }
        queue[size - 1] = null; //to avoid loitering
        size--;

        if (size == queue.length / 4) resize(queue.length / 2);

        return item;
    }

    private void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            temp[i] = queue[i];
        }

        queue = temp;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();

        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(queue[i]);
            if (i != size - 1) sb.append(", ");
        }
        sb.append(']');

        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new GeneralizedQueueIterator();
    }

    private class GeneralizedQueueIterator implements Iterator<Item> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Item next() {
            Item item = queue[index];
            index++;
            return item;
        }
    }
}
