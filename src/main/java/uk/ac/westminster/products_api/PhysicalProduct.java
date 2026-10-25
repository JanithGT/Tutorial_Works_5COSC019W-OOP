package uk.ac.westminster.products_api;

public class PhysicalProduct  extends Product{

    private double weightKg;
    private String dimensions;

    // (a) No-arg constructor for Jackson
    public PhysicalProduct() {
    }

    // (b) Full constructor passing common fields to Product
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price); // Delegates id, name, price to Product
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c) Getters & Setters
    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

}
