package Bank;

import java.util.ArrayList;
import java.util.List;

public class Acc {
    long id;
    long balance;
    List<Transaction> transactions= new ArrayList<>();

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

}
