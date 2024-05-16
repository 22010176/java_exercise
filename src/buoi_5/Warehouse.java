package buoi_5;

import java.util.ArrayList;

public class Warehouse {
    private ArrayList<FoodProduct> foodProducts;
    private ArrayList<ElectronicProduct> electronicProducts;
    private ArrayList<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
        this.foodProducts = new ArrayList<>();
        this.electronicProducts = new ArrayList<>();
    }

    public void addFoodProduct(FoodProduct fp2) {
        this.products.add(fp2);
        foodProducts.add(fp2);
    }

    public void addElectronicProduct(ElectronicProduct ep1) {
        this.products.add(ep1);
        electronicProducts.add(ep1);
    }

    public void printInventory() {
        System.out.println("Food Products in Warehouse:");
        for (Product p : this.products) {
            p.printInfo();
            System.out.println();
        }
    }

    public void countProducts() {
        System.out.println("Number of Food Products: " + foodProducts.size());
        System.out.println("Number of Electronic Products: " +
                electronicProducts.size());
    }
}
