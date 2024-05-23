package Bai4_BT4_Bai1;

public class Mouse extends Animal {
    private double weight;

    public Mouse() {
        this("", 0.0);
    }

    public Mouse(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        System.out.println("chit chit");

    }
}
