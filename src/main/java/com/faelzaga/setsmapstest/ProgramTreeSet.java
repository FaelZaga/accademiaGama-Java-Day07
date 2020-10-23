package main.java.com.faelzaga.setsmapstest;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        for (int i=0; i < 1000; i++){
            numbers.add(i+1);
        }

        System.out.println("-------------------NUMBER------------------");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Set<Integer> reversedNumbers = new TreeSet(Collections.reverseOrder()); // REVERSED ORDER SET

        for (Integer number : numbers) {
            reversedNumbers.add(number);
        }

        System.out.println("--------------REVERSED-NUMBER-------------");
        for (Integer number : reversedNumbers) {
            System.out.println(number);
        }
        System.out.println("-------------------------------------------");
    }
}
