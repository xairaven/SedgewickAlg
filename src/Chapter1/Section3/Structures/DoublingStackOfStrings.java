package Chapter1.Section3.Structures;
import java.util.Iterator;

/**
 * For ex. 1.3.8 <br>
 * 03.02.2022
 * @author xairaven
 */
public class DoublingStackOfStrings implements Iterable<String> {
    private String[] arr;
    private int size = 0;

    public DoublingStackOfStrings() {
        arr = new String[1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Ex. 1.3.8
    public int sizeOfArray() { return arr.length; }

    private void resize(int cap) {
        String[] temp = new String[cap];

        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    public void push(String item) {
        if (size == arr.length) resize(arr.length * 2);
        arr[size++] = item;
    }

    public String pop() {
        String str = null;

        if (!isEmpty()) {
            str = arr[--size];
            arr[size] = null;
        } else {
            throw new ArrayIndexOutOfBoundsException("stack is empty");
        }

        if (size > 0 && size == arr.length / 4) {
            resize(arr.length / 2);
        }

        return str;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<String>{
        int index = size;

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public String next() {
            return arr[--index];
        }

        @Deprecated
        public void remove() {}
    }
}
