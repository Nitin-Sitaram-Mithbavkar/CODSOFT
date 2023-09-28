import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Student Grade Calculator");
        System.out.println("---------------------");
        int OutOfMarks = 500;
        int HighestOf1Subject = 100;
        int numberOfSubjects = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained for Maths.");
        int Maths = sc.nextInt();
        System.out.println("Enter marks obtained for Chemistry.");
        int Chemistry = sc.nextInt();
        System.out.println("Enter marks obtained for Physics.");
        int Physics = sc.nextInt();
        System.out.println("Enter marks obtained for English.");
        int English = sc.nextInt();
        System.out.println("Enter marks obtained for Biology.");
        int Biology = sc.nextInt();
        if (Maths < 0 || Maths > 100 || Chemistry < 0 || Chemistry > 100 || Physics < 0 || Physics > 100 || English < 0 || English > 100 || Biology < 0 || Biology > 100) {
            System.out.println("Invalid Value");
            return;
        }
        int totalMarks = Maths + Chemistry + Physics + English + Biology;
        int averagePercentage = totalMarks / 5;
        String grade = "";
        if (averagePercentage <=32) grade = "F";
        else if (averagePercentage <= 40) grade = "D";
        else if(averagePercentage <= 60) grade = "C";
        else if(averagePercentage <= 80) grade = "B";
        else if (averagePercentage <= 100) {
            grade = "A";
        }
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + averagePercentage);
        System.out.println("Grade = " + grade);
    }
}
