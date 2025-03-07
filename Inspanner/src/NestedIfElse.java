import java.util.Scanner;

//12th > 60, ug > 660 -> role1; 12th > 60, ug < 60 -> role2; 12th < 60 -> role3
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter 12th score: ");
        int twelfthScore = myobj.nextInt();
        System.out.println("Enter UG score: ");
        int ugScore = myobj.nextInt();
        if (twelfthScore > 60) {
            if (ugScore > 60) {
                System.out.println("You are offered Role 1");
            } else {
                System.out.println("You are offered Role 2");
            }
        } else {
            System.out.println("You are offered Role 3");
        }
    }
}
