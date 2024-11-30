package chapter_2;

public class Exceptions {

    private static int DEFAULT = 20;

    public static void main(String[] args) {

        int n =  DEFAULT;

        try{
            n = Integer.parseInt(args[0]);
            if(n <= 0){
                System.out.println("n must be positive. Using Default.");
            }
        }
        catch (ArrayIndexOutOfBoundsException  | NumberFormatException e){
            System.out.println("Using default value for n.");
            n = DEFAULT;
        }

    }
}
