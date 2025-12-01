package Question17;

import java.util.HashMap;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}


class BankAccount {
    private String accountHolder;
    private double balance;
    public static int totalAccounts;

    BankAccount(String accountHolder, int balance) throws InvalidAmountException {
        if (balance <= 0) {
            throw new InvalidAmountException("Initial balance cannot be negative!");
        }
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive!");
        } else {
            this.balance += amount;
        }
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public void displayAccount() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount acc1 = new BankAccount("Lalit Kumar", 5000);
            BankAccount acc2 = new BankAccount("Ravi Sharma", 10000);

            acc1.deposit(2000);
            acc1.withdraw(1000);
            acc1.displayAccount();

            acc1.showTotalAccounts();
            acc2.withdraw(12000); // will cause exception
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
