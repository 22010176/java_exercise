package Bai4_BT1;

public class Table extends Furniture {
    private String shape;

    Table() {
        this("", 0.0, "");
    }

    Table(String material, double price, String shape) {
        super(material, price);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public void in() {
        super.in();
        System.out.printf(", hinh dang: %s", shape);
    }
}
