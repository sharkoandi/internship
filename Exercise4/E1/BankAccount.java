package Exercise4.E1;

import java.util.List;
import java.util.Objects;

public class BankAccount {
    private Bank bank;
    private String accountNumber;
    private double balance;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        List<BankAccount> list = this.bank.getAccountList();
        this.bank.setAccountList(list);
    }

    public void depositMoney(double toDeposit){
        if (toDeposit < 0){
            return;
        }
        balance = balance + toDeposit;
        System.out.println("Gjendja aktuale: " + checkBalance());
    }

    public double withdawMoney(double toWithdraw)throws WithdrawException {
        if (toWithdraw > balance || toWithdraw < 0){
            throw new WithdrawException("Nuk mund te terheqesh kete shume!");
        }
        balance = balance - toWithdraw;
        System.out.println("Gjendja aktuale: " + checkBalance());
        return toWithdraw;
    }

    public double checkBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }
}

