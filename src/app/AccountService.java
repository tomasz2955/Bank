package app;

public class AccountService {

    private AccountRepository repository;
    public AccountService(AccountRepository repository) {

        this.repository = repository;
    }

    public AccountService() {

    }

    public void deposit(String name, double value) {
        Account account = repository.queryAccount(name);
        account.deposit(value);
    }





  public void transfer(String accNum1, String accNum2, double value) {

  }

}
