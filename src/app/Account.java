package app;

public class Account {
  private String name;
  private String accountNumber;
  private double balance;

  public Account(String name, String surname, String accountNumber, double balance) {
    System.out.println("Your account number " + accountNumber + " was created");
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(double cash) {
    this.balance += cash;
    System.out.println("You have deposited " + cash + " PLN. Your account balance is " + this.balance + "PLN.");
  }

  public void withdraw(double cash) {
    this.balance -= cash;
    System.out.println("You have withdrawn " + cash + " PLN. Your account balance is " + this.balance + "PLN.");
  }

  public String getName() {
    return name;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }
  public static Account createAccount(String name, String accountNumber, double balance) {
    return new Account(name, accountNumber, balance);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Account account = (Account) o;

    if (Double.compare(account.balance, balance) != 0) return false;
    if (name != null ? !name.equals(account.name) : account.name != null) return false;
    return accountNumber != null ? accountNumber.equals(account.accountNumber) : account.accountNumber == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = name != null ? name.hashCode() : 0;
    result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
    temp = Double.doubleToLongBits(balance);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
