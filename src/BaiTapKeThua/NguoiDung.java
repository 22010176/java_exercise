package BaiTapKeThua;

public class NguoiDung extends Nguoi {
    private String diaChi, email;

    public NguoiDung() {
        this.diaChi = "Khong co dia chi";
        this.email = "Khong co email";
    }

    public NguoiDung(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String email) {
        super(hoTen, ngaySinh, diaChi);
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void in() {
        super.in();
        System.out.printf("\ndia chi: %s, email: %s", diaChi, email);
    }
}
