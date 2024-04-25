package Chuong3;

public class Person {
    private StandardStr name;
    private int id;
    static int ID = 0;

    public Person() {
        this("default name");
    }

    public Person(String name) {
        this.id = ++Person.ID;
        this.name = new StandardStr(name);
        this.name.formatStr();
    }

    public static int getID() {
        return ID;
    }

    public String getName() {
        return name.toString();
    }

    public void setName(String name) {
        this.name = new StandardStr(name);
        this.name.formatStr();
    }

    public void print() {
        System.out.printf("ID: %d, ten: %s\n", this.id, this.name.getStr());
    }

}
