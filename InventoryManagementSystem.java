import java.util.Scanner;

class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        if (price < 0 || quantity <= 0 ||
            discount < 0 || discount > 100) {
            System.out.println("Invalid input");
        } else {
            double total = price * quantity;
            double discountAmount = total * discount / 100;
            double taxableAmount = total - discountAmount;
            double gst = taxableAmount * 0.18;
            double bill = taxableAmount + gst;

            System.out.println("Product: " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: Rs." + total);
            System.out.println("Discount: Rs." + discountAmount);
            System.out.println("GST (18%): Rs." + gst);
            System.out.println("Final Bill: Rs." + bill);
            System.out.println("Remaining Stock: 0");
        }

        sc.close();
    }
}
