package Bai4_BT5_;

public class KhachNoiDia extends Khach {
    private String dinhDanh, diaChiThuongTru, ngayQuaCuaKhau;

    public KhachNoiDia() {
        this("", "", "", "", "", "");
    }

    public KhachNoiDia(String hoTen, String sinhNhat, String gioiTinh, String dinhDanh, String diaChiThuongTru,
            String ngayQuaCuaKhau) {
        super(hoTen, sinhNhat, gioiTinh);
        this.dinhDanh = dinhDanh;
        this.diaChiThuongTru = diaChiThuongTru;
        this.ngayQuaCuaKhau = ngayQuaCuaKhau;
    }

    public String getDiaChiThuongTru() {
        return diaChiThuongTru;
    }

    public String getNgayQuaCuaKhau() {
        return ngayQuaCuaKhau;
    }

    public String getDinhDanh() {
        return dinhDanh;
    }

    public void setDiaChiThuongTru(String diaChiThuongTru) {
        this.diaChiThuongTru = diaChiThuongTru;
    }

    public void setDinhDanh(String dinhDanh) {
        this.dinhDanh = dinhDanh;
    }

    public void setNgayQuaCuaKhau(String ngayQuaCuaKhau) {
        this.ngayQuaCuaKhau = ngayQuaCuaKhau;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("dia chi: %s, ngay du lich: %s, dinh danh: %s\n", diaChiThuongTru,
                ngayQuaCuaKhau, dinhDanh);
    }

    @Override
    public void sua(Khach other) {
        // TODO Auto-generated method stub
        super.sua(other);
        if (other instanceof KhachNoiDia) {
            KhachNoiDia knd = (KhachNoiDia) other;
            setDiaChiThuongTru(knd.getDiaChiThuongTru());
            setNgayQuaCuaKhau(knd.getNgayQuaCuaKhau());
            setDinhDanh(knd.getDinhDanh());

        }
    }

}
