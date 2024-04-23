package Bai2;

import java.util.*;

public class Bai1 {
    public static void bai1() {
        Scanner sc = new Scanner(System.in);

        int sum = 0, ma = 0, mim = 0, temp = 1, n = 0;
        while (temp != 0) {
            temp = sc.nextInt();
            if (temp > ma)
                ma = temp;
            else if (temp < mim)
                mim = temp;
            sum += temp;
            ++n;
        }
        System.out.printf("Trung binh: %.2f", (double) sum / n);
        System.out.printf("max: %d", ma);
        System.out.printf("min: %d", mim);

        sc.close();
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = 0;
        for (int i = 1; i <= n; ++i)
            x += 1 / i;

        System.out.printf("Ket qua la: %.2f", x);
        sc.close();
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);

        Circle1 a = new Circle1();
        Circle1 b = new Circle1();
        b.setR(sc.nextDouble());

        sc.close();
    }
}
