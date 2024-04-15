package Exercise4.E1;

import java.util.List;

public class Bank {
    private List<BankAccount> accountList;
    private List<BankAccount> loansAccounts;
    private double totalMoney;
    public Bank(List<BankAccount> accountList,List<BankAccount> loansAccounts,double totalMoney) {
        this.accountList = accountList;
        this.totalMoney = totalMoney;
        this.loansAccounts = loansAccounts;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<BankAccount> accountList) {
        this.accountList = accountList;
    }
}
