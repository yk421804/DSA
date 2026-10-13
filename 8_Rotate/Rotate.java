public class Rotate {
    public  static void swap(int[] arr,int i,int j){
        while (j>i) {
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;

        }
    }
    public  static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={6,8,1,2,4,9,0};
        print(arr);
        int d=3;
        int n=arr.length-1;
        swap(arr, 0, n);
        swap(arr, 0, n-d);
        swap(arr, 0, d);
        System.out.println(" ");
        print(arr);
    }
}
