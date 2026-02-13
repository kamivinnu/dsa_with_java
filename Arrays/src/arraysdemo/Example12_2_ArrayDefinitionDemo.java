package arraysdemo;

/* Different ways to declare and initialize arrays */
public class Example12_2_ArrayDefinitionDemo {

    public static void main(String[] args) {

        float[] x = new float[100];
        String[] newArgs = new String[10];

        boolean[] isPrime = new boolean[1000];
        int[] fib = {0,1,1,2,3,5,8,13};

        short[][][] b = new short[4][10][5];

        double[][] a = {{1.1,2.2},{3.3,4.4},null,{5.5,6.6},null};
        a[4] = new double[66];
        a[4][65] = 3.14;

        Object[] objects = {x, newArgs, isPrime, fib, b, a};
    }
}
