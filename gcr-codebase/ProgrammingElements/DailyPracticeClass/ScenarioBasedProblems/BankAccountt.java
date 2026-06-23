package ProgrammingElements.DailyPracticeClass.ScenarioBasedProblems;

class BankAccount {

    // Instance variables
    private String accountNumber;
    private String holder;
    private double balance;

    // Static variable to count total accounts
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Display account details
    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankAccountt {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("1001", "Vinit", 10000);
        BankAccount acc2 = new BankAccount("1002", "Rahul", 5000);
        BankAccount acc3 = new BankAccount("1003", "Aman", 8000);

        // Perform 5 transactions
        acc1.deposit(2000);      // Transaction 1
        acc2.withdraw(1000);     // Transaction 2
        acc3.deposit(1500);      // Transaction 3
        acc1.withdraw(5000);     // Transaction 4
        acc2.withdraw(10000);    // Transaction 5 (fails)

        // Display statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Display total accounts created
        System.out.println("\nTotal Accounts Created: " +
                BankAccount.getTotalAccounts());
    }
}