package account;

public class Builder implements bank.newAccountBuilder {
    private Account account;

    public Builder()  {
        account = new Account();;
    }

    @Override
    public Builder withAccountNumber(Long accountNumber) {
        account.setAccountNumber(accountNumber);
        return this;
    }

    public Builder withOwner(String owner) {
        account.setOwner(owner);
        return this;
    }

    public Builder atBranch(String branch) {
        account.setBranch(branch);
        return this;
    }

    public Builder openingBalance(Double balance) {
        account.setBalance(balance);
        return this;
    }

    public Builder availableCredit(Double credit) {
        account.setCredit(credit);
        return this;
    }

    public Account build(){
        if(account.getBranch() != null && !account.getBranch().isEmpty())
            return account;
        else return null;
    }
}
