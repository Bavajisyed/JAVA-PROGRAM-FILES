import java.util.Scanner;

class MNCCandidateInformationRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Enter skills: ");
        String skills = sc.nextLine();

        System.out.print("Enter interview status: ");
        String status = sc.nextLine();

        System.out.println("Candidate Details");
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Skills: " + skills);
        System.out.println("Interview Status: " + status);

        System.out.print("Enter skill to search: ");
        String search = sc.nextLine();

        if (skills.toLowerCase().contains(search.toLowerCase()))
            System.out.println("Candidate Found");
        else
            System.out.println("Skill Not Found");

        sc.close();
    }
}