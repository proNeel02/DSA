package Chapter_1.Creativity;

import java.util.Scanner;

public class Take {

    public static void doOps(int a, int b, int c){

        if(a + b == c){
            System.out.println(a + " + " +  b + " = "+ c);
        }
        if(a == b - c){
            System.out.println(a + " = " +  b + " - "+ c);
        }
        if(a * b == c){
            System.out.println(a + " * " +  b + " = "+ c);
        }
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a : ");
        int a =  sc.nextInt();

        System.out.println("Enter value for b : ");
        int b =  sc.nextInt();

        System.out.println("Enter value for c : ");
        int c =  sc.nextInt();



     doOps(a, b, c);

        sc.close();
    }
}
