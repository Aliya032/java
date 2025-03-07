import java.util.Scanner;
public class NageAgeSalary {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.println("enter name, age and salary");
        String name = newObj.nextLine();
        int age = newObj.nextInt();
        double salary = newObj.nextDouble();
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }
}
