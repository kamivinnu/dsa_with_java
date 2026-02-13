package arraysdemo;
import java.util.*;

public class Example12_4_ArrayRandomDemo {

    int[] a = new int[100];
    int size;
    int MIN = 1, MAX = 100;

    int generateRandom(int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {

        Example12_4_ArrayRandomDemo obj = new Example12_4_ArrayRandomDemo();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size < 100");
        obj.size = in.nextInt();

        for(int i = 0; i < obj.size; i++)
            obj.a[i] = obj.generateRandom(obj.MIN, obj.MAX);

        System.out.println("Capacity = " + obj.a.length + " Size = " + obj.size);

        for(int i = 0; i < obj.size; i++)
            System.out.print(obj.a[i] + " ");
    }
}
