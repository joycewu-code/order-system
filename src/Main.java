import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入數量: ");
        int quantity = sc.nextInt();

        System.out.print("請輸入單價: ");
        int price = sc.nextInt();

        if (price <= 0) {
            System.out.println("單價不可為0");
            return;
        }

        int total = quantity * price;
        System.out.println("總金額：" + total);
    }
}
