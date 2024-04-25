package Chuong3;

import java.util.Scanner;

public class StandardStr {
    private String str;

    private static String capitalize(String x) {
        String[] aa = x.split(" ");
        StringBuffer res = new StringBuffer();
        for (String string : aa) {
            if (string.length() == 0)
                continue;
            res.append(Character.toUpperCase(string.charAt(0)));
            res.append(string.substring(1) + " ");
        }

        return res.toString();
    }

    public StandardStr() {
        Scanner sc = new Scanner(System.in);
        this(sc.nextLine());
        sc.close();
    }

    public StandardStr(String str) {
        this.str = str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void formatStr() {
        this.str = StandardStr.capitalize(this.str.strip());
    }

    public int countSpecialChar() {
        int res = 0;
        for (int i = 0; i < str.length(); ++i) {
            char a = this.str.charAt(i);
            if (Character.isAlphabetic(a) && Character.isDigit(a))
                continue;
            ++res;
        }
        return res;
    }

    public int CountT() {
        int res = 0;
        String[] aa = this.str.split(" ");
        for (String x : aa)
            if (x.charAt(0) == 'T')
                ++res;
        return res;
    }

    public int countWord(String word) {
        int res = 0;
        String[] aa = this.str.split(" ");
        for (String x : aa)
            if (x.equals(word))
                ++res;
        return res;
    }

    public void toUpper() {
        this.str = this.str.toUpperCase();
    }

    public void toLower() {
        this.str = this.str.toLowerCase();
    }

    public void print() {
        System.out.println(this.str);
    }
}
