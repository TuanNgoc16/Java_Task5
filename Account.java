public class Account {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID= 100;
        holderName = "JohnAnderson";
        accountType = "savings";
    }
    public void displayAccoountDetails (){
        System.out.println("Account Details ");
        System.out.println("============");
        System.out.println("AccountId " +accountID + "\nAccountType" + accountType);
    }
}
