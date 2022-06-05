package Chapter1.Section2;
import Chapter1.Section2.Structures.SmartDate;

/**
 * Ex. 1.2.11 <br>
 * 29.01.2022
 * SmartDate structure located in Chapter1.Section2.Structures
 * @author xairaven
 */
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.11 --");

        SmartDate niceDate = new SmartDate(4, 18, 2003);
        System.out.println(niceDate + "\nNice Date!\n");
        try {
            SmartDate badDate = new SmartDate(4, 33, 2022);
        } catch (IllegalArgumentException e) {
            System.out.println("""
                    SmartDate badDate = new SmartDate(4, 33, 2022);
                    Illegal date!
                    """);
        }
    }
}
