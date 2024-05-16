package Bai4_BT1;

public class Furniture {
    private String material;
    private double price;

    Furniture() {
        this("", 0.0);
    }

    Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void in() {
        System.out.printf("Chat lieu: %s, gia: %.2f", material, price);
    }
}
