import java.util.Scanner;

public class GradeStudentIfElseIf {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter score: ");
        int marks = myobj.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade A");
        } else if (marks>= 70 && marks <80){
            System.out.println("Grade B");
        } else if (marks >= 60 && marks <70) {
            System.out.println("Grade C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade D");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("Failed");
        } else {
            System.out.println("Enter valid score between 0-100");
        }
    }
}
