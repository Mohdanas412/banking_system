public class Account {
    String owner;
    int accountNumber;
    private int accountBalance;

    Account(String owner, int accountNumber, int accountBalance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Owner: " + owner + " | Balance: " + accountBalance;
    }
}