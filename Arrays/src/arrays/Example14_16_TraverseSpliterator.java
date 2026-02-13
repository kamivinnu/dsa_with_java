package arrays;

/*
 * Example 14.16
 * Traversing using Spliterator
 */

import java.util.Arrays;

public class Example14_16_TraverseSpliterator {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Spliterator: "
                + Arrays.spliterator(intArr));
    }
}
