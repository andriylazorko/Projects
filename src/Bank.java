import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranch;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranch = new ArrayList<Branch>();
    }

    public boolean listCustomer(String branchName, boolean showTransaction) {
        Branch branch = search(branchName);
        if (branch != null) {
            System.out.println(bankName + "`s branch name is " + branch.getBranchName() +
                    ", number of branch is " +
                    bankBranch.indexOf(branch) + 1);
            ArrayList<Customer> branchCustomer = branch.getBranchCustomer();
            System.out.println(" List of customers:          Transaction:");
            for (int i = 0; i < branchCustomer.size(); i++) {
                System.out.print("  "+(i + 1) + ". ");
                System.out.print(branchCustomer.get(i).getCustomerName());

                if (showTransaction) {
                    ArrayList<Double> transactions = branchCustomer.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        if (j == 0) {
                            System.out.println(":");
                        }
                        System.out.print("                              " + (j + 1) + ". " +
                                transactions.get(j));
                        System.out.println();
                    }
                } else {
                    System.out.println();
                }
            }
            return true;
        } else {
            System.out.println(" Branch " + branchName + " of " + bankName + " was not found.");
            return false;
        }
    }

    public boolean addTransaction(String branchName, String customerName, double transaction) {
        Branch searchBranch = search(branchName);
        if (searchBranch != null) {

            return searchBranch.addNewTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomer(String branchName,
                               String customerName, double transaction) {
        Branch searchBranch = search(branchName);
        if (searchBranch != null) {
            return searchBranch.addNewCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addBranch(String branchName) {
        if (search(branchName) == null) {
            this.bankBranch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch search(String name) {
        for (int i = 0; i < bankBranch.size(); i++) {
            Branch searchBranch = bankBranch.get(i);
            if (searchBranch.getBranchName().equals(name)) {
                return searchBranch;
            }
        }
        return null;
    }
}
