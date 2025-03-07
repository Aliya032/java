//java program to check character is upper case or not read values using Scanner lcass
//- upper case ASCII code lies between 65-90
// - lower case ASCII code lies between 97 to 122
import java.util.Scanner;
public class CharacterUppercaseScannerClass {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = myobj.next().charAt(0);
        if (character>= 65 && character <= 90 ) {
            System.out.println("uppercase");
        } else {
            System.out.println("lowercaseA");
        }
    }
}
