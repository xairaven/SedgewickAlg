package Chapter1.Section3.Structures;
import  edu.princeton.cs.algs4.Stack;
import  java.util.Iterator;

/**
 * For ex. 1.3.44 <br>
 * 11.06.2022
 * @author xairaven
 */
public class TextBuffer implements Iterable<Character> {
    private final Stack<Character> lStack;
    private final Stack<Character> rStack;

    public TextBuffer() {
        lStack = new Stack<>();
        rStack = new Stack<>();
    }

    public TextBuffer(String str) {
        lStack = new Stack<>();
        rStack = new Stack<>();

        for (String symbol : str.split("")) {
            lStack.push(symbol.charAt(0));
        }
    }

    public void insert(char c) {
        lStack.push(c);
    }

    public char delete() {
        if (!lStack.isEmpty()) return lStack.pop();
        return ' ';
    }

    public void left(int k) {
        for (int i = 0; i < k && !lStack.isEmpty(); i++) {
            rStack.push(lStack.pop());
        }
    }

    public void right(int k) {
        for (int i = 0; i < k && !rStack.isEmpty(); i++) {
            lStack.push(rStack.pop());
        }
    }

    public int size() {
        return rStack.size() + lStack.size();
    }

    @Override
    public String toString() {
        char[] leftStackReversed = new char[lStack.size()];
        int index = lStack.size() - 1;
        for (char c : lStack) {
            leftStackReversed[index--] = c;
        }

        var sb = new StringBuilder();
        for (char c : leftStackReversed) {
            sb.append(c);
        }
        for (char c : rStack) {
            sb.append(c);
        }
        return sb.toString();
    }


    // imitates cursor, puts it at the start
    @Override
    public Iterator<Character> iterator() {
        return new TextBufferIterator();
    }

    class TextBufferIterator implements Iterator<Character> {
        public TextBufferIterator() {
            while(!lStack.isEmpty()) {
                rStack.push(lStack.pop());
            }
        }

        @Override
        public boolean hasNext() {
            return !rStack.isEmpty();
        }

        @Override
        public Character next() {
            char next = rStack.peek();
            lStack.push(rStack.pop());
            return next;
        }
    }
}
