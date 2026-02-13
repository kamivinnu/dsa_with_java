package arraysdemo;

public class Example12_5_PrintingArrays {

    public static void print(int[] a) {
        System.out.print("{");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }

    public static void print(Object[] a) {
        System.out.print("{");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if(i < a.length-1) System.out.print(", ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        int[] a = {22,44,66,88};
        print(a);

        int[] b = a.clone();
        print(b);

        String[] c = {"AB","CD","EF"};
        print(c);

        String[] d = c.clone();
        print(d);

        c[1] = "XYZ";
        print(c);
        print(d);
    }
}
