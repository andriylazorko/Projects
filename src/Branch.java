import java.util.ArrayList;

public class Branch {
    private String BranchName;
    private ArrayList<Customer> branchCustomer;

    public Branch(String branchName) {
        BranchName = branchName;
        branchCustomer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return BranchName;
    }
    public ArrayList<Customer> getBranchCustomer() {
        return branchCustomer;
    }

    public boolean addNewCustomer(String name, double transaction){
        if(searchBranchCustomer(name)==null){
            branchCustomer.add(new Customer(name,transaction));
            return true;
        }
        return false;
    }
    public boolean addNewTransaction(String name,double transaction){
        Customer object = searchBranchCustomer(name);
        if(object!=null){
            object.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer searchBranchCustomer(String searchName){
        for(int i=0; i<this.branchCustomer.size(); i++){
            if(this.branchCustomer.get(i).getCustomerName().equals(searchName)){
                return this.branchCustomer.get(i);
            }
        }
        return null;
    }
}
