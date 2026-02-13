package arraylist;


/*
 * Example 13.7: Searching in ArrayList
 * --------------------------------------
 * • contains()
 * • indexOf()
 * • lastIndexOf()
 */

import java.util.ArrayList;

public class Example13_7_SearchingArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Bob exists? : " + names.contains("Bob"));
        System.out.println("indexOf Steve: " + names.indexOf("Steve"));
        System.out.println("lastIndexOf John: " + names.lastIndexOf("John"));
    }
}
