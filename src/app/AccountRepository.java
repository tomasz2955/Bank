package app;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

  private String myNumber;
  List<Account> bankAccounts;

  public AccountRepository(String myNumber) {
    this.myNumber = myNumber;
    this.bankAccounts = new ArrayList<>();

  }

  public boolean addNewAccount(Account account) {
    if (findAccount(account.getName()) >= 0) {
      System.out.println("Account is already exists");
      return false;
    } else {
      bankAccounts.add(account);
      return true;
    }
  }



  public int findAccount(String accountName) {
    for (int i = 0; i < this.bankAccounts.size(); i++) {
      Account account = this.bankAccounts.get(i);
      if (account.getName().equals(accountName)) {
        return i;
      }
    }
    return -1;

  }
  public Account queryAccount(String name) {
    int position = findAccount(name);
    if(position >=0) {
//      Account account1 = bankAccounts.stream()
//              .filter(account -> account.getName().equals(name))
//              .findFirst()
//              .orElseThrow(()-> new RuntimeException("Account not found"));
//      for(Account acc:bankAccounts) {
//        if(acc.getName().equals(name)){
//          return acc;
//        }
//      }
//      throw new RuntimeException("Account not found");

      return this.bankAccounts.get(position);
    }
    return null;
  }




  public boolean removeAccount(Account account) {
    int foundPosition = findAccount(account.getName());
    if(foundPosition < 0) {
      System.out.println(account.getName() + " was not found");
      return false;
    } else {
      this.bankAccounts.remove(foundPosition);
      System.out.println(account.getName() + " was deleted");
      return true;

    }
  }
  public void printContacts() {
    System.out.println("Account list");
    for(int i=0; i<this.bankAccounts.size(); i++) {
      System.out.println((i+1) + "." +
              this.bankAccounts.get(i).getName() + " >>> " +
              this.bankAccounts.get(i).getAccountNumber() + " >>> " + this.bankAccounts.get(i).getBalance());
    }
  }

}
