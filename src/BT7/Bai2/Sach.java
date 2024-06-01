package BT7.Bai2;

public class Sach extends AnPham {
    private String tacGia, nxb;

    public Sach(String ten, int sxb, int soLuong, String tgxb, int gia, String tacGia, String nxb) {
        super(ten, sxb, soLuong, tgxb, gia);
        this.nxb = nxb;
        this.tacGia = tacGia;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sach: " + super.toString() + String.format(", tac gia: %s, nha xuat ban: %s", tacGia, nxb);
    }
}
