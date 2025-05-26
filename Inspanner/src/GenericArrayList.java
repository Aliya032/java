import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        BufferedReader br = null;
        ArrayList abc = new ArrayList();
            abc.add("Brinkely Reynolds");
            abc.add("Madox Lancaster");
            abc.add("Fin Reynolds");
            abc.add(2.34);
            abc.add(33);
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<4; i++) {
            System.out.println("Enter the value:");
            abc.add(sc.nextLine());
        }
        System.out.println("The whole array list elements: ");
        for(Object i: abc){
            System.out.println(i);
        }
        System.out.println("The arraylist: "+ abc);

    }
}
