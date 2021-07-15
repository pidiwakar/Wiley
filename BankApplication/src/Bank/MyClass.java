package Bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaintainTransac {
    Map<Acc,List<Transaction>> m = new HashMap<>();
    int[] den = new int[2];

    public void deposit(Acc acc,long amt) {
        acc.transactions.add(new Transaction("debit",acc.balance,acc.balance+amt));
        acc.balance+=amt;
        m.put(acc, acc.transactions);
    }

    public void withdraw(Acc acc,long amt) {
        if(amt>acc.balance) {
            System.out.println("Account balance not sufficient");
            return;
        }
        acc.transactions.add(new Transaction("debit",acc.balance,acc.balance-amt));
        acc.balance-=amt;
        m.put(acc, acc.transactions);
    }

}


public class MyClass {

    public static void main(String[] args) {


    }
}
