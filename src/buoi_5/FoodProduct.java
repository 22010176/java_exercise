package buoi_5;

public class FoodProduct extends Product {
    private String manufactureDate;
    private String expiryDate;

    public FoodProduct(String code, String name, String description, double price, String unit, int stock,
            String manufactureDate, String expiryDate) {
        super(code, name, description, price, unit, stock);
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
