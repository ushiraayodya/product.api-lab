package uk.ac.westminster.product.api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;


    public PhysicalProduct() {
    }


    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price); // First line must be super(id, name, price)[cite: 12]
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }


    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
