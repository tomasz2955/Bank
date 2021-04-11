package app;

public class BankService {

    private int balance = 0;
    private final AccountRepository repository;

    public BankService(AccountRepository repository) {
        this.repository = repository;
    }

    // TODO dla kogo ten deposit
    public void deposit(int depositValue) {
//        repository.findByAccountNumber
//        account.deposit()

        if(depositValue > 0) {
            balance += depositValue;
        } else {
            System.out.println("wartość powinna być większa od zera");
        }
    }

    public void withdraw(int withdrawValue) {
        if(withdrawValue > 0) {
            balance -= withdrawValue;
        } else {
            System.out.println("wartość powinna być większa od zera");
        }
    }
    public void getBalance() {
        System.out.println(balance);
    }

}
