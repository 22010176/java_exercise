package BaiTapCoBan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Bai3 {
    public static void XuatMang(int[] arr) {
        for (int i = 0; i < arr.length; System.out.println(arr[i++]))
            ;
    }

    public static void TimMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }
        System.out.printf("max: %d, min: %d\n", max, min);
    }

    public static boolean CheckPrime(int x) {
        for (int i = 3; i < (int) Math.sqrt(x); i += 2)
            if (x % i == 0)
                return false;
        return true;
    }

    public static int[] SapXepMang(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void TimSoNguyenTo(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < arr.length; ++i)
            if (CheckPrime(arr[i]))
                a.add(arr[i]);

        for (int x : a)
            System.out.println(x);

    }

    public static void TimeKiemNhiPhan(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length, x = left + (left + right) / 2;
        while (arr[x] != k) {
            x = left + (left + right) / 2;
            if (arr[x] > k)
                right = x;
            else if (arr[x] < k)
                left = x;
            else {
                System.out.println("Tim thay k");
                return;
            }
        }
        System.out.println("Khong tim thay k");

    }

    public static boolean MangDoiXung(int[] arr) {
        for (int i = 0; i < arr.length / 2; ++i)
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
