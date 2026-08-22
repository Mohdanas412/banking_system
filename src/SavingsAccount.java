public class SavingsAccount extends Account  {
     
    int interestRate;
    int minimumBalance;

     SavingsAccount(String owner, int accountNumber, int accountBalance,int minimumBalance,int interestRate) {
        super(owner,accountNumber,accountBalance/*minimumBalance*/);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;

     }
     @Override
     public void withdraw(int amount) throws InvalidAmountException, InsufficientFundsException {
      if (accountBalance - amount < minimumBalance) {
            throw new InsufficientFundsException("Withdrawal would breach minimum balance requirement!");
      }
      super.withdraw(amount);
   }
} 
