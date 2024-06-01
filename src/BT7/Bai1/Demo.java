package BT7.Bai1;

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

    public static Student GenStudent() {
        return new Student(randString(10), randString(10));
    }

    public static Teacher GenTeacher() {
        return new Teacher(randString(10), randString(10));
    }

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            persons.add(randInt(0, 1) == 0 ? GenStudent() : GenTeacher());
        }
        for (Person p : persons)
            System.out.println(p.toString());
    }
}
