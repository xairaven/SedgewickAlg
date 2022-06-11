package Chapter1.Section3;
import  Chapter1.Section3.Structures.TextBuffer;

/**
 * Ex. 1.3.44 <br>
 * {@link TextBuffer} structure located in Chapter1.Section3.Structures <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_44 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.44 --");

        System.out.println("// ==================== Main tests ==================== //");

        TextBuffer buffer = new TextBuffer("xairaven");
        System.out.println("Text in the buffer: " + buffer);

        buffer.left(2);
        buffer.insert('E');
        System.out.println("Text in the buffer: " + buffer);

        buffer.left(9999);
        buffer.insert('X');
        System.out.println("Text in the buffer: " + buffer);

        buffer.right(2);
        buffer.insert('A');
        System.out.println("Text in the buffer: " + buffer);

        System.out.println("// ==================== Iterator ==================== //");

        TextBuffer iterBuffer = new TextBuffer();
        for (int i = 97; i < 102; i++) {
            iterBuffer.insert((char) i);
        }
        System.out.println("Text in the buffer: " + iterBuffer);

        System.out.println("Iterator puts cursor at the start");
        for (Character character : iterBuffer) {
            System.out.print(character + " ");
        }
    }
}

/*
Result example:
// ==================== Main tests ==================== //
Text in the buffer: xairaven
Text in the buffer: xairavEen
Text in the buffer: XxairavEen
Text in the buffer: XxaAiravEen
// ==================== Iterator ==================== //
Text in the buffer: abcde
Iterator puts cursor at the start
a b c d e
 */

