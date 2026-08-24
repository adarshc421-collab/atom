class Banking {

    // Variables
    String name;
    double balance;

    // Constructor
    Banking(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Main method
    public static void main(String[] args) {

        Banking b = new Banking("Adarsh", 5000);

        System.out.println("Name: " + b.name);
        System.out.println("Initial Balance: " + b.balance);

        b.deposit(2000);
        b.withdraw(1000);
        b.withdraw(10000);
    }
}