package arrays;

/*
 * Example 14.17
 * Traversing sublist using Spliterator
 */

import java.util.Arrays;

public class Example14_17_ArraysTraversalDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Sublist Spliterator: "
                + Arrays.spliterator(intArr, 1, 3));
    }
}
