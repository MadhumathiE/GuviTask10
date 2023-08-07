package GuviTask10;


public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0; // Default balance if not specified
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account(); // Using no-argument constructor
        System.out.println("Account 1 - Initial Balance: $" + account1.getBalance());
        account1.deposit(1000);
        account1.withdraw(500);
        System.out.println("Account 1 - Updated Balance: $" + account1.getBalance());

        Account account2 = new Account(2000); // Using two-argument constructor
        System.out.println("Account 2 - Initial Balance: $" + account2.getBalance());
        account2.deposit(500);
        account2.withdraw(3000);
        System.out.println("Account 2 - Updated Balance: $" + account2.getBalance());
    }
}