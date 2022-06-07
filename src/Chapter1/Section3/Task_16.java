package Chapter1.Section3;
import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * Ex. 1.3.16 <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_16 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.16 --");

        System.out.println("Input dates:");
        Date[] dates = readDates();

        System.out.println("Dates:");
        for (Date date : dates) {
            System.out.println(date);
        }
    }

    private static Date[] readDates() {
        In in = new In();
        Queue<Date> queue = new Queue<>();
        while (!in.isEmpty()) {
            queue.enqueue(new Date(in.readString()));
        }
        Date[] dates = new Date[queue.size()];
        for (int i = 0; i < dates.length; i++) {
            dates[i] = queue.dequeue();
        }
        return dates;
    }
}

/*
Input example (Standard input):
5/22/1939
4/18/2022
7/06/2022
Ctrl+D

Result example:
Dates:
5/22/1939
4/18/2022
7/6/2022
 */