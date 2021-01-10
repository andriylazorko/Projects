import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public int getBalance() {
        return balance;
    }

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();

    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        if ((amount > 0) && (this.balance > amount)) {
            int withdraw = -amount;
            transactions.add(withdraw);
            balance += withdraw;
            System.out.println(amount + " withdrawn. Balance is now " + balance);
        } else {
            System.out.println("This sum cannot withdraw");
        }
    }

    public void calculateBalance() {
        System.out.println("Now Balance is " + balance);
        balance = 0;
        for (int i : this.transactions) {
            balance += i;
        }
        System.out.println("Calculated balance is " + balance);
    }
}
