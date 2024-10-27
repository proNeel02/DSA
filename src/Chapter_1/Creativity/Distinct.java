package Chapter_1.Creativity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Distinct {

    public static boolean isDistinct(float[] nums){
        HashSet<Float> floatSet =  new HashSet<>();
        for(float num : nums){
            if(!floatSet.contains(num)) {
                floatSet.add(num);
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter a Array Size : ");
       int size = sc.nextInt();

       float[] nums = new float[size];

       int i = 0;
        while(size > 0){
            nums[i++] = sc.nextFloat();
            --size;
        }

        sc.close();
        System.out.println(Arrays.toString(nums));

        boolean result = isDistinct(nums);

        System.out.println("result --> "+result);
    }
}