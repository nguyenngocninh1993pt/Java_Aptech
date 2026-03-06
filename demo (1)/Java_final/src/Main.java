import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Nhap vao ID: ");
        p.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap Name: ");
        p.setName(sc.nextLine());

        System.out.print("Nhap vao Thumbnail path: ");
        p.setThumbnail(sc.nextLine());

        System.out.print("Nhap vao Price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Nhap vao Quantity: ");
        p.setQty(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap vao Description: ");
        p.setDescription(sc.nextLine());

        System.out.println("\n Hien thi thong tin san pham:");
        p.displayInfo();

        System.out.print("\n Nhap vao order quantity: ");
        int orderQty = sc.nextInt();

        if(p.checkAvailability(orderQty)){
            double total = p.placeOrder(orderQty);
            System.out.println("Order thanh cong!");
            System.out.println("Tong so tien: " + total);
        }else{
            System.out.println("Hang trong kho khong du");
        }
    }
}