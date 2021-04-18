package app;

public class Account {
  private String name;
  private String surname;
  private String accountNumber;
  private double balance;
  private double transferAmount;

  public Account(String name, String surname, String accountNumber, double balance) {
    System.out.println("Your account number " + accountNumber + " was created");
    this.name = name;
    this.surname = surname;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void Deposit(double cash) {
    this.balance += cash;
    System.out.println("You have deposited " + cash + " PLN. Your account balance is " + this.balance + "PLN.");
  }

  public void Withdraw(double cash) {
    this.balance -= cash;
    System.out.println("You have withdrawn " + cash + " PLN. Your account balance is " + this.balance + "PLN.");
  }

  public void Transfer(Account p, double cash) {
    if (cash <= balance) {
      this.Withdraw(cash);
      p.Deposit(cash);
    } else {
      System.out.println("You want to withdraw too much");
    }

  }
}
