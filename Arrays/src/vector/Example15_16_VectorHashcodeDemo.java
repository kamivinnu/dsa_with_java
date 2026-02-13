package vector;

import java.util.Vector;

public class Example15_16_VectorHashcodeDemo {

    public static void main(String[] arg) {

        Vector<Integer> vec = new Vector<>(7);

        for (int i = 1; i <= 7; i++)
            vec.add(i);

        System.out.println("Hash code: " + vec.hashCode());
    }
}
