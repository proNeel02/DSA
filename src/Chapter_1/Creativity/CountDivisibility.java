package Chapter_1.Creativity;

import java.util.Scanner;

public class CountDivisibility {



    public static int countDivision(int num){


        int count = 0;

        while(num >= 2){
            num /= 2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Greater Than 2 :");
        int result = countDivision(sc.nextInt());
        System.out.println("count of Division :- "+result);
        sc.close();
    }
}
