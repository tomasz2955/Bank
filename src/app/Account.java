package app;

public class Account {

  private int accountNumber;
  private int balance = 0;

  public int getBalance() {
    return balance;
  }

  // konstruktor w którym inicjalizujesz accountNumber

  // TODO my chcemy zmienic wartosc a nie nadpisac
  public void setBalance(int balance) {
    this.balance = balance;
  }
}
