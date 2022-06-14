package Chapter1.Section4;
import  edu.princeton.cs.algs4.In;
import  java.util.ArrayList;
import  java.util.HashMap;
import  java.util.List;

/**
 * Ex. 1.4.15 <br>
 * 14.06.2022
 * @author xairaven
 */
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.15 --");

        if (args.length < 1) throw new IllegalArgumentException("you have to input at least 1 arg");

        In in = new In(args[0]);
        int[] arr = in.readAllInts();

        System.out.println("TwoSumFaster result: " + twoSumFaster(arr));
        System.out.println("ThreeSumFaster result: " + threeSumFaster(arr));
    }

    private static int twoSumFaster(int[] arr) {
        var map = new HashMap<Integer, Integer>();;

        for (int key : arr) {
            int frequency = map.getOrDefault(key, 0);
            map.put(key, frequency + 1);
        }

        int count = 0;

        for (int key : arr) {
            if (map.containsKey(-key)) {
                count += map.get(-key);

                if (key == 0) count--;
            }
        }

        return count / 2;
    }

    private static int threeSumFaster(int[] arr) {
        var map = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                if (map.containsKey(-sum)) {
                    for (int id : map.get(-sum))
                        if (id > j) count++;
                }
            }
        }
        return count;
    }
}

/*
Input example (command prompt):
resources/1Kints.txt

Result example:
TwoSumFaster result: 1
ThreeSumFaster result: 70
 */
