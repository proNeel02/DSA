package chapter_2.course_2;
import Chapter_1.Reinforcement.CreditCard;


public class PredatoryCreditCard extends CreditCard {

    private double apr; // annual percentage rate
    //constructor for this class
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initalBal, double rate){
        super(cust, bk, acnt, lim, initalBal);
        apr = rate;
    }
    
 // A method for assessing monthly interest charges
    public void processMonth(){

        // only charge interest on positive balance
        if(balance > 0){
               double monthlyFactor = Math.pow(1 + apr, 1.0/12);
               balance *= monthlyFactor;
        }
    }

    // Overriding the charge method defined in the superclass
    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess) balance+=5;
        return isSuccess;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!!!");
    }
}