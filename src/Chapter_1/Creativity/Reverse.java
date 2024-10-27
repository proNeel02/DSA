package Chapter_1.Creativity;

public class Reverse {

    public static int[] reverse(int[] nums){
//        int[] result = new int[nums.length];
//
//        for(int ele : nums) System.out.print(ele+" --> ");
//        for(int i = result.length - 1; i >= 0; i--) result[result.length-1 - i] = nums[i];
//        for(int ele : result) System.out.print(ele+" --> ");


        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return  nums;
    }

    public static void main(String[] args) {
        int[] result = reverse(new int[] {1,2,3,4,5,6,7,8,9,10});

        for(int ele : result) System.out.print(ele+" --> ");
    }
}