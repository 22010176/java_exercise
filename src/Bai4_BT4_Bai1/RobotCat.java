package Bai4_BT4_Bai1;

public class RobotCat extends Cat {
    private double batery;

    public RobotCat() {
        this("", "", 0, 0, 0);
    }

    public RobotCat(String name, String color, int height, int age, double batery) {
        super(name, color, height, age);
        this.batery = batery;
    }

    public double getBatery() {
        return batery;
    }

    public void setBatery(double batery) {
        this.batery = batery;
    }

    @Override
    public void talk() {
        System.out.println("xin chao");
    }
}
