package vector;

import java.util.*;

public class Example15_5_VectorInsertionDemo3 {

    public static void main(String[] arg) {

        ArrayList<Object> arr = new ArrayList<>();

        arr.add(3);
        arr.add("Oracle");
        arr.add("Java");
        arr.add(4);

        Vector<Object> v = new Vector<>();

        v.addAll(arr);

        System.out.println("Vector v: " + v);
    }
}
