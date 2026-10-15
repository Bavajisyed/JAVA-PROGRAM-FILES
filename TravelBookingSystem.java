
import java.util.Scanner;

class TravelBookingSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("1. Goa - Rs.5000");
        System.out.println("2. Ooty - Rs.4000");
        System.out.println("3. Kerala - Rs.6000");

        System.out.print("Choose package: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();

        if (persons <= 0) {
            System.out.println("Invalid number of persons");
        } else {
            String place = "";
            int price = 0;

            switch (choice) {
                case 1:
                    place = "Goa";
                    price = 5000;
                    break;
                case 2:
                    place = "Ooty";
                    price = 4000;
                    break;
                case 3:
                    place = "Kerala";
                    price = 6000;
                    break;
                default:
                    System.out.println("Invalid package");
            }

            if (price > 0) {
                System.out.println("Customer: " + name);
                System.out.println("Destination: " + place);
                System.out.println("Total Amount: Rs." +
                    (price * persons));
                System.out.println("Booking Status: Confirmed");
                System.out.println("Payment Status: Pending");
            }
        }

        sc.close();
    }
}