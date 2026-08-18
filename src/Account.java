public class Account {
    String owner;
    int accountNumber;
    private int accountBalance;

    Account(String owner, int accountNumber, int accountBalance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // Deposit Money
    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        accountBalance += amount;
        return true;
    }

    // Withdraw money.
    public boolean withdraw(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > accountBalance) {
            return false;
        }
        accountBalance -= amount; {
            return true;
        }

    }
    //Getter method : Read only window into accountBalance.

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Owner: " + owner + " | Balance: " + accountBalance;
    }
}