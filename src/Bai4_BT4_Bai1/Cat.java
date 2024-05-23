package Bai4_BT4_Bai1;

public class Cat extends Animal {
    protected String color;
    protected int height, age;

    public Cat() {
        this("", "", 0, 0);
    }

    public Cat(String name, String color, int height, int age) {
        super(name);
        this.color = color;
        this.height = height;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void talk() {
        System.out.println("meo meo");
    }
}
