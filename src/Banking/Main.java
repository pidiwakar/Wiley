package Banking;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(12345678,"Piyush",10000);
        c.deposit(500);
        System.out.println(c.getBalance());
        c.withdraw(2000);
        System.out.println(c.getBalance());
    }
}
