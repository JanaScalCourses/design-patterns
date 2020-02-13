package bank;

public interface NewAccountBuilder {
    public NewAccountBuilder withAccountNumber(Long accountNumber);
    public NewAccountBuilder withOwner(String owner);
    public NewAccountBuilder atBranch(String branch);
    public NewAccountBuilder openingBalance(Double balance);
    public NewAccountBuilder availableCredit(Double credit);
}
