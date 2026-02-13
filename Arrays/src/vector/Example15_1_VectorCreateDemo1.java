package vector;

/*
 * Example 15.1
 * Creating a Vector (Default capacity = 10)
 */

import java.util.Vector;

public class Example15_1_VectorCreateDemo1 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add(3.4);
        v.add("Samanta");

        System.out.println("Vector is " + v);
    }
}
