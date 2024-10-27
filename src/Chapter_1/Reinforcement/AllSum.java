package Chapter_1.Reinforcement;

public class AllSum {


    public static int returnSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(returnSum(20));
    }
}


