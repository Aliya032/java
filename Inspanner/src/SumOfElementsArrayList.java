import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
create an arraylist of type integer and find the sum of the elements.
 */
public class SumOfElementsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> alint = new ArrayList<Integer>(4);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <4; i++) {
            System.out.println("Enter the " + i + " number: ");
            int input = sc.nextInt();
            alint.add(input);
        }
        int sum = 0;
        for (int i :alint) {
            sum += i;
        }
        System.out.println("Sum of the ArrayList: "+ alint  + " is: "+ sum);
        int sum2 = 0;
        for (int i = 0; i< alint.size(); i++) {
            sum2 += alint.get(i);
        }
        System.out.println("Sum using get method on the arraylist: "+ alint + " is: "+ sum2);
    }
}
