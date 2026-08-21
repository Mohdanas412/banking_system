public class Account {
    String owner;
    int accountNumber;
    private int accountBalance;
    private int minimumBalance;

    Account(String owner, int accountNumber, int accountBalance,int minimumBalance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
    }

    
    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        accountBalance += amount;
        return true;
    }

    
    public boolean withdraw(int amount) {
        if (amount <= 0) {
            return false;
        }
        if(amount > accountBalance) {
            return false;
        }
        if (accountBalance - amount < minimumBalance) {
            return false;
        }
        accountBalance -= amount; 
            return true;
        

    }
    

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Owner: " + owner + " | Balance: " + accountBalance;
    }
}