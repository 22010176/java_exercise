package buoi_5;

// import buoi_5.ql_hang_hoa_trong_kho.ElectronicProduct;
// import buoi_5.ql_hang_hoa_trong_kho.FoodProduct;
// import buoi_5.ql_hang_hoa_trong_kho.Warehouse;

public class demo_qlhh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        // Warehouse warehouse = new Warehouse();

        // Add food products
        FoodProduct fp1 = new FoodProduct("F001", "Apple", "Fresh red apples", 0.5, "kg", 100, "2023-05-01",
                "2024-05-01");
        FoodProduct fp2 = new FoodProduct("F002", "Banana", "Ripe bananas", 0.3, "kg", 200, "2023-04-15", "2024-04-15");
        warehouse.addFoodProduct(fp1);
        warehouse.addFoodProduct(fp2);

        // Add electronic products
        ElectronicProduct ep1 = new ElectronicProduct("E001", "Laptop", "Gaming laptop", 1200, "pcs", 10, "Dell", 24);
        ElectronicProduct ep2 = new ElectronicProduct("E002", "Smartphone", "Latest model smartphone", 800, "pcs", 50,
                "Samsung", 12);
        warehouse.addElectronicProduct(ep1);
        warehouse.addElectronicProduct(ep2);

        // Print inventory
        warehouse.printInventory();

        // Count products
        warehouse.countProducts();
    }

}
