package vector;

import java.util.Vector;

public class Example15_13_VectorCopyDemo {

    public static void main(String[] arg) {

        Vector<Integer> vec = new Vector<>(7);

        for (int i = 1; i <= 7; i++)
            vec.add(i);

        Integer[] arr = new Integer[7];

        vec.copyInto(arr);

        System.out.println("Elements in array:");
        for (Integer num : arr)
            System.out.println(num);
    }
}
