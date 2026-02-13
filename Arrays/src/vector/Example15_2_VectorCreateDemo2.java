package vector;

/*
 * Example 15.2
 * Vector with capacity and increment
 * Demonstrates Enumeration
 */

import java.util.*;

public class Example15_2_VectorCreateDemo2 {

    public static void main(String args[]) {

        Vector<Number> v = new Vector<>(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        System.out.println("Capacity after four additions: " + v.capacity());

        v.add(5.45);
        System.out.println("Current capacity: " + v.capacity());

        v.add(6.08);
        v.add(7);

        System.out.println("Current capacity: " + v.capacity());

        v.add(9.4f);
        v.add(10);

        System.out.println("Current capacity: " + v.capacity());

        v.add(11);
        v.add(12);

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Vector contains 3.");

        Enumeration<Number> vEnum = v.elements();

        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");

        System.out.println();
    }
}
