import java.util.Scanner;

public class GreatestAmongTwoSwitch {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = myobj.nextInt();
        System.out.println("Enter number 2");
        int num2 = myobj.nextInt();
        int ans = num1 > num2 ? 1:0;
        switch (ans) {
            case 1:
                System.out.println("Num 1: " + num1 + " is greater.");
                break;
            case 0:
                System.out.println("Num 2: " + num2 + " is greater. ");
        }
    }
}
