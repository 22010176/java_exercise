package Bai3_BT2;

public class ThucPham extends SanPham {
    private String nsx, hxd;

    ThucPham() {
        this.hxd = "0/0/0";
        this.nsx = "0/0/0";
    }

    ThucPham(String ma, String ten, String moTa, String dvTinh, double gia, boolean tonKho, String nsx, String hxd) {
        super(ma, ten, moTa, dvTinh, gia, tonKho);
        this.nsx = nsx;
        this.hxd = hxd;
    }

    public String getNsx() {
        return nsx;
    }

    public String getHxd() {
        return hxd;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public void setHxd(String hxd) {
        this.hxd = hxd;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nloai: thuc pham, ngay san xuat: %s, han su dung: %s", nsx, hxd);
    }

    @Override
    public void in() {
        System.out.println(toString());
    }
}
