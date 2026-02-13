package arraylist;

/*
 * Example 13.2: Creating ArrayList from another collection
 * ----------------------------------------------------------
 * • Demonstrates ArrayList(Collection c) constructor
 * • Shows two independent collections
 * • Demonstrates dynamic resizing
 */

import java.util.ArrayList;

public class Example13_2_CreateFromCollection {

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(2);
        aList.add(3);
        aList.add(5);
        aList.add(7);
        aList.add(11);

        // Create new collection from existing collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(aList);

        numbers.add(13);
        numbers.add(17);

        System.out.println(aList);
        System.out.println(numbers);
    }
}
