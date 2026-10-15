
    import java.time.LocalDate;
import java.util.Scanner;

class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter birth year: ");
        int y = sc.nextInt();

        System.out.print("Enter birth month: ");
        int m = sc.nextInt();

        System.out.print("Enter birth day: ");
        int d = sc.nextInt();

        LocalDate dob = LocalDate.of(y, m, d);
        System.out.println("Name: " + name);
        System.out.println("Age: " +
            (LocalDate.now().getYear() - y));
        System.out.println("Born on: " + dob.getDayOfWeek());

        sc.close();
    }

}
