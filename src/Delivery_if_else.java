import java.util.*;
public class Delivery_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy chọn loại hàng hóa bạn muốn vận chuyển (Sách, Điện thoại, Mỹ phẩm): ");

        String loaihang = scanner.nextLine();

        if (loaihang.equals("Sách")) {
            System.out.println("thời gian giao hàng là 2 ngày");
        }else if (loaihang.equals("Điện thoại")){
            System.out.println("thời gian giao hàng là 3 ngày");
        }else if (loaihang.equals("Mỹ phẩm")) {
            System.out.println("thời gian giao hàng là 4 ngày");
        }else{
            System.out.println("loại hàng này không hỗ trợ vận chuyển");
        }
        scanner.close();
    }
}