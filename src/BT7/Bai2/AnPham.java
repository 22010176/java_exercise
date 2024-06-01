package BT7.Bai2;

public class AnPham {
    private String ten, tgxb;
    private int gia, sxb, soLuong;

    public AnPham() {
        this("", 0, 0, "", 0);
    }

    public AnPham(String ten, int sxb, int soLuong, String tgxb, int gia) {
        this.ten = ten;
        this.sxb = sxb;
        this.soLuong = soLuong;
        this.tgxb = tgxb;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getSxb() {
        return sxb;
    }

    public String getTen() {
        return ten;
    }

    public String getTgxb() {
        return tgxb;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setSxb(int sxb) {
        this.sxb = sxb;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTgxb(String tgxb) {
        this.tgxb = tgxb;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("ten sach: %s,so xuat ban: %d, thoi gian xuat ban: %s, so luong: %d, gia tien: %d", ten,
                sxb, tgxb, soLuong, gia);
    }
}
