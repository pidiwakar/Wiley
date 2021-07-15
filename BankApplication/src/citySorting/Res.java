//package citySorting;
//
//import java.util.*;
//
//
//public class Res {
//
//    void create() {
//        Address add = new Address();
//        User u = new User();
//
//        Map<Address, List<User>> m = new HashMap<>();
//
//        Address a1 = new Address("BLR", 562157);
//        Address a2 = new Address("DEL", 100032);
//        Address a3 = new Address("MUM", 634007);
//        Address a4 = new Address("BLR", 500012);
//        Address a5 = new Address("MUM", 657802);
//        Address a6 = new Address("GA", 100231);
//
//        User u1 = new User(1, "Rahul");
//        User u2 = new User(2, "Tony");
//        User u3 = new User(3, "Dodo");
//        User u4 = new User(4, "Gattu");
//        User u5 = new User(5, "Mohit");
//        User u6 = new User(6, "Kanishk");
//        User u7 = new User(7, "pulkit");
//        User u8 = new User(8, "akash");
//
//        u1.address.add(a1);
//        m.put(a1, new ArrayList<User>(Arrays.asList(u1)));
//        u1.address.add(a3);
//        m.put(a3, new ArrayList<User>(Arrays.asList(u1)));
//        u2.address.add(a3);
//        m.put(a3, new ArrayList<User>(Arrays.asList(u2)));
//        u2.address.add(a1);
//        m.put(a1, new ArrayList<User>(Arrays.asList(u2)));
//        u2.address.add(a2);
//        m.put(a2, new ArrayList<User>(Arrays.asList(u2)));
//        u4.address.add(a3);
//        m.put(a3, new ArrayList<User>(Arrays.asList(u4)));
//        u3.address.add(a1);
//        m.put(a1, new ArrayList<User>(Arrays.asList(u3)));
//
//        u5.address.add(a5);
//        m.put(a5, new ArrayList<User>(Arrays.asList(u5)));
//        u5.address.add(a1);
//        m.put(a1, new ArrayList<User>(Arrays.asList(u5)));
//        u5.address.add(a2);
//        m.put(a6, new ArrayList<User>(Arrays.asList(u5)));
//        u6.address.add(a3);
//        m.put(a3, new ArrayList<User>(Arrays.asList(u6)));
//        u7.address.add(a1);
//        m.put(a1, new ArrayList<User>(Arrays.asList(u7)));
//
//        u7.address.add(a6);
//        m.put(a6, new ArrayList<User>(Arrays.asList(u7)));
//        u7.address.add(a1);
//        m.put(a1, m[a1].add(u7));
//
//    }
//
//}
