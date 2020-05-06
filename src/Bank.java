import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranch;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranch = new ArrayList<Branch>();
    }

    public boolean addCustomer(String branchName,
                               String customerName, double transaction){
        Branch searchBranch=search(branchName);
        if(searchBranch!=null){
            return searchBranch.addNewCustomer(customerName,transaction);
        }
        return false;
    }

    public boolean addBranch(String branchName){
        if(search(branchName)==null){
            this.bankBranch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch search(String name) {
        for (int i = 0; i < bankBranch.size(); i++) {
            Branch searchBranch=bankBranch.get(i);
            if(searchBranch.getBranchName().equals(name)){
                return searchBranch;
            }
        }
        return null;
    }
}
