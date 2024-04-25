package Demo;

import java.util.ArrayList;
import java.util.Scanner;

import Chuong3.Person;
import Chuong3.StandardStr;

public class Demo {
    public static void Test1() {
        StandardStr a = new StandardStr("          twwd    twewe      asdasdf        asdf          ");
        a.formatStr();
        a.print();
    }

    public static void Test2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Person> p = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            System.out.print("Nhap ho ten nguoi dung: ");
            p.add(new Person(sc.nextLine()));
        }
        System.out.println("Danh sach nguoi: ");
        for (Person a : p)
            a.print();

        System.out.print("Nhap ho: ");
        int res = 0;
        String ho = sc.nextLine();
        for (Person pp : p) {
            String[] x = pp.getName().split(" ");
            if (ho.equals(x[0]))
                ++res;
        }

        System.out.printf("So nguoi co ho %s: %d", ho, res);
        sc.close();
    }

    public static void main(String[] args) {

    }
}
