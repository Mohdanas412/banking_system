public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Rahul", 1001, 5000,5000);
        //acc1.accountBalance = 99999;
        System.out.println("Start : " + acc1);

        // Testing Deposit Method

        System.out.println("Deposit 500 -> Success?" + acc1.deposit(500));
        System.out.println("After :" + acc1);

        System.out.println("Deposit -500 -> Success?" + acc1.deposit(-500));
        System.out.println("After :" + acc1);

        //Testing Withdraw Method

        System.out.println("Withdraw 500 -> success? " + acc1.withdraw(500));
        System.out.println("After: " + acc1);

        System.out.println("Withdraw 1500 -> success? " + acc1.withdraw(1500));
        System.out.println("After: " + acc1);

        // Testing Getter Method
        System.out.println("Balance via getter: " + acc1.getAccountBalance());
    }
}