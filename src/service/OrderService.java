public class OrderService {

    public int calculateTotal(Order order) {
        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException("數量不可為0");
        }

        if (order.getPrice() <= 0) {
            throw new IllegalArgumentException("單價不可為0");
        }

        return order.getQuantity() * order.getPrice();
    }
}
