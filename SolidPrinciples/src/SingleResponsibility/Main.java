package SingleResponsibility;

public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setBalance(1000000);
        account.setUserName("Harsh");

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account.getUserName(), account.getBalance(), account.getAccountNumber());

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.depositAmount(10000, account.getAccountNumber());
        
    }
}
