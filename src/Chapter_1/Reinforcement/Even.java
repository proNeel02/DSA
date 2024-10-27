package Chapter_1.Reinforcement;

public class Even {

    public static boolean isEven(int i){
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
    }
}
