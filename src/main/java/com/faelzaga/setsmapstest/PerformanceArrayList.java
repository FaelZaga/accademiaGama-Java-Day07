package main.java.com.faelzaga.setsmapstest;

import java.util.ArrayList;
import java.util.List;

public class PerformanceArrayList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Starting now...");
        long start = System.currentTimeMillis();

        for (int i=0; i < 30000; i++) {
            numbers.add(i);
        }

        for (int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        long end = System.currentTimeMillis();
        System.out.println("Time spent: " + (end - start));
    }
}
