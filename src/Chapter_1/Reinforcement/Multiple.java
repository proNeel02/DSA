package Chapter_1.Reinforcement;

public class Multiple {

    public static boolean isMultiple(long n, long m){
        if(m == 0) return false;
        return n % m == 0;
    }

    public static void main(String[] args) {
    System.out.println("result --> "+isMultiple(10, 5));
    }
}
