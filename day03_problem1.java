public class day03_problem1{
    static class BankAccount {
        private static String bankName = "Global Bank";
        private static int totalAccounts = 0;
        private final int accountNumber; 
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountHolderName, int accountNumber, double balance) {
            this.accountHolderName = accountHolderName; 
            this.accountNumber = accountNumber;       
            this.balance = balance;
            totalAccounts++;
        }

        // Static method to get total accounts
        public static int getTotalAccounts() {
            return totalAccounts;
        }

        // Method to display account details
        public void displayAccountDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: $" + balance);
            } else {
                System.out.println("Invalid account object.");
            }
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ankit", 1001, 234567);

        System.out.println("\n--- Account Details ---");
        account.displayAccountDetails();

        BankAccount account1 = new BankAccount("Abc", 1002, 2345678) ;
        System.out.println("\n--- Account Details ---");
        account1.displayAccountDetails();

        System.out.println("Total no. of Account created : "+BankAccount.getTotalAccounts());
    }

}