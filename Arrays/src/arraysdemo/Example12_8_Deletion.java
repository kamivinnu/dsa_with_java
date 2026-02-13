package arraysdemo;
import java.util.*;

public class Example12_8_Deletion {

    int[] a = new int[100];
    int size=0;

    void create(int n) {
        Scanner in = new Scanner(System.in);
        size=n;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
    }

    int delete(int loc) {

        if(size==0) return -1;

        int item=a[loc];

        for(int i=loc;i<size-1;i++)
            a[i]=a[i+1];

        size--;
        return item;
    }

    void print(){
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){

        Example12_8_Deletion obj=new Example12_8_Deletion();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n=in.nextInt();
        obj.create(n);

        System.out.println("Enter position to delete:");
        int pos=in.nextInt();

        int deleted=obj.delete(pos);
        System.out.println("Deleted item: "+deleted);
        obj.print();
    }
}
