package contract;

public class Contract {
    private Long accountNumber;
    private String owner;
    private String branch;
    private Double balance;
    private Double credit;

    protected Contract(){ }

    public String toString() {
        return String.format("Account: %d, Owner: %s, Brach: %s, Balance: %.2f, Credit: %.2f",
                accountNumber, owner, branch, balance, credit);
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
}