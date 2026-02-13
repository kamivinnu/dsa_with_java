package arraylist;

/*
 * Example 13.1: Creating a simple collection
 * -------------------------------------------------
 * • Demonstrates use of ArrayList constructor
 * • Shows homogeneous collection (String type)
 * • Demonstrates add() method
 * • Shows automatic printing of collection
 */

import java.util.ArrayList;

public class Example13_1_SimpleArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<String>();

        // Adding elements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        // animals.add(2019); // Compile-time error (wrong type)

        // Display entire collection
        System.out.println(animals);
    }
}
