class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is trying to withdraw $" + amount);
            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(user + " attempted to withdraw $" + amount + " but insufficient funds. Balance: $" + balance);
        }
    }
}

class WithdrawalThread extends Thread {
    private BankAccount account;
    private String user;

    public WithdrawalThread(BankAccount account, String user) {
        this.account = account;
        this.user = user;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(50, user);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(200);
        WithdrawalThread user1 = new WithdrawalThread(account, "User1");
        WithdrawalThread user2 = new WithdrawalThread(account, "User2");
        user1.start();
        user2.start();
    }
}

