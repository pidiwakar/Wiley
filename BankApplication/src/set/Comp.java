package set;

import java.util.Comparator;

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
