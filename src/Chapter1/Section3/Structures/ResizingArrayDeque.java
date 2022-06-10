package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.33 <br>
 * 10.06.2022
 * @author xairaven
 */
public class ResizingArrayDeque<Item> {
    private Item[] arr;

    private int first;
    private int size;

    @SuppressWarnings("unchecked")
    public ResizingArrayDeque() {
        arr = (Item[]) new Object[2];
        first = 1;
    }

    @SuppressWarnings("unchecked")
    public ResizingArrayDeque(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("init capacity of deque must be greater than 0");

        arr = (Item[]) new Object[capacity];
        first = capacity / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void pushLeft(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to Deque");

        if (first < 0 || size > arr.length / 2) {
            resize(arr.length * 2);
        }

        arr[first--] = item;
        size++;
    }

    public void pushRight(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to Deque");

        int last = first + size + 1;

        if (last == arr.length || size > arr.length / 2) {
            resize(arr.length * 2);
        }

        arr[last] = item;
        size++;
    }

    public Item popLeft() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");

        Item item = arr[++first];
        arr[first] = null;    // avoid loitering
        size--;

        if (size == arr.length / 4) resize(arr.length / 2);
        return item;
    }

    public Item popRight() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");

        int endIndex = first + size;
        Item item = arr[endIndex];
        arr[endIndex] = null;    // avoid loitering
        size--;

        if (size == arr.length / 4) resize(arr.length / 2);
        return item;
    }

    @SuppressWarnings("unchecked")
    private void resize(int length) {
        int startPosition = (length / 2) - (size / 2);
        Item[] temp = (Item[]) new Object[length];

        for (int i = first + 1, j = startPosition; i < first + size && j < length; i++, j++) {
            temp[i] = arr[j];
        }

        arr = temp;
        first = startPosition - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();
        sb.append("[");
        for (int index = first + 1; index <= first + size; index++) {
            sb.append(arr[index]);
            if (index != first + size) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        int index = first + 1;
        int last = first + size;

        @Override
        public boolean hasNext() {
            return index <= last;
        }

        @Override
        public Item next() {
            Item item = arr[index];
            index++;
            return item;
        }
    }
}
