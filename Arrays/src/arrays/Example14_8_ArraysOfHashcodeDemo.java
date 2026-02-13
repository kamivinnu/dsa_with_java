package arrays;

/*
 * Example 14.8
 * Hashcode generation
 * Method used: Arrays.deepHashCode()
 */

import java.util.Arrays;

public class Example14_8_ArraysOfHashcodeDemo {

    public static void main(String[] args){

        int intArr[][] = {{10, 20, 15, 22, 35}};

        System.out.println("HashCode: "
                + Arrays.deepHashCode(intArr));
    }
}
