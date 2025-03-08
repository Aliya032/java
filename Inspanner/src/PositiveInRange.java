import java.util.Scanner;
//check if a number is positive -> if it lies between 1-5
// negative -> if it lies between -1 to -5
public class PositiveInRange {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = newobj.nextInt();
        if (num > 0) {
            if (num >= 1 && num <= 5) {
                System.out.println("Number is positive and lies in the range 1 to 5");
            } else {
                System.out.println("Number is positive but doesn't lie in the range 1 to 5");
            }
        } else {
            if (num <= -1 && num >= -5) {
                System.out.println("Number is negative and lies in the range -1 to -5");
            } else {
                System.out.println("Number is negative and doesn't lie in the range -1 to -5 ");
            }
        }
    }
}
