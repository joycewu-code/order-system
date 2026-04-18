import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入數量: ");
        int quantity = sc.nextInt();

        System.out.print("請輸入單價: ");
        int price = sc.nextInt();

        // 建立訂單物件
        Order order = new Order(quantity, price);

        // 呼叫服務
        OrderService service = new OrderService();

        try {
            int total = service.calculateTotal(order);
            System.out.println("總金額：" + total);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
