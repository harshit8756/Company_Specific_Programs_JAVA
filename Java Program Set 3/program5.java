class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Please enter the amount which is lesser than or equal to your balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }
}
public class program5 {
    public static void main(String[] args) {
        double initialBalance = 1000.0;
        BankAccount account = new BankAccount(initialBalance);

        double withdrawalAmount = 1200.0; // Change this value as needed
        account.withdraw(withdrawalAmount);
    }
}
