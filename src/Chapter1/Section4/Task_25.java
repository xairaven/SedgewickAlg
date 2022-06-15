package Chapter1.Section4;

/**
 * Ex. 1.4.25 <br>
 * 15.06.2022
 * @author Rene Argento :)
 */
public class Task_25 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.25 --");
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 1};


        System.out.printf("Floor: %d, expected: 7\n", findFloorSimple(arr));
        System.out.printf("Floor: %d, expected: 0\n", findFloorSimple(arr2));
        System.out.printf("Floor: %d, expected: 40\n", findFloorSimple(arr3));

        // Enhanced method
        System.out.printf("Floor: %d, expected: 7\n", findFloorEnhanced(arr));
        System.out.printf("Floor: %d, expected: 0\n", findFloorEnhanced(arr2));
        System.out.printf("Floor: %d, expected: 40\n", findFloorEnhanced(arr3));
    }

    private static int findFloorSimple(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        return findFloorSimple(arr, lo, hi, 0);
    }

    /*
    Solution to Part 1: To achieve 2 * sqrt(N), drop eggs at floors
    sqrt(N), 2 * sqrt(N), 3 * sqrt(N), ..., sqrt(N) * sqrt(N).
    (For simplicity, we assume here that sqrt(N) is an integer.)
    Let assume that the egg broke at level k * sqrt(N).
    With the second egg you should then perform a linear search
    in the interval (k-1) * sqrt(N) to k * sqrt(N).
    In total, you will be able to find the floor F in at most 2 * sqrt(N) trials.
     */
    private static int findFloorSimple(int[] arr, int lo, int hi, int searchLevel) {
        int key = 1;

        if (lo <= hi) {
            int sqrt = (int) Math.sqrt(arr.length - 1);

            int separator = sqrt * searchLevel;

            if (separator >= arr.length) {
                separator = arr.length - 1;
            }

            if (key > arr[separator]) {
                return findFloorSimple(arr, separator + 1, hi, ++searchLevel);
            } else {
                // We broke 1 out of 2 eggs, now we do a linear search starting from a floor in which we know that the egg
                // does not break
                if (searchLevel != 0) {
                    searchLevel = searchLevel - 1;
                }

                int lastFloorThatDidNotBreak = sqrt * searchLevel;

                for (int i = lastFloorThatDidNotBreak; i <= separator; i++) {
                    if (arr[i] == 1) {
                        // 2 out of 2 eggs broken, but we now have the floor number
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    private static int findFloorEnhanced(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        return findFloorEnhanced(arr, lo, hi, 0, 0);
    }

    // Hint from website: 1 + 2 + 3 + ... k ~ 1/2 k^2.
    private static int findFloorEnhanced(int[] arr, int lo, int hi, int searchElement, int inc) {
        int key = 1;

        if (lo <= hi) {
            searchElement = searchElement + inc;

            if (searchElement >= arr.length) {
                searchElement = arr.length - 1;
            }

            if (key > arr[searchElement]) {
                return findFloorEnhanced(arr, searchElement + 1, hi, searchElement, ++inc);
            } else {
                // We broke 1 out of 2 eggs, now we do a linear search starting from a floor in which we know that the egg
                // does not break
                searchElement = searchElement - inc;
                int lastFloorThatDidNotBreak = searchElement;

                for (int i = lastFloorThatDidNotBreak; i <= searchElement + inc; i++) {
                    if (arr[i] == 1) {
                        // 2 out of 2 eggs broken, but we now have the floor number
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}

/*
Result example:
Floor: 7, expected: 7
Floor: 0, expected: 0
Floor: 40, expected: 40
Floor: 7, expected: 7
Floor: 0, expected: 0
Floor: 40, expected: 40
 */