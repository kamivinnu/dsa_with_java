package vector;

import java.util.Vector;

public class Example15_12_VectorCloningDemo {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(3);

        Vector<Object> v_clone = (Vector<Object>) v.clone();

        System.out.println("Clone of v: " + v_clone);
    }
}
