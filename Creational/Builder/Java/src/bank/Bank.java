package bank;

import account.Account;
import account.Builder;
class Bank{

    public static void main(String[] args){
        Builder b = new Builder()
                .withAccountNumber(12L)
                .withOwner("Jana")
                .openingBalance(100.0)
                .availableCredit(.50)
                .atBranch("Serra");
        Account a = b.build();
        System.out.println(a);
    }
}