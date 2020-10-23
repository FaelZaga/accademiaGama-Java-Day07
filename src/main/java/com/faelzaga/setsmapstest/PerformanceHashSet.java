package main.java.com.faelzaga.setsmapstest;

import java.util.HashSet;
import java.util.Set;

public class PerformanceHashSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Starting now...");
        long startC = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        long endC = System.currentTimeMillis();

        System.out.println("Starting now...");
        long startR = System.currentTimeMillis();

        for (Integer number : numbers) {
                System.out.println(number);
        }

        long endR = System.currentTimeMillis();
        System.out.println("Time spent creating: " + (endC - startC));
        System.out.println("Time spent reading: " + (endR - startR));
    }
}
