public class Main {
    public static void main(String[] args) {
        System.out.println(" 114. Autoboxing & Unboxing (Challenge Exercise) - My version ");
        Bank bank = new Bank("Lazer");
        if (!bank.addBranch("Komarno")) {
            System.out.println(" Branch Komarno created ");
        }
        bank.addCustomer("Komarno", "Andriy", 9152.9);
        bank.addCustomer("Komarno", "Vasily", 1512.9);
        bank.addCustomer("Komarno", "Igor", 1852.9);
        bank.addCustomer("Litovka", "Your4ik", 11.2);

        bank.addTransaction("Komarno", "Andriy", 8933.4);
        bank.addTransaction("Komarno", "Andriy", 829333.54);
        bank.addTransaction("Komarno", "Andriy", 43.11);
        bank.addTransaction("Komarno", "Vasily", 11512.29);

        bank.listCustomer("Komarno", true);
        bank.listCustomer("litovka", true);


    }
}
