package Chapter1.Section3.Structures;

/**
 * For ex. 1.3.14 <br>
 * 10.02.2022
 * @author xairaven
 */
public class ResizingArrayQueue<Item>{
    private Item[] arr;

    private int size;
    private int first = 0;
    private int last = -1;

    public ResizingArrayQueue() {
        arr = (Item[]) new Object[2];
    }

    public ResizingArrayQueue(int capacity) {
        arr = (Item[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void resize(int capacity) {
        Item[] temp = (Item[]) new Object[capacity];

        for (int i = 0, j = first; j <= last; i++, j++) {
            temp[i] = arr[j];
        }

        arr = temp;
        first = 0;
        last = size - 1;
    }

    public void enqueue(Item item) {
        if (size == arr.length) {
            resize(arr.length * 2);
        }
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

        if (size > 0 && size == arr.length/4) {
            resize(arr.length / 2);
        }

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
