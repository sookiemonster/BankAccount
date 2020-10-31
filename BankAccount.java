public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String ps) {
    this.accountID = id;
    this.password = ps;
    this.balance = 0.0;
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

  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    } else {
      this.balance += amount;
      return true;
    }
  }

  public boolean withdraw(double amount) {
    if (amount > this.balance || amount < 0) {
      return false;
    } else {
      this.balance -= amount;
      return true;
    }
  }

  public String toString() {
    return "#" + this.accountID + "\t$" + this.balance;
  }

  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && withdraw(amount) ) {
      if (other.deposit(amount)) {
        return true;
      } else {
        System.out.println("ERROR");
      }
    }
    return false;
  }
}
