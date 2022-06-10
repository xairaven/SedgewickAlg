package Chapter1.Section3.Structures;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For ex. 1.3.31 <br>
 * 07.06.2022
 * @author xairaven
 */
public class DoublyLinkedList<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        Item item;
        Node next;
        Node previous;

        public Node(Item item, Node next, Node previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Ex. 1.3.31
    public void pushFirst(Item item) {
        Node oldFirst = first;
        first = new Node(item, first, null);

        if (isEmpty()) {
            last = first;
        } else {
            oldFirst.previous = first;
        }

        size++;
    }

    // Ex. 1.3.31
    public void pushLast(Item item) {
        Node oldLast = last;
        last = new Node(item, null, oldLast);

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        size++;
    }

    // Ex. 1.3.31
    public Item deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        Item item = first.item;
        Node featureFirst = first.next;

        if (featureFirst == null) {
            last = null;
        } else {
            featureFirst.previous = null;
        }

        first = featureFirst;
        size--;

        return item;
    }

    // Ex. 1.3.31
    public Item deleteLast() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");

        Item item = last.item;
        Node featureLast = last.previous;

        if (featureLast == null) {
            first = null;
        } else {
            featureLast.next = null;
        }

        last = featureLast;
        size--;

        return item;
    }

    // Ex. 1.3.31
    private void insertBeforeNode(Node beforeX, Node x) {
        if (x == null || beforeX == null) throw new IllegalArgumentException("given Node to insertBeforeNode() is null");

        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(x.item)) {
                Node before = current.previous;
                current.previous = new Node(beforeX.item, current, before);
                size++;
                break;
            }
        }
    }

    // Ex. 1.3.31
    private void insertAfterNode(Node afterX, Node x) {
        if (x == null || afterX == null) throw new IllegalArgumentException("given Node to insertAfterNode() is null");

        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(x.item)) {
                Node after = current.next;
                current.next = new Node(afterX.item, after, current);
                size++;
                break;
            }
        }
    }

    // Ex. 1.3.31
    private void removeNode(Node x) {
        if (x == null) throw new IllegalArgumentException("given Node to removeNode() is null");

        for (Node current = first; current != null; current = current.next) {
            if ((current.item).equals(x.item)) {
                if (current.previous != null) {
                    (current.previous).next = current.next;
                } else {
                    first = current.next;
                }

                if (current.next != null) {
                    (current.next).previous = current.previous;
                } else {
                    last = current.previous;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node x = first; x != null; x = x.next) {
            sb.append(x.item);
            if (x != last) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

    public Iterator<Item> iterator() { return new ListIterator(); }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
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
