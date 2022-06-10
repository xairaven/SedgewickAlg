package Chapter1.Section3;
import  Chapter1.Section3.Structures.RingBuffer;

/**
 * Ex. 1.3.39 <br>
 * {@link RingBuffer} structures located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_39 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.39 --");

        RingBuffer<Integer> ringBuffer = new RingBuffer<>(2);
        System.out.println("--- Empty buffer ---");
        System.out.println(ringBuffer);

        System.out.println();

        for (int i = 0; i < 4; i++) {
            ringBuffer.produce(i);
        }
        System.out.println("--- After producing ---");
        System.out.println(ringBuffer);

        System.out.println();

        System.out.println("--- Consuming data ---");
        for (int i = 0; i < 5; i++) {
            Integer consumed = ringBuffer.consume();
            if (consumed != null) {
                System.out.printf("Consumed: %d\n%s\n\n", consumed, ringBuffer);
            } else {
                System.out.println(ringBuffer + "\n");
            }
        }

        System.out.println("--- Producing when consuming ---");
        for (int i = 0; i < 2; i++) {
            ringBuffer.produce(1);
            System.out.println(ringBuffer + "\n");
        }
    }
}

/*
Result example:
--- Empty buffer ---
Main ring: []
Waiting to consume: 0

--- After producing ---
Main ring: [0, 1]
Auxiliary buffer: [2, 3]

--- Consuming data ---
Consumed: 0
Main ring: [1, 2]
Auxiliary buffer: [3]

Consumed: 1
Main ring: [2, 3]

Consumed: 2
Main ring: [3]

Consumed: 3
Main ring: []
Waiting to consume: 0

Main ring: []
Waiting to consume: 1

--- Producing when consuming ---
Data consumed: 1
Main ring: []
Waiting to consume: 0

Main ring: [1]
 */