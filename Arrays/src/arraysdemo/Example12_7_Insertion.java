package arraysdemo;
import java.util.*;

public class Example12_7_Insertion {

    int[] a = new int[100];
    int size = 0;

    void create(int n) {
        Scanner in = new Scanner(System.in);
        size = n;
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();
    }

    void insert(int item, int loc) {

        if(size == a.length) {
            System.out.println("Overflow");
            return;
        }

        for(int i=size;i>loc;i--)
            a[i] = a[i-1];

        a[loc] = item;
        size++;
    }

    void print() {
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {

        Example12_7_Insertion obj = new Example12_7_Insertion();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = in.nextInt();
        obj.create(n);

        System.out.println("Enter element to insert:");
        int item = in.nextInt();

        System.out.println("Enter position:");
        int pos = in.nextInt();

        obj.insert(item,pos);
        obj.print();
    }
}
