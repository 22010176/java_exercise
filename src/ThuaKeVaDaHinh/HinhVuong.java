package ThuaKeVaDaHinh;

public class HinhVuong extends Shape {
    public static HinhVuong GenShape() {
        return new HinhVuong(Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }

    private double x, y, r;

    HinhVuong() {
        this(0, 0, 0);
    }

    HinhVuong(double x, double y, double r) {
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
        // TODO Auto-generated method stub
        return r * r;
    }

    @Override
    public double getDoDaiCanh() {
        // TODO Auto-generated method stub
        return 4 * r;
    }

    @Override
    public String getThongTin() {
        // TODO Auto-generated method stub
        return String.format("Hinh vuong co do dai canh la: %.2f, co tao do la: %.2f,%.2f\n", r, x, y);
    }
}
