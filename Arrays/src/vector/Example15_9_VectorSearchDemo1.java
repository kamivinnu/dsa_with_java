package vector;

import java.util.Vector;

public class Example15_9_VectorSearchDemo1 {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("C++");
        v.add("Python");
        v.add(3);

        if (v.contains("Java"))
            System.out.println("The element exists");
        else
            System.out.println("The element does not exist");
    }
}
