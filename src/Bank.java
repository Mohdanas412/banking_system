import java.util.ArrayList;
//import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    public boolean openAccount(String owner,int accountNumber,int accountBalance,int minimumBalance){
        Account existing = findAccountByNumber(accountNumber);
    if (existing != null) {
        return false; 
    }
        Account account = new Account(owner, accountNumber, accountBalance, minimumBalance); 
        accounts.add(account);
        return true;
    }
    public Account findAccountByNumber(int accountNumber) {
        for(Account account : accounts) {
            if (account.accountNumber == accountNumber){
            return account;
            }
        }
        return null;
    }
    public void deposit(int accountNumber,int amount) throws InvalidAccountException,InvalidAmountException {
        Account account = findAccountByNumber(accountNumber);
        if (account == null){
            throw new InvalidAccountException("Account doesnt Exists!");
        }
        account.deposit(amount);
    }
    public void withdraw(int accountNumber , int amount) throws InvalidAccountException,InvalidAmountException,InsufficientFundsException {
        Account account = findAccountByNumber(accountNumber);
        if (account == null) {
            throw new InvalidAccountException("Account doesn't Exists");
        }
        account.withdraw(amount);
    }
    public int checkBalance(int acccountNumber) throws InvalidAccountException{
        Account account = findAccountByNumber(acccountNumber);
        if(account == null) {
            throw new InvalidAccountException("Account doesn't Exists");
        }
        return account.getAccountBalance();
    }
    public void listAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    public void transferFunds(int fromAccountNumber, int toAccountNumber, int amount) throws InvalidAccountException,InsufficientFundsException,InvalidAmountException {
    if (fromAccountNumber == toAccountNumber) {
        throw new InvalidAccountException("Same Account ! Funds can't be trasnfer.");
    }

    Account fromAccount = findAccountByNumber(fromAccountNumber);
    Account toAccount = findAccountByNumber(toAccountNumber);

    if (fromAccount == null || toAccount == null) {
        throw new InvalidAccountException("Account doesn't Exists");
    }
    fromAccount.withdraw(amount);
    toAccount.deposit(amount);
}

}