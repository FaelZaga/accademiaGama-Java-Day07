package main.java.com.faelzaga.setsmapstest;

import java.util.HashMap;
import java.util.Map;

public class ProgramMap {

    public static void main(String[] args) {
        Map<String,String> mapList = new HashMap<>();

        mapList.put("a","apple");
        mapList.put("b","guava");
        mapList.put("c","pineapple");
        mapList.put("d","pear");
        mapList.put(null,"strawberry");

        Map<String,String> people = Map.of(  // IMMUTABLE HASHMAP
                "key1","Fulano",
                "key2","Cicrano",
                "key3","Beltrano"
        );

        people.forEach((k,v) -> {
            System.out.println("key: "+k+", value: "+v);  //FOREACH HASHMAP
        });

        System.out.println("mapList size: "+mapList.size()); // HASHMAP SIZE

        Map<String,String> mapListCopy = new HashMap<>(mapList);// CLONE HASHMAP

        mapListCopy.clear(); // CLEAN HASHMAP

        System.out.println("mapListCopy size: "+mapListCopy.size());

        for (String id : mapList.keySet()) {
            if (id == null) {
                System.out.println("There is a null key");
            }
        }

        boolean idExists = mapList.containsKey("a"); //HASHMAP CONTAINS KEY
        if (idExists) {
            System.out.println("The key exists");
        }else{
            System.out.println("The key does not exists");
        }

        boolean valueExists = mapList.containsValue("watermelon"); //HASHMAP CONTAINS VALUE
        if (valueExists) {
            System.out.println("The value exists");
        }else{
            System.out.println("The value does not exists");
        }

        for (String id : mapList.keySet()) { //HASHMAP LIST KEYS
            System.out.println(id);
        }

        for (String value : mapList.values()) { //HASHMAP LIST VALUES
            System.out.println(value);
        }
    }

}
