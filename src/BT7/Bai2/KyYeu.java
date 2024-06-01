package BT7.Bai2;

import java.util.HashMap;

public class KyYeu extends AnPham {
    private String loai;
    private int nam;
    private HashMap<String, String> baiDang;

    public KyYeu() {
        this("", 0, 0, "", 0, "", 0);
    }

    public KyYeu(String ten, int sxb, int soLuong, String tgxb, int gia, String loai, int nam) {
        super(ten, sxb, soLuong, tgxb, gia);
        baiDang = new HashMap<>();
        this.loai = loai;
        this.nam = nam;
    }

    public int getNam() {
        return nam;
    }

    public String getLoai() {
        return loai;
    }

    public HashMap<String, String> getBaiDang() {
        return baiDang;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setBaiDang(HashMap<String, String> baiDang) {
        this.baiDang = baiDang;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ky yeu: " + super.toString() + String.format(", nam: %d, loai ki yeu: %s", nam, loai);
    }
}
