package Bai4_BT4_Bai1;

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
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            int x = randInt(0, 3);
            switch (x) {
                case 0:
                    animals.add(new Cat(randString(10), "black", randInt(0, 20), randInt(0, 25)));
                    break;
                case 1:
                    animals.add(new Duck(randString(10), randInt(0, 100)));
                    break;
                case 2:
                    animals.add(new Mouse(randString(10), randInt(0, 100)));
                    break;
                case 3:
                    animals.add(new RobotCat(randString(10), "black", randInt(0, 20), randInt(0, 25), randInt(0, 100)));
            }
        }
        for (Animal a : animals) {
            if (a instanceof Cat) {
                System.out.println("La meo");
            } else if (a instanceof RobotCat) {
                System.out.println("La robot cat");
            } else if (a instanceof Mouse) {
                System.out.println("La chuot");
            } else if (a instanceof Duck) {
                System.out.println("La vit");
            }
            a.talk();
        }
    }

    private static void randString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'randString'");
    }
}
