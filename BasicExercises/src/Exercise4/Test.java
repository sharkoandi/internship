package Exercise4;

public class Test {

    public static void main(String[] args) {

        LoanAccount loanAccount=new LoanAccount(1_000_000,
                0.5,5,1_000);

        System.out.println(loanAccount.calculateInterest());

        loanAccount.withdraw(100);
        System.out.println(loanAccount.getMoneyInAccount());

        loanAccount.deposit(100);
        System.out.println(loanAccount.getMoneyInAccount());
    }
}
