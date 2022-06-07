package Chapter1.Section3;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Transaction;

/**
 * Ex. 1.3.17 <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_17 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.17 --");

        System.out.println("Input transactions:");
        Transaction[] transactions = readTransactions();

        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    private static Transaction[] readTransactions() {
        In in = new In();
        Queue<Transaction> queue = new Queue<>();
        while (!in.isEmpty()) {
            queue.enqueue(new Transaction(in.readLine()));
        }
        Transaction[] transactions = new Transaction[queue.size()];
        for (int i = 0; i < transactions.length; i++) {
            transactions[i] = queue.dequeue();
        }
        return transactions;
    }
}

/*
Input example (Standard input):
Turing 5/22/1939 11.99
xairaven 4/18/2022 5
Alex 7/06/2022 123.85
Ctrl+D

Result example:
Transactions:
Turing      5/22/1939    11,99
xairaven    4/18/2022     5,00
Alex         7/6/2022   123,85
 */