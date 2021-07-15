package citySorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class User {
    int id;
    String name;
    List<Address> address = new ArrayList<>();

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void addAddress(Address address) {
        this.address.add(address);
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
