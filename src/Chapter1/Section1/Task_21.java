package Chapter1.Section1;
import java.util.ArrayList;
import edu.princeton.cs.algs4.In;

/**
 * Ex. 1.1.21 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_21 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.21 --");
        ArrayList<String[]> table = new ArrayList<>();
        In in = new In();
        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] values = line.split(" ");
            table.add(values);
        }
        System.out.printf("%8s %8s %8s %10s", "Names", "Number1", "Number2", "Result\n");
        for (String[] values : table) {
            printTable(values);
        }
    }

    private static void printTable(String[] values) {
        if(values.length < 2) System.exit(0);
        System.out.printf("%8s", values[0]);
        System.out.printf("%8s", values[1]);
        System.out.printf("%8s", values[2]);

        double firstValue = Double.parseDouble(values[1]);
        double secondValue = Double.parseDouble(values[2]);
        double result = firstValue / secondValue;
        System.out.printf("%13.3f \n", result);
    }
}

/*
Example of input:
Alex 3 1
Vlad 1 2
Yuriy 100 20
Ctrl+D

Result:
   Names  Number1  Number2    Result
    Alex       3       1        3,000
    Vlad       1       2        0,500
   Yuriy     100      20        5,000
 */
