package bank;

import account.Account;
import contract.Contract;

class Bank{

    public static void main(String[] args){
        NewAccountDirector director = new NewAccountDirector("Serra");
        contract.Builder contractBuilder = new contract.Builder();
        account.Builder accountBuilder = new account.Builder();

        director.createNewAccount("Janaina", accountBuilder, contractBuilder);
        Account a = accountBuilder.build();
        Contract c = contractBuilder.build();
        System.out.println(a);
        System.out.println(c);

        director.createNewPremiumAccount("Isaac", accountBuilder, contractBuilder);
        a = accountBuilder.build();
        c = contractBuilder.build();
        System.out.println(a);
        System.out.println(c);
    }
}