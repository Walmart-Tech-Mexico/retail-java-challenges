public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean hasDiscount;

    public Product(String name, double price, int quantity, boolean hasDiscount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.hasDiscount = hasDiscount;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
