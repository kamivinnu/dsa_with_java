package arraylist;

/*
 * Example 13.6: Deletion from ArrayList
 * ---------------------------------------
 * • remove(index)
 * • remove(object)
 * • removeAll()
 * • removeIf()
 * • clear()
 */

import java.util.*;
import java.util.function.Predicate;

public class Example13_6_DeletionArrayListDemo {

    public static void main(String[] args){

        ArrayList<String> langs = new ArrayList<>();

        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        langs.add("Spark");

        System.out.println("Initial List: " + langs);

        langs.remove(5);
        System.out.println("After remove(5): " + langs);

        boolean status = langs.remove("Smalltalk");
        System.out.println("Smalltalk removed? : " + status);

        ArrayList<String> script = new ArrayList<>();
        script.add("SQL");
        script.add("Python");
        script.add("Javascript");

        langs.removeAll(script);
        System.out.println("After script removal: " + langs);

        langs.removeIf(s -> s.startsWith("C"));
        System.out.println("After Removing elements starting with C: " + langs);

        langs.clear();
        System.out.println("List empty? " + langs.isEmpty());
    }
}

