package Section1;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
//12.01.2021
//Ex. 1.1.21
public class Task_21 {
    public static void main() {
        System.out.println("-- Task 1.1.21 --");
        In in = new In();
        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] values = line.split(" ");
            formattedPrint(values);
        }
        System.out.print("\n\n");
    }

    private static void formattedPrint(String[] values) {
        if(values.length < 2) {
            System.exit(0);
        }
        StdOut.printf("%5s", values[0]);
        StdOut.printf("%5s", values[1]);
        StdOut.printf("%5s", values[2]);

        double value1 = Double.parseDouble(values[1]);
        double value2 = Double.parseDouble(values[2]);
        double result = value1 / value2;
        StdOut.printf("%7.3f \n", result);
    }
}
