package Chapter1.Section3.Structures;

/**
 * For ex. 1.3.14 <br>
 * 10.02.2022
 * @author xairaven
 */
public class FixedCapacityQueue<Item> {
    private Item[] arr;

    private int size;
    private int first = 0;
    private int last = -1;

    public FixedCapacityQueue(int capacity) {
        arr = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        if (last + 1 == arr.length) throw new ArrayIndexOutOfBoundsException("queue is full");
        arr[++last] = item;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("queue is empty");
        Item item = arr[first];
        arr[first++] = null;
        if (first == arr.length) {
            first = 0;
            last = -1;
        }
        size--;
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = first; i <= last; i++) {
            sb.append(arr[i]);
            if (i != last) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
