import java.util.ArrayList;

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account{Number='" + accountNumber + "', Balance=$" + balance + "}";
    }
}

// Customer Class
class Customer {
    private String name;
    private int customerId;
    private ArrayList<BankAccount> accounts;

    // Constructor
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    // Open a New Account
    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added for customer " + name);
    }

    // View All Balances
    public void viewBalance() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        }
    }
}

// Bank Class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add New Customer
    public void openAccount(Customer customer, BankAccount account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Customer " + customer + " added to bank " + name);
        }
        customer.addAccount(account);
    }

    // Display All Customers
    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

// Main Class
public class problem2_BankAndAccountHolders {
    public static void main(String[] args) {
        // Create Bank
        Bank bank = new Bank("Global Bank");

        // Create Customers
        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);

        // Create Accounts
        BankAccount account1 = new BankAccount("ACC1001", 500.0);
        BankAccount account2 = new BankAccount("ACC1002", 1500.0);
        BankAccount account3 = new BankAccount("ACC1003", 2000.0);

        // Associate Accounts with Customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Display Customers and Their Accounts
        bank.displayCustomers();
    }
}
