import java.util.Scanner;

class OnlineExaminationManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Java is a programming language?",
            "2 + 3 = 5?",
            "HTML is used for web pages?"
        };

        String[] answers = {"yes", "yes", "yes"};

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter yes or no: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(answers[i]))
                score++;
        }

        System.out.println("Student: " + name);
        System.out.println("Total Marks: " + score +
            "/" + questions.length);

        if (score >= 2)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        sc.close();
    }
}