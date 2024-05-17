package Bai3_BT1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static ArrayList<Employee> employees = Manager.employees;

    public static Employee nhap(Scanner sc) {
        String ten, ho, ngaySinh;
        int namlv;
        double luong;

        System.out.print("Nhap ho:");
        ho = sc.nextLine();
        sc.next();

        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        sc.next();

        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        sc.next();

        System.out.print("Nhap nam bat dau lam viec: ");
        namlv = sc.nextInt();
        sc.next();

        System.out.print("Nhap luong thang: ");
        luong = sc.nextDouble();
        sc.next();

        return new Employee(ten, ho, ngaySinh, luong, namlv);
    }

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

    public static String randNgaySinh() {
        return String.format("%d/%d/%d", randInt(1, 29), randInt(1, 13), randInt(1950, 2005));
    }

    public int timNV(Employee ee) {
        for (int i = 0; i < employees.size(); ++i)
            if (ee.getId() == employees.get(i).getId())
                return i;
        return -1;
    }

    public int timNV(int id) {
        for (int i = 0; i < employees.size(); ++i)
            if (id == employees.get(i).getId())
                return i;
        return -1;
    }

    public void themNV(Employee e) {
        if (timNV(e) == -1)
            employees.add(e);
        Employee temp = new Employee(e.getTen(), e.getHo(), e.getNgaySinh(), e.getLuong(), e.getNamCongTac());
        employees.add(temp);
    }

    public void suaNV(Employee e) {
        xoaNV(e.getId());
        employees.remove(timNV(e));
        themNV(e);
    }

    public void xoaNV(int id) {
        employees.remove(timNV(id));
    }

    static public int getTuoiNhanVien(Employee emp) {
        return Integer.parseInt(emp.getNgaySinh().split("/")[2]);
    }

    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; ++i)
            employees.add(new Employee(randString(5) + " " + randString(5), randString(5),
                    randNgaySinh(),
                    randInt(0, 1000),
                    randInt(2000, 2020)));

        for (int i = 0; i < n; ++i)
            Manager.employees.add(new Employee(randString(5) + " " + randString(5), randString(5),
                    randNgaySinh(),
                    randInt(0, 1000),
                    randInt(2000, 2020)));

        employees.get(11).in();
        Manager.employees.get(11).in();
        Manager m = new Manager();
        for (int i = 0; i < Manager.maxNV; ++i)
            m.addEE(employees.get(randInt(0, n)));
        System.out.println(m.toString());

        Manager d = new Manager();
        for (int i = 0; i < Manager.maxNV; ++i) {
            int index = randInt(0, n);
            if (m.search(employees.get(index)) == -1)
                continue;
            d.addEE(employees.get(index));
        }
        System.out.println(m.toString());

        for (int i = 0; i < employees.size(); ++i) {
            if (getTuoiNhanVien(employees.get(i)) < 60)
                continue;

            m.removeNV(employees.get(i).getId());
            employees.remove(i);
        }
    }
}
