package org.endava.tmd;

import java.util.*;

public class FirstEx {
    public static void main(String[] args) {
        printListEvenNumbers();
        printSetDuplicateItems();
        printMapKeysWithValueGreaterThan10();
    }
    public static void printListEvenNumbers(){
        List<Integer> integerList = createList();
        System.out.println("List even numbers");
        Iterator<Integer> integerIterator = integerList.iterator();
        while(integerIterator.hasNext()){
            int number = integerIterator.next();
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }

    public static List<Integer> createList(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        return integerList;
    }

    public static void printSetDuplicateItems(){
        Set<String> stringSet = createSet();
        System.out.println("\nSet duplicate items");
        for (String s : stringSet) {
            System.out.println(s);
        }
    }

    public static Set<String> createSet(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Collections");
        stringSet.add("Collections");
        stringSet.add("Collections");
        return stringSet;
    }
    public static void printMapKeysWithValueGreaterThan10(){
        Map<String,Integer> map = createMap();
        System.out.println("\nMap keys with value greater than 10");
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if(stringIntegerEntry.getValue() > 10){
                System.out.println(stringIntegerEntry.getKey());
            }
        }
    }

    public static Map<String,Integer> createMap(){
        Map<String,Integer> map= new HashMap<>();
        map.put("Ionut",9);
        map.put("Nathan",8);
        map.put("Iulian",15);
        map.put("Andrei",20);
        return map;
    }
}
