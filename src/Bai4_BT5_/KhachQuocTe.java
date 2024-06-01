package Bai4_BT5_;

public class KhachQuocTe extends Khach {
    String soHoChieu, quocTich, lyDoNhapCanh, diaDiemDen, thoiHanLuuTruToiDa;

    public KhachQuocTe() {

    }

    public KhachQuocTe(String hoTen, String sinhNhat, String gioiTinh, String soHoChieu, String quocTich,
            String lyDoNhapCanh, String diaDiemDen,
            String thoiHanLuuTruToiDa) {
        super(hoTen, sinhNhat, gioiTinh);
        this.lyDoNhapCanh = lyDoNhapCanh;
        this.diaDiemDen = diaDiemDen;
        this.thoiHanLuuTruToiDa = thoiHanLuuTruToiDa;
        this.quocTich = quocTich;
        this.soHoChieu = soHoChieu;
    }

    public String getThoiHanLuuTruToiDa() {
        return thoiHanLuuTruToiDa;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public String getLyDoNhapCanh() {
        return lyDoNhapCanh;
    }

    public String getDiaDiemDen() {
        return diaDiemDen;
    }

    public void setThoiHanLuuTruToiDa(String thoiHanLuuTruToiDa) {
        this.thoiHanLuuTruToiDa = thoiHanLuuTruToiDa;
    }

    public void setDiaDiemDen(String diaDiemDen) {
        this.diaDiemDen = diaDiemDen;
    }

    public void setLyDoNhapCanh(String lyDoNhapCanh) {
        this.lyDoNhapCanh = lyDoNhapCanh;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()
                + String.format("han luu tru: %s, dia diem den: %s, ly do nhap canh: %s, quoc tich: %s, ho chieu: %s\n",
                        thoiHanLuuTruToiDa, diaDiemDen, lyDoNhapCanh, quocTich, soHoChieu);
    }

    @Override
    public void sua(Khach other) {
        // TODO Auto-generated method stub
        super.sua(other);
        if (other instanceof KhachQuocTe) {
            KhachQuocTe kqt = (KhachQuocTe) other;
            setDiaDiemDen(kqt.getDiaDiemDen());
            setLyDoNhapCanh(kqt.getLyDoNhapCanh());
            setQuocTich(kqt.getQuocTich());
            setSoHoChieu(kqt.getSoHoChieu());
            setThoiHanLuuTruToiDa(kqt.getThoiHanLuuTruToiDa());
        }
    }
}
