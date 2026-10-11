
package Shallow_Copy;
public class ShallowCopy {
    public static void main(String[] args) {
        int[] x={12,3,5,76};
        System.out.println(x);
        int[] y=x;       // y is the shallow copy of x
        y [2] =20;
        // x and y both are points to one address
        // if y bring the changes, the changes also comes for x
        System.out.println("this is the y value: "+y[2]);
        System.out.println("this is the x value: "+x[2]);

//
        String [] subjects={"Math","Physic","Chemestry"};
        String [] class1=subjects;
        String [] class2=subjects;

        class1[1]="English";
        class2[1]="History";

        System.out.println(class1[1]);
        System.out.println(class2[1]); // the last changes coms for both
        
    }
}
