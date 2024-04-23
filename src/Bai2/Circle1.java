package Bai2;

public class Circle1 {
    private double radius = 5;

    public void setR(double r) {
        this.radius = r;
    }

    public double getR() {
        return this.radius;
    }

    public double getP() {
        return 2.0 * getR() * Math.PI;
    }

    public double getS() {
        return getR() * Math.PI * getS();
    }
}
