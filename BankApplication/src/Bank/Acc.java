package Bank;

import java.util.ArrayList;
import java.util.List;

public class Acc {
    long id;
    long balance;

    public static List<Acc> getAc() {
        return ac;
    }

    static List<Acc> ac = new ArrayList<>();
    List<Transaction> transactions= new ArrayList<>();

    public Acc() {
    }

    public Acc(long id, long balance) {
        this.id = id;
        this.balance = balance;
       // ac.add(new Acc(id,balance));
    }



    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Acc{" +
                "id=" + id +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
