package Bai4_BT4_Bai1;

public abstract class Animal {
    protected String name;

    public Animal() {
        this("");
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void talk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
