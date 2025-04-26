import java.util.*;

public class Delivery_switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy chọn loại hàng hóa bạn muốn vận chuyển (Sách, Điện thoại, Mỹ phẩm): ");

        String loaihang = scanner.nextLine();

        switch (loaihang) {
            case "Sách":
                System.out.println("Thời gian giao hàng là 2 ngày");
                break;
            case "Điện thoại":
                System.out.println("Thời gian giao hàng là 3 ngày");
                break;
            case "Mỹ phẩm":
                System.out.println("Thời gian giao hàng là 4 ngày");
                break;
            default:
                System.out.println("Loại hàng này không hỗ trợ vận chuyển");
                break;
        }
        scanner.close();
    }
}
