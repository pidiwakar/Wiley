package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class User {
    int id;
    String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "set.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}




class Type {
    Object o;

    public Type() {
    }

    public Type(Object o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "set.Type{" +
                "o=" + o +
                '}';
    }
}


class CustComp1 implements Comparator<Type> {
    public CustComp1() {
    }

    @Override
    public int compare(Type o1, Type o2) {
        if (o1.o instanceof Integer) {
            if (o2.o instanceof Integer) {
                int i = (Integer) o1.o;
                int j = (Integer) o2.o;
                return i - j;
            }
            else
                return -1;
        }
        if(o1.o instanceof String) {
            if(o2.o instanceof String)
            {
                String s1 = (String) o1.o;
                String s2 = (String) o2.o;
                return s1.compareTo(s2);
            }
            else
                return 1;
        }
        if(o1.o instanceof User) {
            if (o2.o instanceof User)
            {
                User u1 = (User) o1.o;
                User u2 =(User) o2.o;
                return u1.id-u2.id;
            }
            else if (o2.o instanceof Integer)
                return 1;
            else
                return -1;
        }
        return 0;
    }
}

class CustComp2 implements Comparator<Type> {
    public CustComp2() {
    }

    @Override
    public int compare(Type o1, Type o2) {
        if (o1.o instanceof Integer) {
            if (o2.o instanceof Integer) {
                int i = (Integer) o1.o;
                int j = (Integer) o2.o;
                return i - j;
            }
            else
                return 1;
        }
        if(o1.o instanceof String) {
            if(o2.o instanceof String)
            {
                String s1 = (String) o1.o;
                String s2 = (String) o2.o;
                return s1.compareTo(s2);
            }
            else
                return -1;
        }
        if(o1.o instanceof User) {
            if (o2.o instanceof User)
            {
                User u1 = (User) o1.o;
                User u2 =(User) o2.o;
                return u1.name.compareTo(u2.name);
            }
            else if (o2.o instanceof Integer)
                return -1;
            else
                return 1;
        }
        return 0;
    }
}


class CustComp3 implements Comparator<Type> {
    public CustComp3() {
    }

    @Override
    public int compare(Type o1, Type o2) {
        if (o1.o instanceof Integer) {
            if (o2.o instanceof Integer) {
                int i = (Integer) o1.o;
                int j = (Integer) o2.o;
                return i - j;
            }
            else
                return 1;
        }
        if(o1.o instanceof User) {
            if (o2.o instanceof User)
            {
                User u1 = (User) o1.o;
                User u2 =(User) o2.o;
                return u1.name.compareTo(u2.name);
            }
            else if (o2.o instanceof Integer)
                return -1;
            if(o2.o instanceof String) {
                User u1 = (User) o1.o;
                String u2 = (String) o2.o;
                String s = u1.name;
                return s.compareTo(u2);
            }
        }
        if(o1.o instanceof String) {
            if(o2.o instanceof String)
            {
                String s1 = (String) o1.o;
                String s2 = (String) o2.o;
                return s1.compareTo(s2);
            }
            else if (o2.o instanceof User) {
                User u1 = (User) o2.o;
                String u2 = (String) o1.o;
                String s = u1.name;
                return u2.compareTo(s);
            }

            else
                return -1;
        }

        return 0;
    }
}

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
