package main.java.com.faelzaga.setsmapstest;

import java.util.LinkedList;
import java.util.List;

public class PerformanceLinkedList {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Starting now...");
        long startC = System.currentTimeMillis();

        for (int i=0; i < 1000000; i++) {
            numbers.add(i);
        }

        long endC = System.currentTimeMillis();

        System.out.println("Starting now...");
        long startR = System.currentTimeMillis();

        for (Integer number : numbers) {
            System.out.println(number);
        }

        long endR = System.currentTimeMillis();
        System.out.println("Time spent Creating: " + (endC - startC));
        System.out.println("Time spent Reading: " + (endR - startR));

        long startAdd = System.currentTimeMillis();

        numbers.add(0,30000);

        long endAdd = System.currentTimeMillis();

        System.out.println("Time spent adding in the first position: " + (endAdd - startAdd));
    }
}
