package arraylist;

/*
 * Example 13.9: Sorting using ArrayList.sort()
 */

import java.util.*;

public class Example13_9_ArrayListSort {

    public static void main(String[] args){

        List<String> names = new ArrayList<>();

        names.add("Lisa");
        names.add("Preeti");
        names.add("Jay");
        names.add("Soma");

        System.out.println("Names: " + names);

        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names: " + names);
    }
}
