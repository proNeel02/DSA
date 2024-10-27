package Chapter_1.Creativity;

public class PossibleCombinations {


    static int count = 1;

    public static void possibleCombo(String prefix, String remaining){

        int n = remaining.length();
        if(n == 0) System.out.println(count++ +" : "+prefix);

        for(int i = 0; i < n; i++){
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i  + 1);
            possibleCombo(newPrefix, newRemaining);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello !");
        possibleCombo("","catdog");
    }
}
