package arrays;

/*
 * Example 14.2
 * Stream representation of arrays
 * Method used: Arrays.stream()
 */

import java.util.Arrays;

public class Example14_2_ArraysToStreamDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Array Stream: "
                + Arrays.stream(intArr));
    }
}
