package Maximam_and_Minimam_element_of_array.Maximam;

public class MaximamElement {
    public static int max;
    public static void main(String[] args) {
        int[] arr={32,4,5,943,2340,23,245};
        Print(arr);     
        max=arr[0];
        System.out.println("Maximam Element Of array:  "+Max(arr));//calling maximam method
    }
    public static void Print(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+"  ");
        }
        System.out.println(" ");
    }
    // Method for Finding maximam Element of array

    public static int Max(int[] y) {
        for (int i = 0; i < y.length; i++) {
            if (max<y[i]) {
                max=y[i];
            }
        }
        return max;
    }

}
