public class CurrentsAccount extends Account  {
     
    int overdraftLimit;

     CurrentsAccount(String owner, int accountNumber, int accountBalance,/*int minimumBalance,*/int overdraftLimit) {
        super(owner,accountNumber,accountBalance/*minimumBalance*/);
        this.overdraftLimit = overdraftLimit;

     }
     @Override
     public void withdraw(int amount) throws InvalidAmountException,InsufficientFundsException{
      if(amount <= 0){
         throw new InvalidAmountException("Amount Must be Positive!");
      }
      if (amount > accountBalance + overdraftLimit) {
         throw new InsufficientFundsException("Exceeds Over Draft Limit!");
      }
      accountBalance -= amount;
     }
}
