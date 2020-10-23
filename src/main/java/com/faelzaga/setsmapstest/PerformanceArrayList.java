package main.java.com.faelzaga.setsmapstest;

import java.util.ArrayList;
import java.util.Collection;

public class PerformanceArrayList {

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

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
    }
}
