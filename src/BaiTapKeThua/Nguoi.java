package BaiTapKeThua;

public class Nguoi {
    protected String hoTen, ngaySinh, gioiTinh;

    public Nguoi() {
        this("Khong co ten", "Khong co ngay sinh", "Khong co gioi tinh");
    }

    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void in() {
        System.out.printf("ho va ten: %s, gioi tinh: %s, ngay sinh: %s", hoTen, gioiTinh, ngaySinh);
    }
}
