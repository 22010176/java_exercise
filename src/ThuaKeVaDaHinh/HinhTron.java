package ThuaKeVaDaHinh;

public class HinhTron extends Shape {
    public static HinhTron GenShape() {
        return new HinhTron(Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }

    private double x, y, r;

    HinhTron() {
        this(0, 0, 0);
    }

    HinhTron(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getDienTinh() {
        return Math.PI * r * r;
    }

    @Override
    public double getDoDaiCanh() {
        return r;
    }

    @Override
    public String getThongTin() {
        return String.format("Toa do tam O: %.2f %.2f. Ban kinh: %.2f\n", x, y, r);
    }
}
