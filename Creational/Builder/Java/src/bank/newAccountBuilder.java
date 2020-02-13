package bank;

public interface newAccountBuilder {
    public newAccountBuilder withAccountNumber(Long accountNumber);
    public newAccountBuilder withOwner(String owner);
    public newAccountBuilder atBranch(String branch);
    public newAccountBuilder openingBalance(Double balance);
    public newAccountBuilder availableCredit(Double credit);
}
