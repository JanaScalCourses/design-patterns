package bank;

public interface NewAccountBuilder {
    NewAccountBuilder withAccountNumber(Long accountNumber);
    NewAccountBuilder withOwner(String owner);
    NewAccountBuilder atBranch(String branch);
    NewAccountBuilder openingBalance(Double balance);
    NewAccountBuilder availableCredit(Double credit);
    NewAccountBuilder reset();
}
