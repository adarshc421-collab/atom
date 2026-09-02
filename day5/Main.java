public class Main {

    public static void main(String[] args) {

        BankAccount bankA =
            new BankAccount(101, "SBI", 5000);

        BankAccount bankB =
            new BankAccount(102, "HDFC", 3000);

        PhonePeUser userA =
            new PhonePeUser(
                "User A",
                "9876543210",
                "usera@upi",
                0
            );

        PhonePeUser userB =
            new PhonePeUser(
                "User B",
                "9876543211",
                "userb@upi",
                0
            );

        userA.setBankAccount(bankA);
        userB.setBankAccount(bankB);

        userA.addMoneyToWallet(500);

        userA.sendMoney(userB, 200);

        userA.checkBalance();
        userB.checkBalance();
    }
}