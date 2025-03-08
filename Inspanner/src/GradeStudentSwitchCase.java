import java.util.Scanner;

public class GradeStudentSwitchCase {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Grade");
        int score = myobj.nextInt();
        switch (score/10) {
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
            default:
                System.out.println("Failed");
        }
    }
}
