package Array_Print_Method_Making;

public class MakingPrintMethod {
    public static void main(String[] args) {

        int[] arr={12,34,4,56,34,2,12,15};
        printMethod(arr);
        
        int[] arr2={34,34,234234,234,123,123,123};

        printMethod(arr2);
    }
     // Method for printing array elements
    public static void printMethod(int[] y) {
       for (int i = 0; i < y.length; i++) {
        System.out.print(y[i]+" ");
       }
       System.out.println(" ");
    }
}
