        package Chapter_1.Creativity;
        public class FindLandS {

             private static int largetNum;
             private static int smallNum;


            public static void findLargestAndSmall(int[] nums) {

                largetNum = Integer.MIN_VALUE;
                smallNum = Integer.MAX_VALUE;

                for (int num : nums) {

                    if (largetNum < num)
                        largetNum = num;

                    if (smallNum > num)
                        smallNum = num;
                }
            }

            public static void main(String[] args) {
                int[] nums = new int[] {4,5,7,-2,56,0,60,-1};

                findLargestAndSmall(nums);
                System.out.println("large --> "+largetNum);
                System.out.println("small --> "+smallNum);
            }

        }