package LinearSearch;
public class LinearSearchInArray {
    public static void main(String[] args) {
        
       int[] arr={12,324,5,678,8,34,223};

       int target=34;
       int a=arr[0];
       int index=0;
       boolean flage=false;

       for (int i = 0; i < arr.length; i++) {
        if (arr[i]==target) {
            a=arr[i];
            index=i;
            flage=true;
            break;
        }
       }
       if (flage) {
        System.out.println("Target exist:  "+a+" in index: "+index);
       }
       else{
        System.out.println("Target is messing");
       }
       
    }
}
