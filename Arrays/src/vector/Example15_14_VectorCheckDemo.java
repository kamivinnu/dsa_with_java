package vector;

import java.util.Vector;

public class Example15_14_VectorCheckDemo {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(4);

        Vector<Object> v2 = new Vector<>();
        v2.add(1);
        v2.add(2);
        v2.add("Java");
        v2.add("Oracle");
        v2.add(4);

        if (v.equals(v2))
            System.out.println("Both vectors are equal");
        else
            System.out.println("Vectors are not equal");
    }
}
