package main;

import app.Account;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> bankAccounts = new ArrayList<>();

        Account account1 = new Account("Tomasz", "Bator", "1234", 100);
        Account account2 = new Account("Tomasz", "Bator", "1239", 0);
        account1.Deposit(459);
        account1.Withdraw(128);
        account1.Transfer(account2, 500);



        bankAccounts.add(new Account("Tomasz", "Bator", "1234", 0));
        bankAccounts.add(new Account("Tomasz", "Kowalski", "1934", 100));

        bankAccounts.add(account1);







    }
}
