package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;

/**
 * For exs. 1.3.35, 1.3.36 <br>
 * Ex. 1.3.36: {@link #iterator()} <br>
 * 10.06.2022
 * @author xairaven
 */
public class RandomQueue<Item> implements Iterable<Item> {
    private Item[] q;
    private int size;

    @SuppressWarnings("unchecked")
    public RandomQueue() {
        q = (Item[]) new Object[1];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException();

        if (size == q.length) resize(2 * q.length);
        q[size++] = item;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");

        int randomId = StdRandom.uniform(size);
        Item item = q[randomId];
        q[randomId] = null;
        if (randomId != size - 1) {
            q[randomId] = q[size - 1];
            q[size - 1] = null;
        }
        size--;

        if (size > 0 && size == q.length / 4) resize(q.length / 2);
        return item;
    }

    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException("queue is empty");

        int randomId = StdRandom.uniform(size);
        return q[randomId];
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < size; ++i)
            copy[i] = q[i];
        q = copy;
    }

    // Ex. 1.3.36
    public Iterator<Item> iterator() {
        return new RandomQueueIterator();
    }

    @SuppressWarnings("unchecked")
    private class RandomQueueIterator implements Iterator<Item> {
        private final Item[] randomQ;
        private int currentId;

        public RandomQueueIterator() {
            randomQ = (Item[]) new Object[size];
            for (int i = 0; i < size; ++i)
                randomQ[i] = (Item) q[i];
            shuffle(randomQ);
            currentId = 0;
        }

        public boolean hasNext() {
            return currentId < randomQ.length;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = randomQ[currentId];
            currentId++;
            return item;
        }

        private void shuffle(Item[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int id = StdRandom.uniform(i + 1);
                if (id != i) {
                    swap(arr, id, i);
                }
            }
        }

        private void swap(Item[] arr, int i, int j) {
            Item temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

