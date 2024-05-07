package BaiTapKeThua;

public class CanBo extends Nguoi {
    private String capHam, chucVu;

    public CanBo() {
        this.capHam = "Khong co chuc ham";
        this.chucVu = "Khong co chuc vu";
    }

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String capHam, String chucVu) {
        super(hoTen, ngaySinh, gioiTinh);
        this.capHam = capHam;
        this.chucVu = chucVu;
    }

    public String getCapHam() {
        return capHam;
    }

    public String getChucVu() {
        return chucVu;

    }

    public void setCapHam(String capHam) {
        this.capHam = capHam;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public void in() {
        super.in();
        System.out.printf("\nchuc vu: %s, cap ham: %s", chucVu, capHam);
    }
}
