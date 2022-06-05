package Chapter1.Section1;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.1.35 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_35 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.35 --");

        System.out.println("Method diceSimulation() from the book:");
        double[] diceSimulation = diceSimulation();
        for (int i = 2; i < diceSimulation.length; i++) {
            System.out.printf("%.3f\t", diceSimulation[i]);
        }

        System.out.println("\n");

        System.out.println("Dice experiment with n = 50:");
        double[] diceExperiment = diceExperiment(50);
        for (int i = 2; i < diceExperiment.length; i++) {
            System.out.printf("%.3f\t", diceExperiment[i]);
        }

        System.out.println("\n");

        System.out.println("How large does N have to be before emp. results match the exact res to .3f?:");
        System.out.println("//this method is very slow, take very big N.\nMy result: N = ~6_000_002\n");
        System.out.printf("N = %d", checkingN(5_999_999));
    }

    private static double[] diceSimulation() { //sides of dice
        int SIDES = 6;
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

    private static double[] diceExperiment(int n) {
        int SIDES = 6;
        double[] diceExperiment = new double[2 * SIDES + 1];
        int sideOne, sideTwo;
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

    private static int checkingN(int N) {
        int count;
        boolean isChecked = false;
        double[] diceSimulation = diceSimulation();

        while (!isChecked) {
            count = 0;
            double[] diceExperiment = diceExperiment(N);
            for (int j = 2; j < diceSimulation.length; j++) {
                if (String.format("%.3f", diceSimulation[j]).equals(String.format("%.3f", diceExperiment[j]))) {
                    count++;
                } else continue;

                if (count == 11) isChecked = true;
            }
            System.out.println(N);
            N++;
        }
        return N;
    }
}
