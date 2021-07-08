package set;

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
