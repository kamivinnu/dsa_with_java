package arraysdemo;
import java.util.*;

public class Example12_3_ArrayInitializationDemo {

    int[] a = new int[100];
    int size;

    void loadArray() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter size < 100");
        size = in.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + "th number ");
            a[i] = in.nextInt();
        }

        System.out.println("Length = " + a.length);

        for(int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        new Example12_3_ArrayInitializationDemo().loadArray();
    }
}
