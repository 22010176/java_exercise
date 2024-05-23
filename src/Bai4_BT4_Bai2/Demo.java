package Bai4_BT4_Bai2;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            int x = randInt(0, 3);
            switch (x) {
                case 0:
                    objects.add(12);
                    break;
                case 1:
                    objects.add("F");
                    break;
                case 2:
                    objects.add(12.34);
                    break;
                case 3:
                    objects.add(23.444);
            }
        }
        for (Object a : objects) {
            if (a instanceof Double) {
                System.out.print("La so thuc double");
            } else if (a instanceof String) {
                System.out.print("La string");
            } else if (a instanceof Integer) {
                System.out.print("La so nguyen int");
            } else if (a instanceof Float) {
                System.out.print("La so thuc float");
            }
            System.out.println(" " + a);
        }
    }
}
