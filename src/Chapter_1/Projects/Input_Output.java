package Chapter_1.Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input_Output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

       while(true){
           String line = sc.nextLine();
           if(line.equalsIgnoreCase("exit")) break;
           lines.add(line);
       }

       System.out.println("lines : ==> "+lines);
       for(int i = lines.size() - 1; i >= 0; i--) System.out.println(lines.get(i));

    }
}
