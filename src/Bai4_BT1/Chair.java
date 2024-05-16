package Bai4_BT1;

public class Chair extends Furniture {
    private int numOfLegs;

    public Chair() {
        this("", 0.0, 0);
    }

    public Chair(String material, double price, int numOfLegs) {
        super(material, price);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void in() {
        // TODO Auto-generated method stub
        super.in();
        System.out.printf(", so chan: %d", numOfLegs);
    }
}
