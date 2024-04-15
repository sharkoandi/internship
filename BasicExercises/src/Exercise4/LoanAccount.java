package Exercise4;

public class LoanAccount extends BankAccount {


    double interestRate;
    double loanTime;
    double loanAmount;

    public LoanAccount(double moneyInAccount, double interestRate, double loanTime, double loanAmount) {
        super(moneyInAccount);
        this.interestRate = interestRate;
        this.loanTime = loanTime;
        this.loanAmount = loanAmount;
    }

    public double calculateInterest(){

        return (interestRate*loanAmount*loanTime)/100;
    }

    //mqs po terheqim nga nje loan account a do sihte nevoja te benim calculate
    // edhe njeher interesin? mqs u rrit vlera e marre borxh

    //withdraw/deposit per llogarine bankare apo per te marre/shlyer loan e marre?
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public double getMoneyInAccount() {
        return super.getMoneyInAccount();
    }
}
