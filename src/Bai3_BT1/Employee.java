package Bai3_BT1;

public class Employee {
    private static int _id = 0;
    private int id, namCongTac;
    private String ten, ho, ngaySinh;
    private double luong;

    Employee() {
        this("", "", "1/1/1", 0.0, 0);
    }

    Employee(String ten, String ho, String ngaySinh, double luong, int namCT) {
        this.id = ++_id;
        this.ten = ten;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.namCongTac = namCT;
        setLuong(luong);
    }

    public int getId() {
        return id;
    }

    public int getNamCongTac() {
        return namCongTac;
    }

    public String getHo() {
        return ho;
    }

    public double getLuong() {
        return luong;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setNamCongTac(int namCongTac) {
        this.namCongTac = namCongTac;
    }

    public void setLuong(double luong) {
        if (luong < 0)
            this.luong = 0;
        else
            this.luong = luong;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void in() {
        System.out.printf(toString());
    }

    public String toString() {
        return String.format("id: %d, ten nhan vien: %s %s, ngay sinh: %s, luong: %.2f, so nam cong tac: %d\n", id, ho,
                ten,
                ngaySinh, luong, namCongTac);
    }
}
