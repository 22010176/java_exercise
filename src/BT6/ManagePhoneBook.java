package BT6;

import java.util.Scanner;

public class ManagePhoneBook {
    static Scanner sc = new Scanner(System.in);
    static String p = "QUAN LY DANH BA DIEN THOAI - PHONEBOOK MANAGEMENT\n"
            + "1. Insert Phone\n"
            + "2. Remove Phone\n"
            + "3. Update Phone\n"
            + "4. Search Phone\n"
            + "5. Sort\n"
            + "6. Quit\n";

    public static void main(String[] args) {
        PhoneBook a = new PhoneBook();
        boolean running = true;
        do {
            System.out.println(p);
            System.out.print("Nhap lua chon cua ban: ");
            int x = sc.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap sdt: ");
                    String sdt = sc.nextLine();
                    a.insertPhone(ten, sdt);
                }
                case 2 -> {
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();
                    a.removePhone(ten);
                }
                case 3 -> {
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap sdt: ");
                    String sdt = sc.nextLine();
                    a.updatePhone(ten, sdt);
                }
                case 4 -> {
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.println(a.searchPhone(ten));
                }
                case 5 -> {
                    a.sort();
                    for (String b : a.getPhoneList().keySet()) {
                        System.out.println(b);
                        System.out.println(a.searchPhone(b));
                    }
                }
                case 6 -> running = false;
            }
        } while (running);
    }
}
