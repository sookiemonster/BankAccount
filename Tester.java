public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(123, "Pass");
    System.out.println("Balance: " + b1.getBalance());
    System.out.println("ID: " + b1.getAccountID());
    b1.setPassword("BruhMoment");

    b1.deposit(1.09);
    System.out.println("New balance: " + b1.getBalance());
    System.out.println("Negative Amount: " + b1.deposit(-100.0));
    System.out.println("New balance: " + b1.getBalance());
    System.out.println("$30 Deposit: " + b1.deposit(30.0));
    System.out.println("New balance: " + b1.getBalance());
    System.out.println();
    System.out.println("Sufficient balance: "+ b1.withdraw(10.0));
    System.out.println("New balance: " + b1.getBalance());
    System.out.println("Too large: " + b1.withdraw(2000.0));
    System.out.println("New balance: " + b1.getBalance());
    System.out.println("Negative Amount: " + b1.withdraw(-1.0));
    System.out.println("New balance: " + b1.getBalance());
  }
}
