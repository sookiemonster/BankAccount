public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String ps) {
    accountID = id;
    password = ps;
    balance = 0.0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

}
