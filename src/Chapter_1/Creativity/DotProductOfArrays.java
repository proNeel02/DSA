package Chapter_1.Creativity;
import java.util.Arrays;
public class DotProductOfArrays {

    public static int[] dotProduct(int[] a, int[] b){

        if(a.length != b.length){
            System.out.println("Both Arrays should have same length!");
            return new int[0];
        }

        int[] c = new int[a.length];
        for(int i = 0; i < c.length; i++)c[i] = a[i] * b[i];
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] a = new int[] {1,2,4};
        int[] b = new int[] {5,6,7,8};
     System.out.println(Arrays.toString(dotProduct(a,b)));
    }
}