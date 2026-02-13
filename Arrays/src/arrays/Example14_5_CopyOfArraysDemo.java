package arrays;

/*
 * Example 14.5
 * Copying an array
 * Method used: Arrays.copyOf()
 */

import java.util.Arrays;

public class Example14_5_CopyOfArraysDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(Arrays.copyOf(intArr, 10)));
    }
}
