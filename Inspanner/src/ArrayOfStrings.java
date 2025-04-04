import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i<names.length; i++) {
            System.out.println("Enter the student name: ");
            names[i] = myobj.nextLine();
        }
        for (int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
