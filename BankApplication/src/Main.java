import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(12341238,"Piyush",10000);
        Customer c2 = new Customer(18975678,"Rahul",12000);
        Customer c3 = new Customer(12345668,"Gattu",18000);
        Customer c4 = new Customer(12345670,"Mohit",10060);
        Customer.addCustomer(c1);
        Customer.addCustomer(c2);
        Customer.addCustomer(c3);
        Customer.addCustomer(c4);

        c1.getAccount_no();
        c2.deposit(1000);
        c3.withdraw(1200);
        c3.withdraw(100000);

        Customer.getCustomerList().stream().forEach(System.out::println);


    }
}
