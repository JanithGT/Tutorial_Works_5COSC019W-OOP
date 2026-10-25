package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    // (a) Empty no-arg constructor — needed by Jackson to deserialize incoming JSON
    public DigitalProduct() {
    }

    // (b) Full constructor
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the very first line
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // (c) Subclass-specific getters
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}