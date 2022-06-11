package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.41 <br>
 * Ex. 1.3.41: {@link #Queue(Queue)} <br>
 * 10.06.2022
 * @author xairaven
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        private Item item;
        private Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Queue() {}

    // Ex. 1.3.41
    public Queue(Queue<Item> q) {
        this();

        int size = q.size;
        while (size > 0) {
            Item item = q.dequeue();
            this.enqueue(item);
            q.enqueue(item);
            size--;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");

        return first.item;
    }

    public void enqueue(Item item) {
        Node previous = last;
        last = new Node(item, null);
        if (isEmpty()) first = last;
        else previous.next = last;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");

        Item item = first.item;
        first = first.next;
        size--;
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        sb.append("[");
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if (x.next != null) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

    public Iterator<Item> iterator()  {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        private Node current;

        public QueueIterator() {
            current = first;
        }

        public boolean hasNext()  {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
