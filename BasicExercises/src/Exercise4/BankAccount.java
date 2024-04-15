package Exercise4;

public class BankAccount {

    double moneyInAccount;

    public BankAccount(double moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    public void withdraw(double amount){
        this.moneyInAccount=this.moneyInAccount-amount;
    }

    public void deposit(double amount){
        this.moneyInAccount=this.moneyInAccount+amount;
    }

    public double getMoneyInAccount() {
        return moneyInAccount;
    }
}
