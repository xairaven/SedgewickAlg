package Chapter1.Section3.Structures;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.29 <br>
 * 07.06.2022
 * @author xairaven
 */
public class QueueCircular<Item> implements Iterable<Item> {
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public QueueCircular() {
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        if (isEmpty()) {
            last = new Node(item, null);
            last.next = last;
        } else {
            Node node = new Node(item, last.next);
            last.next = node;
            last = node;
        }
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("queue is empty");

        Item item = (last.next).item;

        if (size == 1) {
            last = null;
        } else {
            last.next = last.next.next;
        }

        size--;
        return item;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        Item[] arr = (Item[]) new Object[size];
        Node current = last.next;
        for (int i = 0; i < size; i++) {
            arr[i] = current.item;
            current = current.next;
        }
        return Arrays.toString(arr);
    }

    public Iterator<Item> iterator() { return new CircularQueueIterator(); }

    private class CircularQueueIterator implements Iterator<Item> {
        private Node current = last.next;

        @Override
        public boolean hasNext() {
            return current != last.next;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
