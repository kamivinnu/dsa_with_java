package arraylist;


/*
 * Example 13.10: Sorting an ArrayList of User Defined Objects
 * -------------------------------------------------------------
 * • Demonstrates sorting using lambda expression
 * • Demonstrates Comparator.comparingInt()
 * • Demonstrates Collections.sort() with Comparator
 * • Sorting by Age
 * • Sorting by Name
 */

import java.util.*;

public class Example13_10_ObjectSort {

    public static void main(String[] args) {

        List<PersonSort> people = new ArrayList<>();

        people.add(new PersonSort("Sachin", 47));
        people.add(new PersonSort("Chris", 34));
        people.add(new PersonSort("Rajeev", 25));
        people.add(new PersonSort("David", 31));

        System.out.println("Person List : " + people);

        // Sort People by Age using lambda
        people.sort((person1, person2) ->
                person1.getAge() - person2.getAge());

        System.out.println("Sorted Person List by Age : " + people);

        // More concise way
        people.sort(Comparator.comparingInt(PersonSort::getAge));

        // Sort using Collections.sort() by Name
        Collections.sort(people,
                Comparator.comparing(PersonSort::getName));

        System.out.println("Sorted Person List by Name : " + people);
    }
}
