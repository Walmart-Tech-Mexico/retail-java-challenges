import java.util.List;

public class Cart {
    private List<Product> products;
    private DiscountService discountService;

    public Cart(List<Product> products, DiscountService discountService) {
        this.products = products;
        this.discountService = discountService;
    }

    public double calculateTotal() {
        return products.stream()
            .mapToDouble(p -> discountService.applyDiscount(p))
            .sum();
    }
}
