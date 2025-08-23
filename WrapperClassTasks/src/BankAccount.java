public class BankAccount {
    private String accountNumber;
    private Double balance;

    // Constructor
    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        // Handle null balance by assigning 0.0
        this.balance = (balance != null) ? balance : 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // autoboxing happens automatically
            System.out.println("Deposited: " + amount);
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
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + String.format("%.2f", balance));
    }

    // Main method for demo
    public static void main(String[] args) {
        // Create account with null balance
        BankAccount acc = new BankAccount("ACC123", null);
        acc.showBalance(); // Should show 0.0

        // Deposit and withdraw
        acc.deposit(1500.0);
        acc.withdraw(500.0);
        acc.showBalance();

        // Attempt to withdraw too much
        acc.withdraw(2000.0);
        acc.showBalance();
    }
}
