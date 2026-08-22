public class SavingsAccount extends Account  {
     
    int interestRate;

     SavingsAccount(String owner, int accountNumber, int accountBalance,int minimumBalance,int interestRate) {
        super(owner,accountNumber,accountBalance,minimumBalance);
        this.interestRate = interestRate;

     }
}
