package vector;

import java.util.Vector;

public class Example15_15_VectorStringDemo {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add("Samanta");
        v.add(4);

        System.out.println("String equivalent: " + v.toString());
    }
}
