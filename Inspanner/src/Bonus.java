import java.util.Scanner;

//a company decides to give bonus of 5% to employee if his/her year of service is more than 5 years. ask user for their salary and years of service print net bonus amount
public class Bonus {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter years of experience: ");
        int yearsOfExperience = myobj.nextInt();
        System.out.println("Enter salary: ");
        double salary = myobj.nextDouble();
        System.out.println("salary: " + salary);
        if (yearsOfExperience >= 5) {
            double fivePercent = (salary*5)/100;
            System.out.println("fivePercent "+ fivePercent);
            salary += fivePercent;
            System.out.println("Net salary: " + salary);
        } else {
            System.out.println("Final salary: " + salary);
        }
    }
}
