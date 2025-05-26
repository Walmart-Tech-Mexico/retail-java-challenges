public class DiscountService {
    public double applyDiscount(Product product) {
        if (product.hasDiscount() && product.getQuantity() >= 3) {
            return product.getTotalPrice() * 0.9; // 10% descuento
        }
        return product.getTotalPrice();
    }
}
