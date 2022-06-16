package org.endava.tmd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> anArraylist = new ArrayList<>();
        anArraylist.add(23);
        anArraylist.add(5);
        anArraylist.add(1);
        anArraylist.add(4);
        anArraylist.add(7);

        System.out.println("\nPrinting number of prime numbers in the ArrayList");
        System.out.println(countPrimeNumbersFromAList(anArraylist));

        List<Integer> aLinkedList = new LinkedList<>();
        aLinkedList.add(23);
        aLinkedList.add(7);
        aLinkedList.add(9);
        aLinkedList.add(11);
        aLinkedList.add(2);

        System.out.println("\nPrinting number of prime numbers in the LinkedList");
        System.out.println(countPrimeNumbersFromAList(aLinkedList));
    }

    public static <E> int countPrimeNumbersFromAList(List<E> inputList){
        int counter = 0;
        for(E element: inputList){
            if(isPrime(element)){
                counter++;
            }
        }
        return counter;
    }

    public static <E> boolean isPrime(E number){
        if((int) number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt((int)number); i++){
            if((int)number % i == 0){
                return false;
            }
        }
        return true;
    }
}
