import java.util.ArrayList;
import java.util.List;

public class OrderService {

    public int calculateTotal(Order order) {
        List<String> errors = new ArrayList<>(); // 建一個錯誤清單

        if (order.getQuantity() <= 0) {
            errors.add("數量不可為0");
        }

        if (order.getPrice() <= 0) {
            errors.add("單價不可為0");
        }

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("，", errors));
        }

        return order.getQuantity() * order.getPrice();
    }
}
