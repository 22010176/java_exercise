package BaiTapCoBan;

public class Bai1 {
    public static int UCLN(int a, int b) {
        int max = Math.max(a, b), min = Math.min(a, b);
        int res = max % min;
        return res == 0 ? min : UCLN(min, res);
    }

    public static void main(String[] args) {
        System.out.println(UCLN(120, 40));
        System.out.println(UCLN(150, 40));
        System.out.println(UCLN(120, 47));
        System.out.println(UCLN(180, 40));
    }
}
