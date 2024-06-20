package SingleResponsibility;

import java.util.HashMap;

public class AccountOperations {
    private static HashMap<Integer, Account> accountMap = new HashMap<>();

    public Account getAccount(Integer accountNumber) {
        return accountMap.get(accountNumber);
    }

    public void addAccount(String userName, Integer balance, Integer accountNumber) {
        Account newAccount = new Account();
        newAccount.setAccountNumber(accountNumber);
        newAccount.setBalance(balance);
        newAccount.setUserName(userName);

        accountMap.put(accountNumber, newAccount);
    }

    // We should define the withdraw and deposit methods here, as this class
    // handles account's operation, not the transaction operations
    // Thus, to follow 'S' of SOLID Principle, we have created a new class
    // and defined withdraw and deposit methods there
}
