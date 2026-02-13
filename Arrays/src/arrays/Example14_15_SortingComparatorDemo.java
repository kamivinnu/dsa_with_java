package arrays;

/*
 * Example 14.15
 * Sorting using Comparator
 */

import java.util.*;

class Student {

    int rollno;
    String name, address;

    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>{

    public int compare(Student a, Student b){
        return a.rollno - b.rollno;
    }
}

public class Example14_15_SortingComparatorDemo {

    public static void main(String[] args){

        Student[] arr = {
                new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")
        };

        System.out.println("Unsorted");
        for(Student s : arr)
            System.out.println(s);

        Arrays.sort(arr, 1, 3, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for(Student s : arr)
            System.out.println(s);
    }
}
