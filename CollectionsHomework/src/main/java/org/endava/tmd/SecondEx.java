package org.endava.tmd;

import java.util.*;

public class SecondEx {
    public static void main(String[] args) {
        listSetAndMapExercise();
    }
    public static void listSetAndMapExercise(){
        List<Integer> integerList = createList();
        integerList = listWithoutDuplicates(integerList);
        System.out.println("\nList without duplicates");
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        Collections.sort(integerList);
        System.out.println("\nList sorted");
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        Set<String> stringSet = createSet(integerList);
        System.out.println("\nSet print");
        for (String s : stringSet) {
            System.out.println(s);
        }

        Map<String,Integer> stringIntegerMap = createMap(stringSet,integerList);
        System.out.println("\nMap print");
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }

    public static List<Integer> createList(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(5);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        return integerList;
    }
    public static List<Integer> listWithoutDuplicates(List<Integer> integerList){
        List <Integer> integerListWithoutDuplicates = new ArrayList<>();
        for (Integer integer : integerList) {
            if(!integerListWithoutDuplicates.contains(integer)){
                integerListWithoutDuplicates.add(integer);
            }
        }
        return integerListWithoutDuplicates;
    }

    public static Set<String> createSet(List<Integer> integerList){
        Set<String> stringSet = new HashSet<>();
        for (Integer integer : integerList) {
            stringSet.add(integer.toString());
        }
        return stringSet;
    }

    public static Map<String, Integer> createMap(Set<String> stringSet, List<Integer> integerList){
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        Iterator<String> stringIterator = stringSet.iterator();
        Iterator<Integer> integerIterator = integerList.iterator();
        while(stringIterator.hasNext()){
            stringIntegerMap.put(stringIterator.next(),integerIterator.next());
        }
        return stringIntegerMap;
    }
}
