package Bank;

public class Transaction {
    String type;
    long old_balance;
    long updated_balance;

    public Transaction(String type, long old_balance, long updated_balance) {
        this.type = type;
        this.old_balance = old_balance;
        this.updated_balance = updated_balance;
    }
}
