package Maximam_and_Minimam_element_of_array.Minimam;

public class MinimamElement {
    public  static int minimam;
    public static void main(String[] args) {
        int[] arr={123,345,6678,23,89,234,2342};
        Print(arr);
        minimam=arr[0];
        System.out.println("Manimam Element Of array: "+mani(arr));
        int[] arr2={123,456,789,3,6,12,345,};
        System.out.println("Manimam Element of second array: "+mani(arr2));
        
    }
    // method for printing array all elements
    public static void Print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");
    }
    //method for finding the manimam element of array
    public static int mani(int[] y) {
       for (int i = 0; i < y.length; i++) {
        if (minimam>y[i]) {
        minimam=y[i];
         }
       }
       return minimam;
    }
}
