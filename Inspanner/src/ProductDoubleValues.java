//java program to find product of two double values, read the values using scanner class
import java.util.Scanner;
public class ProductDoubleValues {
    public static void main(String[] args) {
        Scanner productObj = new Scanner(System.in);
        System.out.println("Enter first double value: ");
        double num1 = productObj.nextDouble();
        System.out.println("Enter second double value: ");
        double num2 = productObj.nextDouble();
        double product = num1 * num2;
        System.out.println("Product: "+product);
    }
}
