package Banking;

public class Customer {
    private long Account_no;
    private String name;
    private static long balance;

    public Customer(long account_no, String name, long balance) {
        Account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    public long getAccount_no() {
        return Account_no;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
    public void deposit(long amt) {
        this.balance+=amt;
    }
    public void withdraw(long amt) {
        this.balance-=amt;
    }

}
