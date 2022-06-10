package Chapter1.Section3.Structures;
import  edu.princeton.cs.algs4.Queue;
import  java.util.Iterator;

/**
 * For ex. 1.3.39 <br>
 * 10.06.2022
 * @author xairaven
 */
@SuppressWarnings("unchecked")
public class RingBuffer<Item> implements Iterable<Item>{
    private final Item[] buffer;
    private final Queue<Item> auxBuffer;

    private int size;

    private int first;
    private int last;

    private int willConsumed;   // counter of data that will be consumed

    public RingBuffer(int capacity) {
        buffer = (Item[]) new Object[capacity];
        auxBuffer = new Queue<>();

        first = -1;
        last = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void produce(Item item) {
        if (item == null) throw new IllegalArgumentException("can't push null to Ring Buffer");

        // if consumer already waits data
        if (willConsumed > 0) {
            consumeData(item);
            willConsumed--;
            return;
        }

        if (isEmpty()) {
            buffer[0] = item;
            first = 0;
            last = 0;
            size++;
            return;
        }

        if (size < buffer.length) {
            last = (last == (buffer.length - 1)) ? 0 : last + 1; // wrap or ++
            buffer[last] = item;
            size++;
        } else {
            auxBuffer.enqueue(item);
        }
    }

    public Item consume() {
        if (isEmpty()) {
            willConsumed++;
            return null;
        }

        Item item = buffer[first];
        buffer[first] = null; //avoid loitering

        first = (first == (buffer.length - 1)) ? 0 : first + 1;
        size--;

        if (!auxBuffer.isEmpty()) produce(auxBuffer.dequeue());

        return item;
    }

    // Consumer consumes data (if consume() when ringBuffer is empty)
    private void consumeData(Item item) {
        System.out.println("Data consumed: " + item);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return String.format("Main ring: []\nWaiting to consume: %d", willConsumed);
        }

        var sb = new StringBuilder();
        sb.append("Main ring: [");
        Iterator<Item> mainIterator = new RingBufferIterator();
        while (mainIterator.hasNext()) {
            sb.append(mainIterator.next());
            if (mainIterator.hasNext()) sb.append(", ");
        }
        sb.append("]");
        if (!auxBuffer.isEmpty()) {
            sb.append("\nAuxiliary buffer: [");
            Iterator<Item> auxIterator = auxBuffer.iterator();
            while (auxIterator.hasNext()) {
                sb.append(auxIterator.next());
                if (auxIterator.hasNext()) sb.append(", ");
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new RingBufferIterator();
    }

    private class RingBufferIterator implements Iterator<Item> {
        private int current = first;
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public Item next() {
            Item item = buffer[current];

            current = (current == (buffer.length - 1)) ? 0 : current + 1;
            counter++;

            return item;
        }
    }
}
