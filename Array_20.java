import java.util.*;

public class Array_20{
    public static void main(String args[]){
        int[] num = {0,1,2,3};
        System.out.println("old array is "+ Arrays.toString(num));
        Change(num);
        System.out.println("old array is "+ Arrays.toString(num));
    }

    static void Change(int[] arr){
        arr[0]=99;
    }
}