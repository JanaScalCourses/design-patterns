package contract;

import bank.NewAccountBuilder;

public class Builder implements NewAccountBuilder {
    private Contract contract;

    public Builder()  {
        contract = new Contract();;
    }

    @Override
    public Builder withAccountNumber(Long accountNumber) {
        contract.setAccountNumber(accountNumber);
        return this;
    }

    public Builder withOwner(String owner) {
        contract.setOwner(owner);
        return this;
    }

    public Builder atBranch(String branch) {
        contract.setBranch(branch);
        return this;
    }

    public Builder openingBalance(Double balance) {
        contract.setBalance(balance);
        return this;
    }

    public Builder availableCredit(Double credit) {
        contract.setCredit(credit);
        return this;
    }

    public Contract build(){
        if(contract.getBranch() != null && !contract.getBranch().isEmpty())
            return contract;
        else return null;
    }
}
