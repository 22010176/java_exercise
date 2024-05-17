package Bai3_BT2;

import java.util.ArrayList;

public class Kho {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();

    public int getSoThucPham() {
        int soThucPham = 0;
        for (SanPham sp : sanPhams)
            if (sp instanceof ThucPham)
                ++soThucPham;
        return soThucPham;
    }

    public int getSoDienTu() {
        int soDienTu = 0;
        for (SanPham sp : sanPhams)
            if (sp instanceof DienTu)
                ++soDienTu;
        return soDienTu;
    }

    public ArrayList<ThucPham> getThucPham() {
        ArrayList<ThucPham> tp = new ArrayList<ThucPham>();
        for (SanPham sp : sanPhams)
            if (sp instanceof ThucPham)
                tp.add((ThucPham) sp);

        return tp;
    }

    public ArrayList<DienTu> getDienTu() {
        ArrayList<DienTu> dt = new ArrayList<DienTu>();
        for (SanPham sp : sanPhams)
            if (sp instanceof DienTu)
                dt.add((DienTu) sp);

        return dt;
    }

    public void nhapKho(SanPham sp) {
        sanPhams.add(sp);
    }

    public void thongKe() {
        System.out.printf("Tong so san pham: %d\nSo sp thuc pham: %d\nSo sp dien tu: %d.\n", sanPhams.size(),
                getSoThucPham(), getSoDienTu());
    }
}
