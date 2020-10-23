package main.java.com.faelzaga.setsmapstest;

import java.util.*;

public class ProgramSet {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("pineapple");
        fruits.add("guava");
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("orange");
        fruits.add("pear");

        System.out.println("---------------PRINT-ORIGINAL--------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("-------------------------------------------");

        System.out.println("Number of elements: "+fruits.size()); // CHECK HASHSET SIZE

        fruits.clear(); // CLEAN HASHSET

        System.out.println("Number of elements: "+fruits.size());

        if (isEmpty(fruits)){ // CHECK IF HASHSET IS EMPTY
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        fruits.add("pineapple");
        fruits.add("guava");
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("orange");
        fruits.add("pear");

        Set<String> newList = new HashSet<>(fruits); //CLONE HASHSETS

        System.out.println("----------------PRINT-CLONE----------------");
        for (String element : newList) {
            System.out.println(element);
        }

        newList.add("grapes");
        newList.add("lemon");
        newList.add("kiwi");
        newList.add("banana");

        String[] array = newList.toArray(String[]::new); //CONVERT HASHSET TO ARRAY

        System.out.println("----------------PRINT-ARRAY----------------");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        List<String> arrayList = new ArrayList<>(fruits); // CONVERT HASHSET TO ARRAYLIST

        System.out.println("--------------PRINT-ARRAYLIST--------------");
        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        Set<String> differentElementsList = compareElements(fruits, newList);

        System.out.println("---------PRINT-DIFFERENT-ELEMENTS----------");
        for (String element : differentElementsList) {
            System.out.println(element);
        }
        System.out.println("-------------------------------------------");

        for (String element : fruits) {
            fruits.remove(element);
        }
        System.out.println(fruits.size());

    }

    public static boolean isEmpty(Set list) {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public static Set<String> clone(Set<String> list) {
        Set<String> newList = new HashSet<>();
        for (String element : list) {
            newList.add(element);
        }
        return newList;
    }

    public static Set<String> compareElements(Set<String> listA, Set<String> listB) {
        Set<String> newList = new HashSet<>();

        if (listA.size() >= listB.size()) {
            for (String element : listA) {
                if (listB.add(element)){
                    newList.add(element);
                }
            }
        }else{
            for (String element : listB) {
                if (listA.add(element)){
                    newList.add(element);
                }
            }
        }
        return newList;
    }

}
