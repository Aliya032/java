import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
public static void inputThenPrintSumAndAverage() {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    long avg = 0;
    while (true) {
        boolean hasNextInt = sc.hasNextInt();
        if (!hasNextInt){
            break;
        }
        sum += sc.nextInt();
        count++;
        sc.nextLine();
    }
    if (count >0) {
        avg = Math.round((double) sum /count);
    }
    System.out.println("SUM = "+ sum + " AVG = "+ avg);
    sc.close();
}
}
