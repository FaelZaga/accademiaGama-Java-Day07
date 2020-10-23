package main.java.com.faelzaga.setsmapstest;

import java.util.HashSet;
import java.util.Set;

public class PerformanceHashSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Starting now...");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            numbers.add(i);
        }

        for (Integer number : numbers) {
                System.out.println(number);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time spent: " + (end - start));
    }
}
