package Chapter1.Section3.Structures;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * For exs. 1.3.19, 1.3.20, 1.3.21, 1.3.24, 1.3.25 <br>
 * Ex. 1.3.19: {@link #deleteLastNode()} <br>
 * Ex. 1.3.20: {@link #delete(int)} <br>
 * Ex. 1.3.24: {@link #removeAfter(Node)}, {@link #removeAfterTest(String)} <br>
 * Ex. 1.3.25: {@link #insertAfter(Node, Node)}, {@link #insertAfterTest(String, String)} <br>
 * Ex. 1.3.26: {@link #remove(Object)} <br>
 * Ex. 1.3.27: {@link #max()} <br>
 * Ex. 1.3.28: {@link #maxRecursive()}, {@link #maxRecursive(Node, int)} <br>
 * Ex. 1.3.30: {@link #reverse()}, {@link #reverse(Node)}, {@link #reverseRecursive()}, {@link #reverseRecursive(Node)} <br>
 * 07.06.2022
 * @author xairaven
 */
public class List<Item> implements Iterable<Item> {
    private Node first;  // head of linked list
    private int size;   // size of linked list

    private class Node {
        Item item;
        Node next;

        private Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }

        private Node(Item item) {
            this.item = item;
        }
    }

    public List() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Item item) {
        if (item == null) throw new IllegalArgumentException("You can't push null to list");
        first = new Node(item, first);
        size++;
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public Item peek() {
        if (isEmpty()) return null;
        return first.item;
    }

    // Ex. 1.3.19
    public Item deleteLastNode() {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (first.next == null) {
            Item pop = first.item;
            first = null;
            size = 0;
            return pop;
        }

        for (Node x = first; x != null; x = x.next) {
            if (x.next != null && x.next.next == null) {
                Node last = x.next;
                Item pop = last.item;
                last = null; // to avoid loitering
                x.next = null;
                size--;
                return pop;
            }
        }
        return null;
    }

    // Ex. 1.3.20
    public Item delete(int k) {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (k > size)  throw new NoSuchElementException("K is greater than size of the list");
        if (k == 1) {
            Item item = first.item;
            first = first.next;
            size--;
            return item;
        }

        int count = 1;
        for (Node current = first; current != null; current = current.next) {
            if (count == k - 1) {
                Item item = current.next.item;
                current.next = current.next.next;
                size--;
                return item;
            }
            count++;
        }

        return null;
    }

    // Ex. 1.3.26
    public void remove(Item key) {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (key == null) throw new IllegalArgumentException("item can't be null");

        while ((first != null) && (first.item).equals(key)) {
            first = first.next;
            size--;
        }

        for (Node current = first; current != null; current = current.next){
            if ((current.next != null) && ((current.next).item).equals(key)){
                current.next = (current.next).next;
                size--;
            }
        }
    }

    // Ex. 1.3.27
    public int max() {
        if (isEmpty()) return 0;

        int max = (int) Double.NEGATIVE_INFINITY;
        for (Item item : this) {
            int intItem = (Integer) item;
            if (intItem > max) max = intItem;
        }
        return max;
    }

    // Ex. 1.3.28, recursive
    public int maxRecursive() {
        return maxRecursive(first, (Integer) first.item);
    }

    // Ex. 1.3.28, recursive
    private int maxRecursive(Node node, int max) {
        if (node == null) return max;

        int current = (Integer) node.item;
        if (current > max) max = current;

        return maxRecursive(node.next, max);
    }

    // Ex. 1.3.30
    public void reverse() {
        first = reverse(first);
    }

    // Ex. 1.3.30
    private Node reverse(Node x) {
        Node first = x;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }

    // Ex. 1.3.30
    public void reverseRecursive() {
        first = reverseRecursive(first);
    }

    // Ex. 1.3.30
    private Node reverseRecursive(Node first) {
        if (first == null) return null;
        if (first.next == null) return first;
        Node second = first.next;
        Node rest = reverse(second);
        second.next = first;
        first.next  = null;
        return rest;
    }

    @Override
    public String toString() {
        Item[] arr = (Item[]) new Object[size];
        Node current = first;
        for (int i = 0; i < size; i++) {
            arr[i] = current.item;
            current = current.next;
        }
        return Arrays.toString(arr);
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

    /***************************************************************************
     *  Auxiliary methods for exercises, not part of the structure
     ***************************************************************************/

    // Ex. 1.3.24
    private void removeAfter(Node x) {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (x == null) throw new IllegalArgumentException("given Node to removeAfter() is null");

        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(x.item)) {
                if (current.next != null) {
                    current.next = current.next.next;
                    size--;
                }
                break;
            }
        }
    }

    // Ex. 1.3.24
    public void removeAfterTest(String s){
        List<Item>.Node x = new Node((Item) s);
        this.removeAfter(x);
    }

    // Ex. 1.3.25
    private void insertAfter(Node x, Node afterX) {
        if (isEmpty()) throw new NoSuchElementException("list is empty");
        if (x == null || afterX == null) throw new IllegalArgumentException("given Node to insertAfter() is null");

        for (Node current = first; current != null; current = current.next) {
            if (current.item.equals(x.item)) {
                Node after = current.next;
                current.next = new Node(afterX.item, after);
                size++;
                break;
            }
        }
    }

    // Ex. 1.3.25
    public void insertAfterTest(String s, String afterS) {
        List<Item>.Node x = new Node((Item) s);
        List<Item>.Node afterX = new Node((Item) afterS);
        this.insertAfter(x, afterX);
    }
}
