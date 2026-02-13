package arrays;

/*
 * Example 14.10
 * Binary search
 * Method used: Arrays.binarySearch()
 */

import java.util.Arrays;

public class Example14_10_BinarySearchArraysDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        Arrays.sort(intArr);

        int intKey = 22;

        System.out.println(intKey
                + " found at index = "
                + Arrays.binarySearch(intArr, intKey));
    }
}
