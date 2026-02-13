package vector;

import java.util.Vector;

public class Example15_11_VectorUpdateDemo {

    public static void main(String[] arg) {

        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Mother");
        v.add("Merry");
        v.add(4);

        v.setElementAt(4, 1);

        System.out.println("Vector: " + v);
    }
}
