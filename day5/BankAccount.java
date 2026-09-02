class BankAccount {

    // Private variables
    private int accountNumber;
    private String bankName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String bankName, double balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        System.out.println("Insufficient bank balance!");
        return false;
    }
}