package vector;

import java.util.Vector;

public class Example15_7_VectorDeletionDemo2 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("India");
        v.add("Japan");
        v.add(4);

        v.removeElementAt(0);

        System.out.println("After removal: " + v);

        v.removeElement("Japan");

        System.out.println("After removal: " + v);
    }
}
