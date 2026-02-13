package arrays;

/*
 * Example 14.13
 * Sorting sublist
 */

import java.util.Arrays;

public class Example14_13_SortingSublistDemo {

    public static void main(String[] args){

        int intArr[] = {10, 20, 15, 22, 35};

        Arrays.sort(intArr, 1, 3);

        System.out.println("Sorted Sublist: "
                + Arrays.toString(intArr));
    }
}
