public class CurrentsAccount extends Account  {
     
    int overdraftLimit;

     CurrentsAccount(String owner, int accountNumber, int accountBalance,int minimumBalance,int overdraftLimit) {
        super(owner,accountNumber,accountBalance,minimumBalance);
        this.overdraftLimit = overdraftLimit;

     }
}
