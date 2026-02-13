package arrays;

/*
 * Example 14.1
 * Converting an array to a collection object
 * Method used: Arrays.asList()
 */

import java.util.Arrays;

public class Example14_1_ArrayToListDemo {

    public static void main(String[] args) {

        int intArr[] = {10, 20, 15, 22, 35};

        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));
    }
}
