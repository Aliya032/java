import java.util.Scanner;

//read 3 subject marks and check whether total is greater than 250 its pass otherwise failed
public class GreaterThan250 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Subject 1 marks: ");
        int sub1 = myobj.nextInt();
        System.out.println("Subject 2 marks: ");
        int sub2 = myobj.nextInt();
        System.out.println("Subject 3 marks: ");
        int sub3 = myobj.nextInt();
        int totalMarks = sub1 + sub2 + sub3;
        if ( totalMarks > 250 ) {
            System.out.println("You passed! Your marks are: " + totalMarks);
        } else {
            System.out.println("You failed, your marks are: " + totalMarks);
        }
    }
}
