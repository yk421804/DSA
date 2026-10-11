package Sort_Array_Built-In_Method;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int[] arr={10,4,2,1,7,9,34,12,13,65};
        Print(arr);
        Arrays.sort(arr);    // Arrays is a class of util package and sort is
        //                   // the method of Arrays class used for array sorting
        Print(arr);
        long end=System.currentTimeMillis();
         System.out.println("Time of execution : "+(end-startTime)+" Milisecond");
    }
     public static void Print(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+"   ");
        }
        System.out.println(" ");
         
    }
}
