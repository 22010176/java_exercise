package Bai4_BT4_Bai1;

public class Duck extends Animal {
    private double weight;

    public Duck() {
        this("", 0.0);
    }

    public Duck(String name, double weight) {
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
        System.out.println("vit vit");

    }
}
