package Bai4_BT5_;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Demo {
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
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }

    public static String randDate() {
        int month = randInt(1, 12);
        return String.format("%d/%d/%d", randInt(1, checkMonth(month)), month, randInt(1950, 2024));
    }

    public static int FindItem(ArrayList<Khach> kh, Khach k) {
        for (int i = 0; i < kh.size(); ++i) {
            Khach _k = kh.get(i);
            if (_k.getHoTen().equals(k.getHoTen()))
                return i;
            else if (_k.getId() == k.getId())
                return i;
        }
        return -1;
    }

    public static String randGioiTinh() {
        return new String[] { "nam", "nu" }[randInt(0, 1)];
    }

    public static String randLyDo() {
        return new String[] { "du lich", "chua benh", "lam viec", "du hoc" }[randInt(0, 3)];
    }

    public static String randQuocTich() {
        return new String[] { "My", "Duc", "Canada", "Bi", "Uc", "Brazil", "Italia" }[randInt(0, 6)];
    }

    public static String randHinhThucQuanLy() {
        return new String[] { "Quan ly", "Theo doi dac biet", "Bat giu" }[randInt(0, 2)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Khach> khachs = new ArrayList<>();
        for (int i = 0; i < 1000; ++i) {
            int x = randInt(0, 3);
            switch (x) {
                case 0:
                    khachs.add(new KhachNoiDia(randString(10), randDate(), randGioiTinh(), randString(10),
                            randString(10), randDate()));
                    break;
                case 1:
                    khachs.add(new KhachQuocTe(randString(10), randDate(), randGioiTinh(), randString(10),
                            randQuocTich(), randLyDo(), randString(10), randDate()));
                    break;
                case 2:
                    khachs.add(new ToiPham(randString(10), randDate(), randGioiTinh(), randString(10),
                            randQuocTich(), randLyDo(), randString(10), randDate(), randHinhThucQuanLy()));
                    break;
            }
        }

        ArrayList<KhachQuocTe> khachCanTheoDoi = new ArrayList<>();
        for (Khach k : khachs) {
            if (k instanceof KhachNoiDia || k instanceof ToiPham)
                continue;

            KhachQuocTe kh = (KhachQuocTe) k;
            if (Math.random() > 0.95)
                khachCanTheoDoi.add(kh);

        }

        System.out.println();
        System.out.println("Danh sach khach du lich: ");
        for (Khach k : khachs) {
            if (k instanceof KhachNoiDia) {
                System.out.println("La khach noi dia:");
                System.out.print(((KhachNoiDia) k).toString());
            } else if (k instanceof KhachQuocTe) {
                System.out.println("La khach quoc te:");
                System.out.print(((KhachQuocTe) k).toString());
            } else if (k instanceof ToiPham) {
                System.out.println("La toi pham:");
                System.out.print(((ToiPham) k).toString());
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Danh sach khac can theo doi");
        for (KhachQuocTe k : khachCanTheoDoi)
            System.out.println(k.toString());

    }
}
