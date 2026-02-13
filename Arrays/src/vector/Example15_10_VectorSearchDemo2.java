package vector;

import java.util.Vector;

public class Example15_10_VectorSearchDemo2 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add(2);
        v.add("Java");
        v.add(4);

        System.out.println("Last occurrence of 2: "
                + v.lastIndexOf(2));
    }
}
