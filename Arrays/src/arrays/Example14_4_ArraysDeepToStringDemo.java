package arrays;

/*
 * Example 14.4
 * deepToString() for nested arrays
 */

import java.util.Arrays;

public class Example14_4_ArraysDeepToStringDemo {

    public static void main(String[] args){

        int intArr[][] = {{10, 20, 15, 22, 35}};

        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr));
    }
}
