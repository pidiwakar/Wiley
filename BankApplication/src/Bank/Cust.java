package Bank;

import java.util.ArrayList;
import java.util.List;

public class Cust {
    int id;
    String name;
    List<Acc> accs= new ArrayList<>();
    static List<Cust> custs= new ArrayList<>();

    public Cust() {
    }

    public Cust(int id, String name) {
        this.id = id;
        this.name = name;
        //custs.add(new Cust(id,name));
    }

    public List<Acc> getAccs() {
        return accs;
    }

    public static List<Cust> getCusts() {
        return custs;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accs=" + accs +
                '}';
    }
}
