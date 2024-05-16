package ThuaKeVaDaHinh;

public class HinhChuNhat extends Shape {
    public static HinhChuNhat GenShape() {
        return new HinhChuNhat(Math.random() * 100, Math.random() * 100, Math.random() * 100, Math.random() * 100);
    }

    private double x, y, chieuDai, chieuRong;

    public HinhChuNhat() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public HinhChuNhat(double x, double y, double chieuDai, double chieuRong) {
        this.x = x;
        this.y = y;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;

    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getDienTinh() {
        return chieuDai * chieuRong;
    }

    @Override
    public double getDoDaiCanh() {
        return Math.sqrt(chieuDai * chieuDai + chieuRong * chieuRong);
    }

    @Override
    public String getThongTin() {
        return String.format("Chieu dai: %.2f, chieu rong %.2f, toa do: %.2f, %.2f\n", x, y, chieuDai, chieuRong);
    }
}
