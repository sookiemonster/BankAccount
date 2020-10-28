public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String ps) {
    accountID = id;
    password = ps;
    balance = 0.00;
  }
}
