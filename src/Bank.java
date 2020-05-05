import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch>bankBranch;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranch = new ArrayList<Branch>();

    }
}
