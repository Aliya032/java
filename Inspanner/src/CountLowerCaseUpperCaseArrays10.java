import java.util.Scanner;
//- upper case ASCII code lies between 65-90
//- lower case ASCII code lies between 97-122
//keep count of uppercase and lowercase letters in an array of type char and size 10
public class CountLowerCaseUpperCaseArrays10 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        char[] charArray = new char[10];
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (int i = 0; i<charArray.length; i++) {
            System.out.println("Enter the character: ");
            charArray[i] = myobj.next().charAt(0);
            if (charArray[i] >= 65 && charArray[i]<=90) {
                uppercaseCount++;
            } else if (charArray[i] >= 97 && charArray[i]<=122){
                lowercaseCount++;
            } else {
                System.out.println("Incorrect value");
            }

        }
        System.out.println("uppercase count: "+ uppercaseCount);
        System.out.println("Lowercase count: "+ lowercaseCount);
    }
}
