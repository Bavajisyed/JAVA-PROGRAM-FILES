
    import java.util.*;

class Student {
    int id, marks;
    String name;
    double attendance;

    Student(int id, String name, double attendance, int marks) {
        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.marks = marks;
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + (marks >= 50 ? "PASS" : "FAIL"));
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Attendance: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(id, name, attendance, marks);
        s.display();
    }
}

