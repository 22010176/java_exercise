package Chuong3;

public class Demo {
    public static void main(String[] args) {
        Time a = new Time(23, 4, 5, FormatType._12);
        a.print();
        Time b = new Time(13, 4, 5, FormatType._24);
        b.print();
    }
}
