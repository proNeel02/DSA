package Chapter_1.Reinforcement;

public class SummOfOdd {


    public static int oddSum(int n){

        int sum = 0;
        for(int i = 1; i <= n; i++)if((i & 1) != 0)sum+= i;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Odd Sum --> "+ oddSum(5));
    }
}
