import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double>transactions;

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions=new ArrayList<Double>();
        addTransaction(initialTransaction);
    }
    public void addTransaction(double newTransaction){
        this.transactions.add(newTransaction);
    }
    public String getCustomerName() {
        return customerName;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
