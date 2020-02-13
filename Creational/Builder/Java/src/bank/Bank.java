package bank;

import account.Account;
import contract.Contract;

class Bank{

    public static void main(String[] args){
        account.Builder accountBuilder = new account.Builder()
                .withAccountNumber(12L)
                .withOwner("Jana")
                .openingBalance(100.0)
                .availableCredit(.50)
                .atBranch("Serra");
        Account a = accountBuilder.build();
        System.out.println(a);
        contract.Builder contractBuilder = new contract.Builder()
                .withAccountNumber(12L)
                .withOwner("Jana")
                .openingBalance(100.0)
                .availableCredit(.50)
                .atBranch("Serra");
        Contract c = contractBuilder.build();
        System.out.println(c);


    }
}