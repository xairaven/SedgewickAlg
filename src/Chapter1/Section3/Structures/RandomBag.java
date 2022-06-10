package Chapter1.Section3.Structures;
import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;

/**
 * For ex. 1.3.34 <br>
 * 10.06.2022
 * @author xairaven
 */
public class RandomBag<Item> implements Iterable<Item> {
    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Item item) {
        first = new Node(item, first);
        size++;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();
        sb.append('[');
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if (x.next != null) sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new RandomBagIterator();
    }

    private class RandomBagIterator implements Iterator<Item> {
        Item[] arr;
        int index;

        @SuppressWarnings("unchecked")
        public RandomBagIterator() {
            arr = (Item[]) new Object[size];
            int i = 0;
            for (Node x = first; x != null; x = x.next) {
                arr[i++] = x.item;
            }
            sortArr();
        }

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        public Item next() {
            Item item = arr[index];
            index++;
            return item;
        }

        private void sortArr() {
            for (int i = 0; i < size; i++) {
                int randomIndex = StdRandom.uniform(0, size - 1);
                swap(arr, i, randomIndex);
            }
        }

        private void swap(Item[] arr, int i, int j) {
            Item temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
