package Bai4_BT5_;

public class Khach {
    private static int _id = 0;

    private int id;
    protected String hoTen, sinhNhat, gioiTinh;

    public Khach() {
        this("", "", "");
    }

    public Khach(String hoTen, String sinhNhat, String gioiTinh) {
        this.id = ++_id;
        this.hoTen = hoTen;
        this.sinhNhat = sinhNhat;
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getId() {
        return id;
    }

    public String getSinhNhat() {
        return sinhNhat;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSinhNhat(String sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public String toString() {
        return String.format("id: %s, ho ten: %s, gioi tinh: %s, ngay sinh: %s\n", getId(), getHoTen(), getGioiTinh(),
                getSinhNhat());
    }

    public void sua(Khach other) {
        setGioiTinh(other.getGioiTinh());
        setHoTen(other.getHoTen());
        setSinhNhat(other.getSinhNhat());
    }
}
