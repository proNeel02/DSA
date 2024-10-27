package Chapter_1.Creativity;

public class FindEvenPairsProduct {


    public static void getEvenProductPair(int[] nums){


    // prefix product
    //   0 1 2 3 4 5 6 7     0 1 2 3   4   5    6    7
    //  [1,2,3,4,5,6,7,8] = [1,2,6,24,120,720,5040,40320];


    // suffix product
         //   0 1 2 3 4 5 6 7     0      1    2      3   4    5  6  7
        //  [1,2,3,4,5,6,7,8] = [40320,40320,20160,6720,1680,336,56,8];



//        for(int i = 0; i < nums.length-1; i++){
//
//            int num1 = nums[i];
//
//            for(int j = i+1; j < nums.length; j++){
//                int num2 = nums[j];
//                if(((num1 * num2) & 1) == 0)
//                    System.out.println("pair -> "+num1+" "+num2);
//
//            }
//
//        }


        int oddNum = 0;

        for(int num : nums){
            if((num & 1) == 0) {
                System.out.println("There is Even Product is present");
           break;

            }else{
                oddNum++;
            }
        }

        if(oddNum == nums.length)
            System.out.println("There is No Even Product pair is Present");

    }

    public static void main(String[] args) {

        getEvenProductPair(new int[] {1,2,3,4,5,6,7,8});
    }
}
