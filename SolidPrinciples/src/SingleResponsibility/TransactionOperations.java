package SingleResponsibility;

public class TransactionOperations {

    public void depositAmount(Integer depositValue, Integer accountNumber) {
        AccountOperations accountOperations = new AccountOperations();

        Account account = accountOperations.getAccount(accountNumber);
        account.setBalance(account.getBalance() + depositValue);
    }

    public void withdrawAmount(Integer withdrawValue, Integer accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        
        Account account = accountOperations.getAccount(accountNumber);
        account.setBalance(account.getBalance() - withdrawValue);
    }
}
