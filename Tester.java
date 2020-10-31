public class Tester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(123, "Pass");
    BankAccount b2 = new BankAccount(456, "Pass");
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
    System.out.println();
    System.out.println(b1);
    System.out.println(b2);
    System.out.println("Transfer: " + b1.transferTo(b2, 21.09, "BruhMoment"));
    System.out.println("b1: " + b1);
    System.out.println("b2: " + b2);
    System.out.println("Transfer: " + b2.transferTo(b1, 10.00, "BruhMoment"));
    System.out.println("b1: " + b1);
    System.out.println("b2: " + b2);
    System.out.println("Transfer: " + b2.transferTo(b1, 10.00, "Pass"));
    System.out.println("b1: " + b1);
    System.out.println("b2: " + b2);
    System.out.println("Transfer: " + b2.transferTo(b1, 22.00, "Pass"));
    System.out.println("b1: " + b1);
    System.out.println("b2: " + b2);
  }
}
