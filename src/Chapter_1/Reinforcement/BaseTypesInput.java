package Chapter_1.Reinforcement;

import java.util.Scanner;
public class BaseTypesInput{



    public static void inputAllBaseTypes(){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter a short value: ");
        short shortValue = scanner.nextShort();

        System.out.println("Enter a int value: ");
        int intValue = scanner.nextInt();

        System.out.println("Enter a long value: ");
        long longValue = scanner.nextLong();

        System.out.println("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Enter a char value: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("\nYou entered:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("char: " + charValue);

    }


    public static void main(String [] args){
        inputAllBaseTypes();
    }

}
