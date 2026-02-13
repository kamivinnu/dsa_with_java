package arraysdemo;

public class Example12_6_GenericReverse<T> {

    private T[] array;

    public Example12_6_GenericReverse(T[] array) {
        this.array = array;
    }

    public void reverse(int start, int end) {
        if(start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverse(start+1, end-1);
        }
    }

    public void print() {
        for(T item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,6};
        Example12_6_GenericReverse<Integer> intObj =
                new Example12_6_GenericReverse<>(nums);
        intObj.reverse(0, nums.length-1);
        intObj.print();

        String[] vowels = {"A","E","I","O","U"};
        Example12_6_GenericReverse<String> strObj =
                new Example12_6_GenericReverse<>(vowels);
        strObj.reverse(0, vowels.length-1);
        strObj.print();
    }
}
