package BT6;

import java.util.*;

public class Demo {
    ArrayList<MoveableCircle> circles = new ArrayList<>();

    static public MoveableCircle nhap(Scanner sc, MovablePoint p) {
        System.out.println("Nhap ban kinh: ");
        int x = sc.nextInt();
        return new MoveableCircle(p.getX(), p.getySpeed(), p.getxSpeed(), p.getySpeed(), x);
    }

    public static void main(String[] args) {

    }
}
