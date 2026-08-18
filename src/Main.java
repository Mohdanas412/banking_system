public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Rahul", 1001, 5000);
        //acc1.accountBalance = 99999;
        System.out.println("Start : " + acc1);

        // Testing Deposit Method

        System.out.println("Deposit 500 -> Success?" + acc1.deposit(500));
        System.out.println("After :" + acc1);

        System.out.println("Deposit -500 -> Success?" + acc1.deposit(-500));
        System.out.println("After :" + acc1);

        //Testing Withdraw Method

        System.out.println("Withdraw 2000 -> success? " + acc1.withdraw(2000));
        System.out.println("After: " + acc1);

        System.out.println("Withdraw 999999 -> success? " + acc1.withdraw(999999));
        System.out.println("After: " + acc1);

        // Testing Getter Method
        System.out.println("Balance via getter: " + acc1.getAccountBalance());
    }
}