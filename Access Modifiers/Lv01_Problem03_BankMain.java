class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account - Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }
}

class Lv01_Problem03_BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "Alice", 1000.00);
        account.displayAccountDetails();

        SavingsAccount savings = new SavingsAccount(67890, "Bob", 2000.00, 2.5);
        savings.displaySavingsDetails();
    }
}
