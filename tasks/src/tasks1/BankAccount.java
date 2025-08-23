package tasks1;

public class BankAccount {
    // Fields
    private String accountNumber;
    private double balance;  // private to protect it (encapsulation)

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to get current balance (read-only access)
    public double getBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 500.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(700.0);  // Should fail due to insufficient funds

        System.out.println("Final Balance: $" + account.getBalance());
    }
}

