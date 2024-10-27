package Chapter_1.Reinforcement;

public class RemovePuctuations {



    public static String opration(String s){
        StringBuilder   result = new StringBuilder();
        for(char c : s.toCharArray()) if(!("!.,?;:'\\\"()[]{}-".indexOf(c) >= 0)) result.append(c);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(opration("Let's try, Mike!"));
    }

}

