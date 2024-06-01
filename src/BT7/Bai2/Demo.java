package BT7.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    static public Scanner sc = new Scanner(System.in);
    private static String str = "1234567890qwertyuiopasdfghjklzxcvbnm";

    public static int randInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static String randString(int len) {
        String res = "";
        for (int i = 0; i < len; ++i)
            res += str.charAt(randInt(0, str.length() - 1));
        return res;
    }

    private static int checkMonth(int x) {
        switch (x) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            default -> {
                return 0;
            }
        }
    }

    public static String randDate() {
        int month = randInt(1, 12);
        return String.format("%d/%d/%d", randInt(1, checkMonth(month)), month, randInt(1950, 2024));
    }

    public static KyYeu GenKyYeu() {
        return new KyYeu("da" + randString(5), randInt(0, 1000), randInt(0, 1000), randDate(), randInt(1000, 10000),
                randString(10), randInt(2000, 2020));
    }

    public static Sach GenSach() {
        return new Sach(randString(5), randInt(0, 10000), randInt(0, 10000), randDate(), randInt(0, 100000),
                randString(5), randString(5));
    }

    public static TapChi GenTapChi() {
        return new TapChi(randString(5), randInt(0, 10000), randInt(0, 10000), randDate(), randInt(0, 100000),
                randString(5), randString(5));

    }

    public static void main(String[] args) {
        int n = 10;
        ArrayList<AnPham> anPhams = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            switch (randInt(0, 2)) {
                case 0 -> anPhams.add(GenKyYeu());
                case 1 -> anPhams.add(GenSach());
                case 2 -> anPhams.add(GenTapChi());

            }
        }
        ArrayList<AnPham> timKiem = new ArrayList<>();

        for (AnPham p : anPhams) {
            System.out.println(p.toString());
            if (p.getTen().indexOf("da") != -1)
                timKiem.add(p);
        }
        System.out.println("\n\nDanh sach tim kiem: ");
        for (AnPham p : anPhams) {
            System.out.println(p.toString());
        }

    }
}
