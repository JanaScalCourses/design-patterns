package bank;

public class NewAccountDirector {
    private static Long nextAccountNumber = 0L;
    private String branch;
    private Double defaultCredit = 0.;
    private Double premiumCredit = 1000.;

    public NewAccountDirector(String branch) {
        this.branch = branch;
    }
    public void createNewAccount(String owner, NewAccountBuilder... builders){
        nextAccountNumber++;
        for (NewAccountBuilder builder: builders) {
            createNewAccount(builder, owner);
        }
    }
    public void createNewPremiumAccount(String owner, NewAccountBuilder... builders){
        nextAccountNumber++;
        for (NewAccountBuilder builder: builders) {
            createNewPremiumAccount(builder, owner);
        }
    }

    public void createNewAccount(NewAccountBuilder builder, String owner){
        builder.withAccountNumber(nextAccountNumber)
        .atBranch(branch)
        .withOwner(owner)
        .availableCredit(defaultCredit)
        .openingBalance(0.);
    }
    public void createNewPremiumAccount(NewAccountBuilder builder, String owner){
        builder.withAccountNumber(nextAccountNumber)
                .atBranch(branch)
                .withOwner(owner)
                .availableCredit(premiumCredit)
                .openingBalance(0.);
    }
}
