    package Chapter_1.Reinforcement;

    public class CreditCard {

        private String  customer;
        private String  bank;
        private String account;
        private int limit;
        protected double balance;

        /**
         * Constructs a new credit card instance
         * @param cust the name of the customer
         * @param bk the name of bank
         * @param acnt the account identifier
         * @param lim the credit limit
         * @param initialBal the initial balance
         * **/

            public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
             customer = cust;
             bank = bk;
             account = acnt;
             limit = lim;
             balance = initialBal;
            }

            public CreditCard(String cust, String bk, String acnt, int lim){
            this(cust, bk, acnt,lim,0.0);
            }

            public String getCustomer(){return customer;}
            public String getBank(){return  bank;}
            public String getAccount(){return account;}
            public int getLimit(){return limit;}
            public double getBalance(){return balance;}
            public boolean updateCardLimit(int newLimit){ if(newLimit > 0) {
                this.limit = newLimit;
                return true;
            }
            return false;
            }


        /**
        *  Charges the given price to the card, assuming sufficient credit limit.
         * @param price the amount to be charged
         * @return true if charge was accepted; false if charge was denied
        * */
           public boolean charge(double price){
              if(price + balance > limit) return false;
              balance+=price;
              return true;
            }
     /**
     * Processes customer payment that reduces balance.
      *  @param amount the amount of payment made
     * */
            public boolean makePayment(double amount){
              if(amount > 0){
                  balance-=amount;
       return true;
              }
    return  false;
            }

            public void printSummary(){
                System.out.println("Customer = "+customer);
                System.out.println("Bank = "+bank);
                System.out.println("Account = "+account);
                System.out.println("Balance = "+balance);
                System.out.println("Limit = "+limit);
            }


            @Override
            public String toString(){

                return "Customer : "+customer+"\n"+
                        "Bank    : "+bank+"\n"+
                        "Account : "+account+"\n"+
                        "Balance : "+balance+"\n"+
                        "Limit   : "+limit+"\n";
            }

        public static void main(String[] args) {

            CreditCard[] wallet = new CreditCard[3];
            wallet[0] = new CreditCard("john Bowman", "California Savings","5391 0375 9387 5309",5000);
            wallet[1] = new CreditCard("John Bowman","California Fedral","3485 0399 3395 1954",3500);
            wallet[2] = new CreditCard("John Bowman","California Finance", "5391 0375 9387 5309",2500,300);

            for(int val = 1; val <= 16; val++){
                wallet[0].charge(3*val);
                wallet[1].charge(2*val);

                if(val < 16) {
                    wallet[2].charge(val);
                }
                else {wallet[2].charge(3000);}
            }


            for(CreditCard card : wallet){
//                card.printSummary();
                 System.out.println(card.toString());
                while (card.getBalance() > 200.0){
                    card.makePayment(200);
                    System.out.println("New balance = "+card.getBalance());
                }

            }

        }
    }
