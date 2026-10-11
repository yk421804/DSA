package Deep_Copy;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr={29,34,543,23,12,34};
        System.out.println(arr[2]);

        int[] y=Arrays.copyOf(arr, arr.length);  // y is deep copy of arr 
        y[2]=200;
        System.out.println("Old array :"+arr[2]);
        System.out.println("New array :"+y[2]);
//
        String [] subjects={"Math","Physic","Chemestry"};
        String [] class1=Arrays.copyOf(subjects,subjects.length);
        String [] class2=Arrays.copyOf(subjects,subjects.length);

        class1[1]="Englsh";
        class2[1]="History";

        System.out.println(class1[1]);
        System.out.println(class2[1]); // separate changes comes for both are

    
    }
}
