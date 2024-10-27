package Chapter_1.Reinforcement;

public class SquareSum {

    public static long squareSum(int n){

        long sum = 0;
        for(int i = 1; i <= n; i++) sum += i * i;
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(squareSum(10));
    }
}
