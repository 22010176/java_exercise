package BT7.Bai1;

public class Person {
    protected String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("%s(%s)", name, address);
    }
}
