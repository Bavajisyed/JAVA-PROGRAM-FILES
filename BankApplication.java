import java.util.Scanner;

public class BankApplication {

    static Scanner sc = new Scanner(System.in);

    static long accountNumber;
    static String customerName;
    static double balance;

    // entry() method
    public static void entry() {
        System.out.println("===== ACCOUNT CREATION =====");

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLong();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("\nAccount Created Successfully!");
    }

    // deposit() method
    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
            System.out.println("Updated Balance: " + balance);
        } 
    }

    // withdraw() method
    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // returnBalance() method
    public static void returnBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    // exit() method
    public static void exit() {
        System.out.println("Thank you for using Bank Account Management System.");
       
    }

    public static void main(String[] args) {

        entry();

        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    returnBalance();
                    break;

                case 4:
                    exit();
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}