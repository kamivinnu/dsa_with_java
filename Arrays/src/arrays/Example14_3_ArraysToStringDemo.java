package arrays;

/*
 * Example 14.3
 * Converting array items into String
 * Method used: Arrays.toString()
 */

import java.util.Arrays;

public class Example14_3_ArraysToStringDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}
