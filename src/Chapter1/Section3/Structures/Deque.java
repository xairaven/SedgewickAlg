package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.33 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Deque<Item> implements Iterable<Item>{
    public Node first;
    public Node last;
    public int size;

    private class Node {
        Item item;
        Node previous;
        Node next;

        public Node(Item item, Node previous, Node next) {
            this.item = item;
            this.previous = previous;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void pushLeft(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to Deque");

        Node oldFirst = first;
        first = new Node(item, null, oldFirst);

        if (isEmpty()) last = first;
        else oldFirst.previous = first;

        size++;
    }

    public void pushRight(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to Deque");

        Node oldLast = last;
        last = new Node(item, oldLast, null);

        if (isEmpty()) first = last;
        else oldLast.next = last;

        size++;
    }

    public Item popLeft() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");

        Item item = first.item;
        first = first.next;
        size--;

        if (isEmpty()) last = null;
        else first.previous = null;

        return item;
    }

    public Item popRight() {
        if (isEmpty()) throw new NoSuchElementException("Deque is empty");

        Item item = last.item;
        last = last.previous;
        size--;

        if (isEmpty()) first = null;
        else last.next = null;

        return item;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        var sb = new StringBuilder();
        sb.append('[');
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if ((x.next) != null) sb.append(", ");
        }
        sb.append(']');

        return sb.toString();
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
