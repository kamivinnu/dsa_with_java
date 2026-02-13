package vector;

import java.util.Vector;

public class Example15_6_VectorDeletionDemo1 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("IIT");
        v.add("Kharagpur");
        v.add(3);

        System.out.println("Vector is: " + v);

        v.clear();

        System.out.println("After clearing: " + v);
    }
}
