import java.util.Scanner;

/*
program to create an array of strings (10 names) and print only those strings which start with g
 */
public class PrintSpecificElementsFromStringArray {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i<names.length; i++) {
            System.out.println("Enter the student name: ");
            names[i] = myobj.nextLine();
        }
        for (int i = 0; i<names.length; i++) {
            if (names[i].charAt(0) == 'g' || names[i].charAt(0) == 'G') {
                System.out.println(names[i]);
            }
        }
    }
}

