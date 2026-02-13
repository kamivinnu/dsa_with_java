package vector;

import java.util.*;

public class Example15_8_VectorDeletionDemo3 {

    public static void main(String[] arg) {

        Vector<Integer> vec = new Vector<>(7);
        Vector<Integer> vecRetain = new Vector<>(4);

        for (int i = 1; i <= 7; i++)
            vec.add(i);

        vecRetain.add(5);
        vecRetain.add(3);
        vecRetain.add(2);

        System.out.println("Calling retainAll()");
        vec.retainAll(vecRetain);

        System.out.println("Numbers after removal:");
        for (Integer num : vec)
            System.out.println(num);
    }
}
