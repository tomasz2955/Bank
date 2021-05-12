package app;

public class AccountStatisticsService {

    private AccountRepository repository;
    public AccountStatisticsService(AccountRepository repository) {this.repository = repository;}

    public void sumAccount() {
        double totalSum = 0;

        for (int i = 0; i < repository.bankAccounts.size(); i++) {
            double sum = repository.bankAccounts.get(i).getBalance();
            totalSum += sum;

        }
        System.out.println("Total sum = " + totalSum);

  //metoda dającą sumę kasy ze wszystkich kont

  //metoda dającą liczbę wszystkich kont w banku
}
