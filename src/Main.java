import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Transfer Funds");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine(); 

                    System.out.print("Enter account holder name: ");
                    String owner = sc.nextLine();

                    System.out.print("Enter initial balance: ");
                    int accountBalance = sc.nextInt();

                    sc.nextLine();

                    System.out.print("1. Savings  2. Current — choose type: ");
                    int typeChoice = sc.nextInt();

                    Account newAcc;
                    if (typeChoice == 1) {
                        System.out.println("Enter interest rate:");
                        int interestRate = sc.nextInt();
                        
                        System.out.println("Enter Minimum Balance:");
                        int minimumBalance = sc.nextInt();
                        
                      newAcc = new SavingsAccount(owner, accountNumber, accountBalance, minimumBalance ,interestRate);
                    } else {
                        System.out.println("Enter over draft limit :");
                        int overdraftLimit = sc.nextInt();
                        
                        newAcc = new CurrentsAccount(owner, accountNumber, accountBalance, overdraftLimit);
                     }

                    if (bank.openAccount(newAcc)) {
                      System.out.println("Account opened successfully!");
                    } else {
                      System.out.println("Account number already exists.");
                    }
                    break;

                    /*System.out.print("Enter minimum balance: ");
                    int minimumBalance = sc.nextInt();

                    if (bank.openAccount(owner, accountNumber, accountBalance, minimumBalance)) {
                    System.out.println("Account opened successfully!");
                    } else {
                    System.out.println("Account number already exists.");
                    }*/
                    

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();

                try {
                    bank.deposit(accountNumber, depositAmount);
                    System.out.println("Deposit successful!");
                } catch (InvalidAccountException | InvalidAmountException e) {
                    System.out.println(e.getMessage());
                    }
                 break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();

                    try {
                        bank.withdraw(accountNumber, withdrawAmount); 
                        System.out.println("Withdrawal successful!");
              
                    } catch (InvalidAccountException | InvalidAmountException |InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    try {
                    int balance = bank.checkBalance(accountNumber);
                    System.out.println("Current balance: " + balance);
                    } catch (InvalidAccountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\n===== ALL ACCOUNTS =====");
                    bank.listAllAccounts();
                    break;

                case 6:
                    System.out.print("Enter source account number: ");
                    int fromAccount = sc.nextInt();

                    System.out.print("Enter destination account number: ");
                    int toAccount = sc.nextInt();

                    System.out.print("Enter amount to transfer: ");
                    int transferAmount = sc.nextInt();

                    try {
                    bank.transferFunds(fromAccount, toAccount, transferAmount);
                    System.out.println("Transfer successful!");
                    } catch (InvalidAccountException | InvalidAmountException | InsufficientFundsException e) {
                     System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Thank you for using the Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}