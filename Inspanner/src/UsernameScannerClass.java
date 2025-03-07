import java.util.Scanner;
public class UsernameScannerClass {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myName.nextLine();
        System.out.println("Username is: " + userName);
    }
}
