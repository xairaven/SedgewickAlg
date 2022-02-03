package Chapter1.Section2;
//30.01.2022
//Ex. 1.2.18
public class Task_18 {
    public static void main() {
        System.out.println("-- Task 1.2.18 --");
        Accumulator18 validation = new Accumulator18();

        validation.addDataValue(2);
        validation.addDataValue(4);
        validation.addDataValue(5);

        System.out.println("Mean: " + validation.mean() + " Expected: 3.6666666666666665");
        System.out.println("Variance: " + validation.var() + " Expected:  2.333333333333333");
        System.out.println("Standard Deviation: " + validation.stddev() + " Expected: 1.5275252316519465");
        System.out.print("\n\n");
    }
}

class Accumulator18 {
    private double m;
    private double s;
    private int N;
    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }
    public double mean() { return m; }
    public double var() { return s/(N - 1); }
    public double stddev() { return Math.sqrt(this.var()); }
}
