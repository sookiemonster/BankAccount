public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(123, "Pass");
    System.out.println("Balance: " + b1.getBalance());
    System.out.println("ID: " + b1.getAccountID());
  }
}
