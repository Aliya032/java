import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int a = scObj.nextInt();
        double b = scObj.nextDouble();
        float f = scObj.nextFloat();
        char ch = scObj.next().charAt(0);
        String c = scObj.next();
        System.out.println("Interger: " + a);
        System.out.println("Float: "+f);
        System.out.println("Dobule: " + b);
        System.out.println("Char At: " + ch);
        System.out.println("String: " + c);
    }
}
