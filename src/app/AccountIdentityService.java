package app;

public class AccountIdentityService {

    AccountRepository accountRepository = new AccountRepository("123");

    public boolean updateAccount(Account oldName, Account newName) {
        int foundPosition = accountRepository.findAccount(oldName.getName());
        if(foundPosition<0) {
            System.out.println(oldName.getName() + " was not found");
            return false;
        }
        this.accountRepository.bankAccounts.set(foundPosition, newName);
        System.out.println(oldName.getName() + " was replaced with " + newName.getName());
        return true;
    }



}
