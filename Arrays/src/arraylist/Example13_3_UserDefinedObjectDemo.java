package arraylist;

/*
 * Example 13.3: ArrayList of User Defined Objects
 * --------------------------------------------------
 * • Demonstrates generics with custom class
 * • Duplicate entries allowed
 * • Dynamic growth of ArrayList
 */

import java.util.ArrayList;

public class Example13_3_UserDefinedObjectDemo {

    public static void main(String[] args) {

        ArrayList<Person13> pList = new ArrayList<Person13>(5);

        pList.add(new Person13("Ram", 25));

        Person13 p2 = new Person13("Sita", 22);
        pList.add(p2);

        pList.add(new Person13("John", 34));
        pList.add(p2); // duplicate allowed

        pList.add(new Person13("Rahim", 29));
        pList.add(new Person13("Lilly", 24));

        pList.forEach(p -> p.printData());
    }
}
