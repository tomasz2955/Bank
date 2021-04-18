package main;

import app.Account;

import app.AccountRepository;
import app.AccountService;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();

        repository.addAccount(new Account("Tomasz", "Bator", "1234", 0));
        repository.addAccount(new Account("Tomasz", "Kowalski", "1934", 100));

        AccountService service = new AccountService(repository);

//        Account account = bankAccounts.stream()
//            .filter(bankAccount -> bankAccount.getAccountNumber().equals("1234"))
//            .findFirst()
//            .get();
//
//        for(Account acc: bankAccounts) {
//            if(acc.getAccountNumber().equals("1234")) {
//                System.out.println();
//            }
//        }



//        Account account1 = new Account("Tomasz", "Bator", "1234", 100);
//        Account account2 = new Account("Tomasz", "Bator", "1239", 0);
//        account1.deposit(459);
//        account1.withdraw(128);
//        account1.transfer(account2, 500);








    }
}
