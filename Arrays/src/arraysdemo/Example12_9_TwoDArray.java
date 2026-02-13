package arraysdemo;
import java.util.*;

public class Example12_9_TwoDArray {

    int[][] a;
    int row,col;

    Example12_9_TwoDArray(int r,int c){
        row=r;
        col=c;
        a=new int[row][col];
    }

    void initialize(){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                a[i][j]=in.nextInt();
    }

    void print(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    Example12_9_TwoDArray add(Example12_9_TwoDArray b){

        Example12_9_TwoDArray result=
                new Example12_9_TwoDArray(row,col);

        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                result.a[i][j]=this.a[i][j]+b.a[i][j];

        return result;
    }

    public static void main(String[] args){

        Example12_9_TwoDArray x=
                new Example12_9_TwoDArray(2,2);
        Example12_9_TwoDArray y=
                new Example12_9_TwoDArray(2,2);

        System.out.println("Enter matrix 1:");
        x.initialize();

        System.out.println("Enter matrix 2:");
        y.initialize();

        Example12_9_TwoDArray z=x.add(y);
        System.out.println("Addition Result:");
        z.print();
    }
}
