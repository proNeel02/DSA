package Chapter_1.Reinforcement;

public class GameEntry {

    int score;


    public static void main(String[] args) {

        GameEntry [] A = new GameEntry[5];
        A[4] = new GameEntry();
        GameEntry [] B = A.clone();
        A[4].score = 550;

        System.out.println("B[4] --> "+B[4].score);
    }


}
