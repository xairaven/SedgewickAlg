package Chapter1.Section3;
//10.02.2022
//Ex. 1.3.14
public class Task_14 {
    public static void main() {
        System.out.println("-- Task 1.3.14 --");
        System.out.println("Fixed-size array queue of strings:");
        FixedSizedArrayQueue<String> fQueue = new FixedSizedArrayQueue<String>(3);
        fQueue.enqueue("1");
        fQueue.enqueue("2");
        fQueue.enqueue("3");
        System.out.println("Dequeue 1: " + fQueue.dequeue());
        System.out.println("Expected: 1");
        fQueue.enqueue("4");
        System.out.println("Dequeue 2: " + fQueue.dequeue());
        System.out.println("Expected: 2");

        System.out.println("\nResizing array queue of strings:");
        ResizingArrayQueue<String> rQueue = new ResizingArrayQueue<String>(3);
        rQueue.enqueue("1");
        rQueue.enqueue("2");
        rQueue.enqueue("3");
        rQueue.enqueue("Full");
        System.out.println("Dequeue 1: " + rQueue.dequeue());
        System.out.println("Expected: 1\n");
        rQueue.enqueue("4");
        System.out.println("Dequeue 2: " + rQueue.dequeue());
        System.out.println("Expected: 2");
        System.out.print("\n\n");
    }
}

class ResizingArrayQueue<Item>{
    private Item[] items = (Item[]) new Object[1];
    private int n;
    private int first;
    private int last;

    public ResizingArrayQueue(int capacity) {
        items = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = items[(first + i) % items.length];
        }
        items = temp;
        first = 0;
        last = n;
    }

    public void enqueue(Item item) {

        if (n == items.length) {
            resize(items.length * 2);
        }
        if (last == items.length) {
            last = 0;
        }
        items[last++] = item;
        n++;
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        } else {
            Item item = items[first];
            items[first] = null;
            first++;

            if (first == items.length) {
                first = 0;
            }
            n--;

            if (n > 0 && n == items.length/4) {
                resize(items.length / 2);
            }

            return item;
        }
    }
}

class FixedSizedArrayQueue<Item> {
    private Item[] items = (Item[]) new Object[1];
    private int n;
    private int first;
    private int last;

    public FixedSizedArrayQueue(int capacity) {
        items = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        if (n != items.length) {
            if (last == items.length) {
                last = 0;
            }
            items[last++] = item;
            n++;
        }
    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        } else {
            Item item = items[first];
            items[first] = null;
            first++;
            if (first == items.length) {
                first = 0;
            }
            n--;
            return item;
        }
    }
}
