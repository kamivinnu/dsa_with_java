package vector;

import java.util.Vector;

public class Example15_4_VectorInsertionDemo2 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>(5);

        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add("Samanta");
        v.add(3);
        v.add(6.9);

        v.insertElementAt(7, 5);

        System.out.println("Vector is " + v);
    }
}
