package app;

public class AccountService {

  private AccountRepository repository;

  public AccountService(AccountRepository repository) {
    this.repository = repository;
  }

  public void deposit(String accountNumber, double value) {
    Account account = repository.getAccountByAccountNumber(accountNumber);
    account.deposit(value);
  }

  public void withdraw(String accountNumber, double value) {
    //TODO sprawdzic czy mozesz tyle wypłacić
  }

  public void transfer(String accNum1, String accNum2, double value) {
    //ZLOSLIWY KOMENTARZ
  }

}
