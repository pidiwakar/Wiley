package citySorting;

public class Address {
    String city;
    int zip;
    static int cnt=0;

    public Address() {
    }

    public Address(String city, int zip) {
        this.city = city;
        this.zip = zip;
        cnt++;
    }
}
