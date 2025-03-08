import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = myobj.nextInt();
        switch (num%2) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}
