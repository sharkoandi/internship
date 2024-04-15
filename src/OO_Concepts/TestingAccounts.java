package OO_Concepts;

public class TestingAccounts {

    public static void main(String[] args) {
        Account savingsAccount = new Account("ACC00000", 1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.displayBalance();

        LoanAccount loanAccount = new LoanAccount("ACC11111", 5000, 0.05);
        loanAccount.deposit(1000);
        loanAccount.withdraw(200);
        loanAccount.displayBalance();

        double interest = loanAccount.calculateInterest();
        System.out.println("Interest: " + interest);
    }
}
