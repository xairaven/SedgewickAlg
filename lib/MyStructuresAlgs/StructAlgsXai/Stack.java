package StructAlgsXai;
import java.util.Iterator;
//Copy of implementation from my repo "Algorithms-Data-Structures"
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int size;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item can't be null");
        }
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        size++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            return null;
        }
        return first.item;
    }

    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
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

