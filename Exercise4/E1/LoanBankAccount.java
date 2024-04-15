package Exercise4.E1;

import java.util.List;

public class LoanBankAccount extends BankAccount {
    private float interestRate;
    private double loanedMoney;

    public LoanBankAccount(String accountNumber, double balance, Bank bank , float interestRate) {
        super(accountNumber, balance,bank);
        this.interestRate = interestRate;
        this.loanedMoney = 0;
    }

    public int getLoan(int amount){
        List<BankAccount> list = getBank().getAccountList();
        list.add(this);
        getBank().setAccountList(list);

        getBank().setTotalMoney(getBank().getTotalMoney()-amount);
        return amount;
    }

    public double calculateInterest(int requiredTimeInDays,int amount){
        return amount * requiredTimeInDays * interestRate;
    }

    public double getLoanedMoney() {
        return loanedMoney;
    }

    public void setLoanedMoney(double loanedMoney) {
        this.loanedMoney = loanedMoney;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
