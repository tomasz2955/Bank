public class Bank {

    int Saldo = 3424432;

    public void Deposit(int DepositValue) {
        if(DepositValue > 0) {
            Saldo = Saldo + DepositValue;
        } else {
            System.out.println("wartość powinna być większa od zera");
        }
    }

    public void Withdraw(int WithdrawValue) {
        if(WithdrawValue > 0) {
            Saldo = Saldo - WithdrawValue;
        } else {
            System.out.println("wartość powinna być większa od zera");
        }
    }
    public void getBalance() {
        System.out.println(Saldo);
    }

}
