public class Reverse {
 public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
         int j=arr.length-1;
         int i=0;
         int temp=0;
         while (i<j) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }
        System.out.println("  ");
        for (int f = 0; f <arr.length; f++) {
            System.out.print(arr[f]+"  ");
        }
    }
}
