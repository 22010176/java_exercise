package Bai4_BT2;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
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

    public static int randInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static String randString() {
        return String.format("%d", randInt(0, 199999999));
    }

    public static String randNgaySinh() {
        return String.format("%d/%d/%d", randInt(1, 29), randInt(1, 13), randInt(1950, 2005));
    }

    public int search(ArrayList<Employee> teams, Employee ee) {
        for (int i = 0; i < teams.size(); ++i)
            if (ee.getId() == teams.get(i).getId())
                return i;
        return -1;
    }

    static public int getTuoiNhanVien(Employee emp) {
        return Integer.parseInt(emp.getNgaySinh().split("/")[2]);
    }

    public static void main(String[] args) {
        int n = 5000;
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            employees.add(new Employee(randString() + " " + randString(), randString(), randNgaySinh(),
                    randInt(0, 1000),
                    randInt(2000, 2020)));

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
