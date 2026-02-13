package arraylist;


/*
 * Example 13.8: Sorting using Collections.sort()
 */

import java.util.*;

public class Example13_8_CollectionsSort {

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before: " + numbers);

        Collections.sort(numbers);

        System.out.println("After: " + numbers);
    }
}
