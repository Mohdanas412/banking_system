public class Account {
    protected String owner;
    protected int accountNumber;
    protected int accountBalance;
   // private int minimumBalance;

    Account(String owner, int accountNumber, int accountBalance/*int minimumBalance*/) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        //this.minimumBalance = minimumBalance;
    }

    
    public void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive!");
        }
        accountBalance += amount;
    }

    
    public void withdraw(int amount) throws InvalidAmountException,InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive!");
        }
        if(amount > accountBalance) {
            throw new InsufficientFundsException("Withdrawal exceeds available balance!");
        }
        /*if (accountBalance - amount < minimumBalance) {
            throw new InsufficientFundsException("Withdrawal would breach minimum balance requirement!");
        }*/
        accountBalance -= amount; 
        

    }
    

    public int getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " | Owner: " + owner + " | Balance: " + accountBalance;
    }
}