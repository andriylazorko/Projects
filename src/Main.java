public class Main {
    public static void main(String[] args) {
        System.out.println(" Exercise 112-114 ");
        System.out.println(" Autoboxing and Unboxing ");

        Bank bank = new Bank("National Australia Bank");

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Tim",50.02);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide","Percy",220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob", 150.54);

        bank.addCustomerTransaction("Adelaide","Tim",44.22);
        bank.addCustomerTransaction("Adelaide","Tim",17.34);
        bank.addCustomerTransaction("Adelaide","Mike",2120.19);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney",true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne","Brian",5.53)){
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }

    }
}