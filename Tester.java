public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(123, "Pass");
    System.out.println("Balance: " + b1.getBalance());
    System.out.println("ID: " + b1.getAccountID());
    b1.setPassword("BruhMoment");

    b1.deposit(1.09);
    System.out.println("New balance: " + b1.getBalance());
    System.out.println(b1.deposit(-100));
    System.out.println("New balance: " + b1.getBalance());
    System.out.println(b1.deposit(1000.0));
    System.out.println("New balance: " + b1.getBalance());
  }
}
