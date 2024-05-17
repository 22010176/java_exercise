package Bai3_BT2;

public class DienTu extends SanPham {
    private String nhaSX;
    private int baoHanh;

    DienTu() {
        this.nhaSX = "";
        this.baoHanh = 0;

    }

    DienTu(String ma, String ten, String moTa, String dvTinh, double gia, boolean tonKho, String nsx, int baoHanh) {
        super(ma, ten, moTa, dvTinh, gia, tonKho);
        this.nhaSX = nsx;
        this.baoHanh = baoHanh;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public void setBaoHanh(int baoHanh) {
        this.baoHanh = baoHanh;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("nha san xuat: %s, so thang bao hanh: %d", nhaSX, baoHanh);
    }

    @Override
    public void in() {
        // TODO Auto-generated method stub
        System.out.println(toString());
    }
}
