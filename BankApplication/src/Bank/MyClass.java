package Bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaintainTransac {
    Map<Acc,List<Transaction>> m = new HashMap<>();
    //int[] den = new int[2];

    public void deposit(Acc acc,long amt) {
        acc.transactions.add(new Transaction("credit",acc.balance,acc.balance+amt));
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
    void getTransacofAcc(Acc acc) {
        List<Transaction> tran = m.get(acc);
        System.out.println("Transactions of account "+acc.getId()+" are : ");
        for(Transaction t:tran) {
            System.out.println("Type of transaction : " + t.type);
            System.out.println(" Old balance : " + t.old_balance);
            System.out.println(" Updated balance : " + t.updated_balance);
        }
    }
    void openAcc(Cust c,long acno, long bal) {
        Acc a = new Acc(acno,bal);
        c.accs.add(a);
    }

}


public class MyClass {

    public static void main(String[] args) {
            MaintainTransac mt = new MaintainTransac();
            Cust c = new Cust(10,"c1");
            Acc a = new Acc(1543,25000);
            mt.openAcc(new Cust(1,"c2"),1004,100000);
            mt.openAcc(new Cust(2,"c3"),1114,10500);
            mt.openAcc(new Cust(3,"c4"),1224,110000);
            mt.openAcc(new Cust(4,"c5"),1334,20000);
            mt.openAcc(new Cust(5,"c6"),1444,1000);
            mt.openAcc(c,7654,400000);

            mt.deposit(a,100);
            mt.getTransacofAcc(a);
            mt.withdraw(a,20000);
            mt.getTransacofAcc(a);


    }
}
