package Bai4_BT1;

import java.util.ArrayList;

public class Demo1 {

    public static int randInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static String randMaterial() {
        ArrayList<String> material = new ArrayList<>();
        material.add("wood");
        material.add("glass");
        material.add("iron");
        material.add("plastic");
        material.add("rubber");
        return material.get(randInt(0, material.size()));
    }

    public static String randShape() {
        ArrayList<String> shapes = new ArrayList<>();
        shapes.add("rectangle");
        shapes.add("circle");
        shapes.add("triangle");
        shapes.add("octagon");

        return shapes.get(randInt(0, shapes.size()));
    }

    public static String randString() {
        return String.format("%d", randInt(0, 199999999));
    }

    public static int findByMaterial(ArrayList<Furniture> furnitures, String material) {
        for (int i = 0; i < furnitures.size(); ++i)
            if (furnitures.get(i).getMaterial().equals(material))
                return i;
        return -1;
    }

    public static int findByPrice(ArrayList<Furniture> furnitures, double price) {
        for (int i = 0; i < furnitures.size(); ++i)
            if (furnitures.get(i).getPrice() == price)
                return i;
        return -1;
    }

    public static int findByNumOfLegs(ArrayList<Furniture> furnitures, int legs) {
        for (int i = 0; i < furnitures.size(); ++i) {
            if (furnitures.get(i) instanceof Table)
                continue;
            Chair x = (Chair) furnitures.get(i);
            if (x.getNumOfLegs() == legs)
                return i;
        }
        return -1;
    }

    public static int findByShape(ArrayList<Furniture> furnitures, String shape) {
        for (int i = 0; i < furnitures.size(); ++i) {
            if (furnitures.get(i) instanceof Chair)
                continue;
            Table x = (Table) furnitures.get(i);
            if (x.getShape() == shape)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Furniture> furnitures = new ArrayList<>();
        for (int i = 0; i < 100; ++i) {
            int j = randInt(0, 1);
            switch (j) {
                case 0:
                    furnitures.add(new Chair(randMaterial(), randInt(0, 10000), randInt(1, 5)));
                    break;
                case 1:
                    furnitures.add(new Table(randMaterial(), randInt(0, 10000), randShape()));
                    break;
            }
        }
        for (int i = 0; i < furnitures.size(); ++i)
            furnitures.get(i).in();
    }
}
