/**
 * SecondLargestElement
 */
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr={10,23,200,40,49,60,20,400};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Max: "+max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>smax && arr[i] !=max) {
                smax=arr[i];
            }
        }
        System.out.println("SMax: "+smax);

    }
}