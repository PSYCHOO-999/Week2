public class Level2_Problem2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", 500.0);
        
        account.deposit(200.0);
        account.withdraw(100.0);
        account.displayBalance();
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}