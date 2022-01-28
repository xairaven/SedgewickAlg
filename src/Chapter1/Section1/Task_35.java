package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;
//15.01.2022
//Ex. 1.1.35
public class Task_35 {
    public static void main() {
        System.out.println("-- Task 1.1.35 --");
        System.out.println("Method diceSimulation() from the book:");
        double[] diceSimulation = diceSimulation(6);
        for (int i = 2; i < diceSimulation.length; i++) {
            System.out.printf("%.3f\t", diceSimulation[i]);
        }
        System.out.println("\nDice experiment with n = 50:");
        double[] diceExperiment = diceExperiment(6, 50);
        for (int i = 2; i < diceExperiment.length; i++) {
            System.out.printf("%.3f\t", diceExperiment[i]);
        }
        System.out.println("\nHow large does N have to be before emp. results match the exact res to .3f?:");
        System.out.println("//this method is very slow, take very big N.\nMy result: N = ~6_000_002\n");
        System.out.printf("N = %d", checkingN(6, 5_999_999));
        System.out.println("\n");
    }

    public static double[] diceSimulation(int SIDES) { //sides of dice
        double[] dist = new double[2*SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i+j] += 1.0;
            }
        }
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
        }
        return dist;
    }

    public static double[] diceExperiment(int SIDES, int n) {
        double[] diceExperiment = new double[2 * SIDES + 1];
        int sideOne = 0, sideTwo = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sideOne = StdRandom.uniform(1, 7);
            sideTwo = StdRandom.uniform(1, 7);
            diceExperiment[sideOne + sideTwo]++;
        }
        for (int k = 2; k <= 2 * SIDES; k++) {
            diceExperiment[k] /= n;
        }
        return diceExperiment;
    }

    public static int checkingN(int SIDES, int N) {
        double[] diceSimulation = diceSimulation(6);
        double[] diceExperiment = diceExperiment(6, 1);
        boolean[] checking = new boolean[13];
        boolean allChecking = false;
        int count = 0;
        double scale = Math.pow(10, 3);
        for (; !allChecking ; N++) {
            count = 0;
            diceExperiment = diceExperiment(6, N);
            for (int j = 2; j < diceSimulation.length; j++) {
                if (String.format("%.3f", diceSimulation[j]).equals(String.format("%.3f", diceExperiment[j]))) {
                    count++;
                } else {
                    continue;
                }
                if (count == 11) allChecking = true;
            }
            System.out.println(N);
        }
        return N;
    }
}
