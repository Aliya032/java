import java.util.Scanner;

//a shop will give discount of 10% if the cost of purchased quantity is more than 1000. ask user for quantity
//suppose one unit will cost 100 judge and print total cost
public class DiscountScanner {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter quantity of items: ");
        int quantity = myobj.nextInt();
        int totalAmount = quantity*100;
        System.out.println("Total amount: " + totalAmount);
        if (totalAmount > 1000) {
            int tenPercent = (totalAmount/10);
            totalAmount -= tenPercent;
            System.out.println("Ten percent: "+tenPercent);
            System.out.println("Final amount: " + totalAmount);
        } else {
            System.out.println("Final amount: " + totalAmount);
        }
    }
}
