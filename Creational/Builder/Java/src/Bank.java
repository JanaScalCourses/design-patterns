class Bank{

    public static void main(String[] args){
        Account.Builder b = new Account.Builder(12L)
                .withOwner("Jana")
                .openingBalance(100.0)
                .availableCredit(.50);
        Account a = b.build();
        System.out.println(a);
    }
}