package vector;

/*
 * Example 15.3
 * insertElementAt()
 */

import java.util.Vector;

public class Example15_3_VectorInsertionDemo1 {

    public static void main(String[] arg) {

        Vector<Integer> vec = new Vector<>(7);

        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        vec.insertElementAt(10, 7);

        System.out.println("Vector: " + vec);
    }
}
