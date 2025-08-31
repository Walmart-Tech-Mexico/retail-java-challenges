import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DiscountService {
    public DoubleStream applyDiscount(List<Product> product) {
        return product.stream().mapToDouble(p->
                p.hasDiscount() && p.getQuantity()>=3?p.getTotalPrice()*0.9:p.getTotalPrice());
    }
}
