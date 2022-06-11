package Chapter1.Section3.Structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.47 <br>
 * 07.06.2022
 * @author xairaven
 */
public class CircularList<Item> implements Iterable<Item> {
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

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Item peek() {
        return (last.next).item;
    }

    public void pushFirst(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to the list");

        if (isEmpty()) {
            last = new Node(item, null);
            last.next = last;
        } else {
            last.next = new Node(item, last.next);
        }
        size++;
    }

    public void pushLast(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to the list");

        if (isEmpty()) {
            last = new Node(item, null);
            last.next = last;
        } else {
            Node oldLast = last;
            last = new Node(item, oldLast.next);
            oldLast.next = last;
        }
        size++;
    }

    public Item deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        Item item = null;
        size--;

        if (last.next == last) {
            item = last.item;
            last = null;
            return item;
        }

        Node first = last.next;
        item = first.item;
        last.next = first.next;

        return item;
    }


    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        Node first = last.next;
        int size = this.size;

        var sb = new StringBuilder();
        sb.append('[');
        for (Node x = first; size > 0; x = x.next, size--) {
            sb.append(x.item);
            if (size - 1 != 0) sb.append(", ");
        }
        sb.append(']');

        return sb.toString();
    }


    @Override
    public Iterator<Item> iterator() {
        return new CircularListIterator();
    }

    private class CircularListIterator implements Iterator<Item> {
        Node current;
        int iterSize;

        public CircularListIterator() {
            iterSize = size;
            current = last.next;
        }

        @Override
        public boolean hasNext() {
            return iterSize > 0;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
