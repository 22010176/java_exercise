package ThuaKeVaDaHinh;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        for (int i = 0; i < 100; i++) {
            if (Math.floor(Math.random() * 3) % 3 == 0)
                shapes.add(HinhChuNhat.GenShape());
            else if (Math.floor(Math.random() * 3) % 3 == 1)
                shapes.add(HinhTron.GenShape());
            else if (Math.floor(Math.random() * 3) % 3 == 2)
                shapes.add(HinhVuong.GenShape());
        }
        for (int i = 0; i < shapes.size(); ++i) {

            System.out.print(shapes.get(i).getThongTin());

        }
    }
}
