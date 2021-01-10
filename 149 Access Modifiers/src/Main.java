public class Main {
    public static void main(String[] args) {
        Account lazAccount = new Account("My Bank");
        lazAccount.deposit(6000);
        lazAccount.withdraw(1000);
        lazAccount.withdraw(500);
        lazAccount.withdraw(-12);
        lazAccount.deposit(-49);
        lazAccount.calculateBalance();

        System.out.println("Balance on account is "+lazAccount.getBalance());
    }
}
