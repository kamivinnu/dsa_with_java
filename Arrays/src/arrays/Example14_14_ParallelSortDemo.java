package arrays;

/*
 * Example 14.14
 * Parallel sorting
 * Method used: Arrays.parallelSort()
 */

import java.util.Arrays;

public class Example14_14_ParallelSortDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        Arrays.parallelSort(intArr);

        System.out.println("Parallel Sorted: "
                + Arrays.toString(intArr));
    }
}
