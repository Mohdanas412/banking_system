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
        return false;   // what should happen here — allow or reject?
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
    public boolean deposit(int accountNumber,int amount) {
        Account account = findAccountByNumber(accountNumber);
        if (account == null){
            return false;
        }
        return account.deposit(amount);
    }
    public boolean withdraw(int accountNumber , int amount) {
        Account account = findAccountByNumber(accountNumber);
        if (account == null) {
            return false;
        }
        return account.withdraw(amount);
    }
    public int checkBalance(int acccountNumber){
        Account account = findAccountByNumber(acccountNumber);
        if(account == null) {
            return -1;
        }
        return account.getAccountBalance();
    }
    public void listAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

}