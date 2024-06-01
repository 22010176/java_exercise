package BT7.Bai2;

public class TapChi extends AnPham {
    private String loaiTapChi, chuyenhNganh;

    public TapChi() {

    }

    public TapChi(String ten, int sxb, int soLuong, String tgxb, int gia, String loaiTapChi, String chuyenhNganh) {
        super(ten, sxb, soLuong, tgxb, gia);
        this.loaiTapChi = loaiTapChi;
        this.chuyenhNganh = chuyenhNganh;

    }

    public String getLoaiTapChi() {
        return loaiTapChi;
    }

    public String getChuyenhNganh() {
        return chuyenhNganh;
    }

    public void setChuyenhNganh(String chuyenhNganh) {
        this.chuyenhNganh = chuyenhNganh;
    }

    public void setLoaiTapChi(String loaiTapChi) {
        this.loaiTapChi = loaiTapChi;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tap Chi: " + super.toString()
                + String.format(", loai tap chi: %s, chuyen nganh: %s", loaiTapChi, chuyenhNganh);

    }
}
