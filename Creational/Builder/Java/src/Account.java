public class Account{
    private Long accountNumber;
    private String owner;
    private String branch;
    private Double balance;
    private Double credit;

    private Account(){ }
    public String toString() {
        return String.format("Account: %d\nOwner: %s\nBrach: %s\nBalance: %.2f\nCredit: %.2f",
                accountNumber, owner, branch, balance, credit);
    }
    public static class Builder{
        private Account account;

        public Builder(Long accountNumber) {
            account = new Account();
            account.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            account.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            account.branch = branch;
            return this;
        }

        public Builder openingBalance(Double balance) {
            account.balance = balance;
            return this;
        }

        public Builder availableCredit(Double credit) {
            account.credit = credit;
            return this;
        }

        public Account build(){
            if(account.branch != null && account.branch != null)
            return account;
            else return null;
        }
    }
}