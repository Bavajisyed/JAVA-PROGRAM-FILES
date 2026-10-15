import java.util.Scanner;

class AttendanceManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total classes: ");
        int total = sc.nextInt();

        System.out.print("Attended classes: ");
        int attended = sc.nextInt();

        double p = attended * 100.0 / total;
        System.out.println("Attendance: " + p + "%");

        if (p < 75)
            System.out.println("Low Attendance");
        else
            System.out.println("Good Attendance");

        sc.close();
    }
}