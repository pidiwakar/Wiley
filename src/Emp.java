import java.util.*;

public class Emp {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1",10000,"BOM");
        Employee e2 = new Employee("E2",1000,"DEL");
        Employee e3 = new Employee("E3",100000,"BANG");
        Employee e4 = new Employee("E4",1000000,"HYD");
        Employee e5 = new Employee("E5",100,"HYD");
        List l = new ArrayList();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);

        Collections.sort(l,new EmpComp());
        System.out.println(l);
    }
}

class Employee {
    String eid;
    int sal;
    String address;

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", sal=" + sal +
                ", address='" + address + '\'' +
                '}';
    }

    public Employee(String id, int salary, String add) {
        eid=id;
        sal=salary;
        address=add;
    }

}

class EmpComp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o1;
        int res = e1.eid.compareTo(e2.eid);
        if(res!=0)
            return res;
        res=e1.address.compareTo(e2.address);
        if (res!=0)
            return res;
        return e1.sal-e2.sal;
    }
}

class EmpIdComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        return e1.eid.compareTo(e2.eid);
    }
}

class EmpAddComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String s1 = e1.address;
        String s2 = e2.address;
        return s1.compareTo(s2);
    }
}

class EmpSalComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        return e1.sal-e2.sal;
    }
}