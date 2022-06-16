package org.endava.tmd;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] integerArray = {4, 5, 9, 11};
        Double[] doubleArray = {2.3, 6.1, 4.5, 9.1};

        System.out.println("\nPrint integer array");
        printArray(integerArray);

        changePositionsInArray(integerArray, 1, 3);
        System.out.println("\nPrint integer array changed");
        printArray(integerArray);

        System.out.println("\nPrint double array");
        printArray(doubleArray);

        changePositionsInArray(doubleArray,0,2);
        System.out.println("\nPrint double array changed");
        printArray(doubleArray);

    }
    public static <E> void changePositionsInArray(E[] inputArray, int firstIndex, int secondIndex){
        E aux = inputArray[firstIndex];
        inputArray[firstIndex] = inputArray[secondIndex];
        inputArray[secondIndex]=aux;
    }

    public static <E> void printArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
        }
    }
}
