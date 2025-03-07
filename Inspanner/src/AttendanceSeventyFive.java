import java.util.Scanner;

//allowed to sit if his attendance is 75%
// from user collect number of classes held, no of classes attended, print percentage of class attended, allowed to sit or not
public class AttendanceSeventyFive {
    public static void main(String[] args) {
        Scanner newobj = new Scanner(System.in);
        System.out.println("How many classes held? ");
        double heldClasses = newobj.nextInt();
        System.out.println("How many classes attended? ");
        double attendedClasses = newobj.nextInt();
        double percentage =  ((attendedClasses/heldClasses) * 100);
        System.out.println("percentage: "+ percentage);
//        System.out.println(percentage);
        if (percentage >= 75) {
            System.out.println("allowed to sit");
        } else {
            System.out.println("not allowed");
        }
    }
}
