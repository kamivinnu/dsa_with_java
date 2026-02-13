package arrays;

/*
 * Example 14.7
 * Comparing arrays
 * Method used: Arrays.deepEquals()
 */

import java.util.Arrays;

public class Example14_7_CompareArraysDemo {

    public static void main(String[] args){

        int intArr1[][] = {{10, 20, 15, 22, 35}};
        int intArr2[][] = {{10, 15, 22}};

        System.out.println("Comparison result: "
                + Arrays.deepEquals(intArr1, intArr2));
    }
}
