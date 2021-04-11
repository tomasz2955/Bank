public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.Deposit(20);
        bank.Deposit(55);
        bank.getBalance();
        bank.Withdraw(70);
        bank.getBalance();
    }
}
