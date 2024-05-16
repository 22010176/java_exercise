package buoi_5;

public class Product {
    private String code;
    private String name;
    private String description;
    private double price;
    private String unit;
    private int stock;

    public Product(String code, String name, String description, double price, String unit, int stock) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.unit = unit;
        this.stock = stock;
    }

    public double calculatePrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Unit: " + unit);
        System.out.println("Stock: " + stock);
    }
}