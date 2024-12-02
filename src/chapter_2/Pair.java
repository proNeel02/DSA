package chapter_2;

public class Pair<A,B> {

    private final A first;
    private final B second;

    public Pair(A a, B b){
        first = a;
        second = b;
    }

    public A getFirst(){return first;}
    public B getSecond(){return second;}


    public static void main(String[] args) {

    Pair<String, Double>[] holdings;
//    holdings = new Pair<String, Double>[25]; illegal way of doing compiler error
        holdings = new Pair[25];
        holdings[0] = new Pair<>("ORCL", 32.07);
        holdings[1] = new Pair<>("ONGC", 12.5);

    }

}
