package SingleResponsibility;

public class Account {
    private String userName;
    private Integer balance;
    private Integer accountNumber;

    // Getter
    public String getUserName() {
        return userName;
    }
    public Integer getBalance() {
        return balance;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }

    // Setter
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
