import java.util.Scanner;

public class MaleOrFemale {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter gender (F or M)");
        char mychar = myobj.next().charAt(0);
        switch (mychar) {
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            default:
                System.out.println("Enter valid character F or M");
        }
    }
}
