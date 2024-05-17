package Bai3_BT2;

public class SanPham {
    private String ma, ten, moTa, dvTinh;
    private double gia;
    private boolean tonKho;

    SanPham() {
        this("", "", "", "", 0.0, false);
    }

    SanPham(String ma, String ten, String moTa, String dvTinh, double gia, boolean tonKho) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.dvTinh = dvTinh;
        this.gia = gia;
        this.tonKho = tonKho;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public double getGia() {
        return gia;
    }

    public String getMa() {
        return ma;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTonKho(boolean tonKho) {
        this.tonKho = tonKho;
    }

    public String toString() {
        return String.format("ma: %s, ten: %s,\nmo ta: %s,\ndon vi tinh: %s, gia: %.2f, ton kho: %s", ma, ten, moTa,
                dvTinh, gia, tonKho ? "co" : "khong");
    }

    public void in() {
        System.out.println(toString());
    }
}
