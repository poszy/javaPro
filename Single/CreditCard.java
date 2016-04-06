public class CreditCard{

  // Instance Variables
  private String customer;
  private String bank;
  private String account;
  private int limit;
  private double balance;


  // Constructors
  public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;

  } // End Constructor CreditCard

  public CreditCard(String cust, String bk, String acnt, int lim){

      this(cust,bk,acnt,lim,0.0);

  } // End CreditCard

  // Accessor Methods
  public String getCustomer(){return customer;}
  public String getBank(){return bank;}
  public String getAccount(){return account;}
  public int getLimit(){return limit;}
  public double getBalance(){return balance;}

  // Update Methods
  public boolean charge(double price){
    if(price + balance > limit){
      return false;
    } // End If

    else{
      balance += price;
      return true;
    } // End Else

  } // End Charge

  public void makePayment(double amount){
    balance -= amount;
  } // End makePayment

  public static void printSummary(CreditCard card){
    System.out.println("Custmomer = " + card.customer);
    System.out.println("Bank = " + card.bank);
    System.out.println("Account = " + card.account);
    System.out.println("Balance = " + card.balance);
    System.out.println("Limit = " + card.limit);

  } // End Print Summary

  public static void main(String[] args){

    CreditCard[] wallet = new CreditCard[3];
    wallet[0] = new CreditCard("John Bowman", "California Savings"," 5931 0375 9387 5309", 5000);
    wallet[1] = new CreditCard("John Bowman", "California Federal"," 3485 0399 3395 1954", 3500);
    wallet[2] = new CreditCard("John Bowman", "California Finance"," 5931 0375 9387 5309", 2500,300);

    for (int val = 1; val <= 16; val++){
      wallet[0].charge(3*val);
      wallet[1].charge(2*val);
      wallet[2].charge(val);
    } // End For

    for (CreditCard card : wallet){
      CreditCard.printSummary(card);
      while(card.getBalance()>200.0){
        card.makePayment(200);
        System.out.println("New balance = " + card.getBalance());
      } // End While
    } // End For
  } // End Main
} // End Class
