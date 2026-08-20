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
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine(); // consume leftover newline

                    System.out.print("Enter account holder name: ");
                    String owner = sc.nextLine();

                    System.out.print("Enter initial balance: ");
                    int accountBalance = sc.nextInt();

                    System.out.print("Enter minimum balance: ");
                    int minimumBalance = sc.nextInt();

                    if (bank.openAccount(owner, accountNumber, accountBalance, minimumBalance)) {
                    System.out.println("Account opened successfully!");
                    } else {
                    System.out.println("Account number already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();

                    if (bank.deposit(accountNumber, depositAmount)) {
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Deposit failed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();

                    if (bank.withdraw(accountNumber, withdrawAmount)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextInt();

                    int balance = bank.checkBalance(accountNumber);

                    if (balance == -1) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.println("Current balance: " + balance);
                    }
                    break;

                case 5:
                    System.out.println("\n===== ALL ACCOUNTS =====");
                    bank.listAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}