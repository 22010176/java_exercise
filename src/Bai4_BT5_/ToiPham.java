package Bai4_BT5_;

import java.util.ArrayList;

public class ToiPham extends KhachQuocTe {
    private String hinhThucQuanLy;
    public static ArrayList<ToiPham> danhSachToiPham = new ArrayList<>();

    public ToiPham() {
        this("", "", "", "", "", "", "", "", "");
    }

    public ToiPham(String hoTen, String sinhNhat, String gioiTinh, String soHoChieu, String quocTich,
            String lyDoNhapCanh, String diaDiemDen,
            String thoiHanLuuTruToiDa, String hinhThucQuanLy) {
        super(hoTen, sinhNhat, gioiTinh, soHoChieu, quocTich, lyDoNhapCanh, diaDiemDen, thoiHanLuuTruToiDa);
        this.hinhThucQuanLy = hinhThucQuanLy;

        danhSachToiPham.add(this);
    }

    public String getHinhThucQuanLy() {
        return hinhThucQuanLy;
    }

    public void setHinhThucQuanLy(String hinhThucQuanLy) {
        this.hinhThucQuanLy = hinhThucQuanLy;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("cach quan ly: %s\n", hinhThucQuanLy);
    }

    @Override
    public void sua(Khach other) {
        super.sua(other);
        if (other instanceof ToiPham) {
            ToiPham tp = (ToiPham) other;
            setHinhThucQuanLy(tp.getHinhThucQuanLy());
        }
    }
}
