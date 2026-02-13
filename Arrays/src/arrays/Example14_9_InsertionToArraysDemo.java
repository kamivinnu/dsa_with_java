package arrays;

/*
 * Example 14.9
 * Filling array
 * Method used: Arrays.fill()
 */

import java.util.Arrays;

public class Example14_9_InsertionToArraysDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};
        int intKey = 22;

        Arrays.fill(intArr, intKey);

        System.out.println("After filling: "
                + Arrays.toString(intArr));
    }
}
