package chapter_2;

public class TestProgression {

    public static void main(String[] args) {

        AbstractProgression prog;

        // test Arithmetic Progression
        // System.out.println("Arithmetic Progression with Default increment");
//
//        prog = new ArithmeticProgression();
//        prog.printProgression(10);

//        System.out.println("Arithmetic Progression with increment 5: ");
//        prog = new ArithmeticProgression(5);
//        prog.printProgression(10);

//        System.out.println("Arithmetic Progression with start 2: ");
//        prog = new ArithmeticProgression(5,2);
//        prog.printProgression(10);

        // test Geometric Progression

//        System.out.println("Geometric Progression With Default base");
//       prog = new GeometricProgression();
//       prog.printProgression(10);


//        System.out.println("Geometric Progression With base 3: ");
//        prog = new GeometricProgression(3);
//        prog.printProgression(10);


        // test FibonacciProgression

//        System.out.println("Fibonacci Progression with default start values: ");
//        prog = new FibonacciProgression();
//        prog.printProgression(10);

        System.out.println("Fibonacci Progression with start value 4 and 6 : ");
        prog = new FibonacciProgression(4,6);
        prog.printProgression(10);

    }
}
