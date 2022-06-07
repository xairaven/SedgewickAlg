package Chapter1.Section2;
import Chapter1.Section2.Structures.SmartDate;

/**
 * Ex. 1.2.12 <br>
 * {@link SmartDate} structure located in Chapter1.Section2.Structures <br>
 * 30.01.2022
 * @author xairaven
 */
public class Task_12 {
    public static void main(String[] args)  {
        System.out.println("-- Exercise 1.2.12 --");

        SmartDate niceDate = new SmartDate(4, 18, 2003);
        System.out.println(niceDate);
        System.out.println(niceDate.dayOfTheWeek());
    }
}
