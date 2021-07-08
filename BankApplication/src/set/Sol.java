package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class Sol {

    public static void main(String[] args) {
        Set set = new TreeSet(new CustComp1());
        set.add(new Type(new Integer(2)));
        set.add(new Type(new Integer(3)));
        set.add(new Type(new Integer(4)));
        set.add(new Type(new String("Hey")));
        set.add(new Type(new String("THey")));
        set.add(new Type(new String("ey")));
        set.add(new Type(new User(1,"piyush")));
        set.add(new Type(new User(2,"abcd")));
        set.add(new Type(new User(3,"xyz")));

        set.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------");

        Set s1 = new TreeSet(new CustComp2());
        s1.add(new Type(new Integer(2)));
        s1.add(new Type(new Integer(3)));
        s1.add(new Type(new Integer(4)));
        s1.add(new Type(new String("Hey")));
        s1.add(new Type(new String("THey")));
        s1.add(new Type(new String("ey")));
        s1.add(new Type(new User(1,"piyush")));
        s1.add(new Type(new User(2,"abcd")));
        s1.add(new Type(new User(3,"xyz")));

        s1.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------");

        Set s = new TreeSet(new CustComp3());
        s.add(new Type(new Integer(2)));
        s.add(new Type(new Integer(3)));
        s.add(new Type(new Integer(4)));
        s.add(new Type(new String("hey")));
        s.add(new Type(new String("tHey")));
        s.add(new Type(new String("ey")));
        s.add(new Type(new User(1,"piyush")));
        s.add(new Type(new User(2,"abcd")));
        s.add(new Type(new User(3,"xyz")));

        s.forEach(System.out::println);

    }
}
