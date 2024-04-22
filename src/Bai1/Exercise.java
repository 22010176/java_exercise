package Bai1;

public class Exercise {
    public static void Bai1(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("La tam giac");
        else
            System.out.println("Ko la tam giac");
    }

    public static void Bai2(int x) {
        if (2 <= x && x <= 7)
            System.out.println("La 1 ngay trong tuan");
        else
            System.out.println("Ko la mot ngay trong tuan");
    }

    public static void Bai3(int x) {
        if (x <= 1) {
            System.out.println("Ko la so nguyen to.");
            return;
        }
        if (x <= 3) {
            System.out.println("La so nguyen to");
        }

        int limit = (int) Math.ceil(Math.sqrt(x));
        for (int i = 0; i < limit; ++i)
            if (x % i == 0) {
                System.out.println("Khong la so nguyen to");
                return;
            }

        System.out.println("La so nguyen to");
    }

    public static void Bai4(int x) {
        double a = 0;
        for (int i = 1; i <= x; ++i)
            a += 1.0 / (i * 2);

        System.out.printf("Ket qua la: %.2f", a);
    }

}
