import java.util.Scanner;

public class GreatestAmongThreeIfElseIf {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = myobj.nextInt();
        System.out.println("Enter number 2");
        int num2 = myobj.nextInt();
        System.out.println("Enter number 3");
        int num3 = myobj.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1: " + num1 + " is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2: " + num2 + " is greatest");
        } else {
            System.out.println("Number 3: " + num3 + " is greatest");
        }
    }
}
