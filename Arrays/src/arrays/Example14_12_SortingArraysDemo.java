package arrays;

/*
 * Example 14.12
 * Simple sorting
 * Method used: Arrays.sort()
 */

import java.util.Arrays;

public class Example14_12_SortingArraysDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        Arrays.sort(intArr);

        System.out.println("Sorted Array: "
                + Arrays.toString(intArr));
    }
}
