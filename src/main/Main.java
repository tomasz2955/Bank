package main;

import app.AccountRepository;
import app.BankService;

public class Main {
    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        //konto 1
        //konto 2

        // dodaj account 1
        // dodaj account 2

        BankService bank = new BankService(repository);
        bank.deposit(20);
        bank.deposit(55);
        bank.withdraw(70);
        bank.getBalance();
    }
}
