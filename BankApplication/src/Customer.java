import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long Account_no;
    private String name;
    private long balance;
    private static List<Customer> CustomerList = new ArrayList<>();

    public static List<Customer> getCustomerList() {
        return CustomerList;
    }

    public Customer(long account_no, String name, long balance) {
        Account_no = account_no;
        this.name = name;
        this.balance = balance;
//        Customer c1 = new Customer(account_no,name,balance);
//        CustomerList.add(c1);
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
        if(amt>balance) {
            System.out.println("Account balance not sufficient");
            return;
        }
        this.balance-=amt;
    }

    public static void addCustomer(Customer c) {
        Customer.CustomerList.add(c);
    }

        Customer findByAcNumber ( long ac){
        for (Customer c : CustomerList)
            if (c.getAccount_no() == ac)
                return c;
        System.out.println("Invalid account number");
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Account_no=" + Account_no +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
