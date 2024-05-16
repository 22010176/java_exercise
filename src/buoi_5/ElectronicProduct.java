package buoi_5;

public class ElectronicProduct extends Product {
    private String manufacturer;
    private int warranty;

    public ElectronicProduct(String code, String name, String description, double price, String unit, int stock,
            String manufacturer, int warranty) {
        super(code, name, description, price, unit, stock);
        this.manufacturer = manufacturer;
        this.warranty = warranty;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warranty + " months");
    }
}
