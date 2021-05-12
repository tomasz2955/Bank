package main;

import app.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AccountRepository accountRepository = new AccountRepository("123");
    private static AccountRepository accountRepository1 = new AccountRepository("123");
    private static AccountIdentityService accountIdentityService = new AccountIdentityService();
    private static AccountStatisticsService accountStatisticsService = new AccountStatisticsService(accountRepository);
    private static AccountService accountService = new AccountService(accountRepository);


    public static void main(String[] args) {

        boolean quit = false;
        startBank();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("\nYou have been logged out");
                    quit = true;
                    break;
                case 1:
                    addNewAccount();
                    break;
                case 2:
                    updateAccount();
                    break;
                case 3:
                    removeAccount();
                    break;
                case 4:
                    accountRepository.printContacts();
                    break;

                case 5:
                    queryAccount();
                    break;
                case 6:
                    deposit();
                    break;
                case 9:
                    accountStatisticsService.sumAccount();
                    break;
                case 10:
                    printActions();
                    break;
            }
        }

    }
    private static void startBank() {
        System.out.println("You logged into the bank");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to exit");
        System.out.println("1 - to add new account");
        System.out.println("2 - to update an existing account");
        System.out.println("3 - to remove an existing account");
        System.out.println("4 - to display the account list");
        System.out.println("5 - query if an existing account exists");
        System.out.println("6 - to deposit new funds");
        System.out.println("7 - to withdraw funds");
        System.out.println("8 - to transfer funds");
        System.out.println("9 - to see the sum of funds in all accounts");
        System.out.println("10 - to print list of action");
        System.out.println("Choose your action: ");
    }

    private static void addNewAccount() {
        System.out.println("Enter new account name");
        String name = scanner.nextLine();
        System.out.println("Enter new bank account number");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter the opening balance");
        Double balance = scanner.nextDouble();
        Account newAccount = Account.createAccount(name,accountNumber, balance);
        if(accountRepository.addNewAccount(newAccount)) {
            System.out.println("New account added: name = " + name + "; account number = " + accountNumber + "; balance = " + balance + ";");
        } else {
            System.out.println("Cannot add " + name + " already in file");
        }
    }

    private static void deposit() {
        System.out.println("Enter account name");
        String name = scanner.nextLine();
        System.out.println("Enter value");
        double value = scanner.nextDouble();
        accountService.deposit(name, value);

    }

    private static void queryAccount() {
        System.out.println("Enter the name of an existing account");
        String name = scanner.nextLine();
        Account existingAccountRecord = accountRepository.queryAccount(name);
        if (existingAccountRecord == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.println("Name: " + existingAccountRecord.getName() + ", Account number: " + existingAccountRecord.getAccountNumber() + ", Balance: " + existingAccountRecord.getBalance());

    }

    private static void removeAccount() {
        System.out.println("Enter the name of an existing account");
        String name = scanner.nextLine();
        Account existingAccountRecord = accountRepository.queryAccount(name);
        if (existingAccountRecord == null) {
            System.out.println("Account not found");
            return;
        }
        if (accountRepository.removeAccount(existingAccountRecord)) {
            System.out.println("The account has been deleted");
        } else {
            System.out.println("Error deleted");
        }
    }

    private static void updateAccount() {
        System.out.println("Enter the name of an existing account");
        String name = scanner.nextLine();
        Account existingAccountRecord = accountRepository.queryAccount(name);
        if (existingAccountRecord == null) {
            System.out.println("Account not found");
        } else {
            System.out.println("Enter new account name ");
            String newName = scanner.nextLine();
            System.out.println("Enter new account number");
            String newAccountNumber = scanner.nextLine();
            System.out.println("Enter new account balance");
            Double newBalance = scanner.nextDouble();
            Account newAccount = Account.createAccount(newName, newAccountNumber, newBalance);
            if (accountIdentityService.updateAccount(existingAccountRecord, newAccount)) {
                System.out.println("Account succesfully updated");
            } else {
                System.out.println("Error updating");
            }
        }
    }
}
