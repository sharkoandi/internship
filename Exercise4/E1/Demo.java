package Exercise4.E1;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LoanBankAccount loanBankAccount = new LoanBankAccount("AADSDA",2000,new Bank(new LinkedList<>(),new LinkedList<>(),100000),0.015f);
        System.out.println(loanBankAccount.calculateInterest(365,200));
    }
}
