package arraylist;

/*
 * Example 13.4: Insertion into ArrayList
 * -----------------------------------------
 * • add()
 * • addAll()
 * • addAll(index, collection)
 * • add(index, element)
 */

import java.util.ArrayList;

public class Example13_4_InsertionArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();

        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);

        System.out.println(odd);

        ArrayList<Integer> numbers = new ArrayList<Integer>(odd);
        System.out.println(numbers);

        ArrayList<Integer> even1 = new ArrayList<>();
        even1.add(2);
        even1.add(4);
        even1.add(6);

        numbers.addAll(even1);
        System.out.println(numbers);

        ArrayList<Integer> any = new ArrayList<>();
        any.add(8);
        any.add(11);
        any.add(13);

        numbers.addAll(5, any);
        numbers.add(0, 0);

        System.out.println(numbers);

        // numbers.add(100,999); // IndexOutOfBoundsException
    }
}
