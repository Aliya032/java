import java.util.Scanner;

public class InteractiveSummationAndAverageCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        int loopCount = 0;
        while (true) {
//            System.out.println("Enter a number or any character to exit: ");
            String nextEntry = sc.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                count++;
                sum += validNum;
                average = Math.round(sum / count);
                loopCount++;
            }catch (NumberFormatException e) {
                break;
            }

        }
        if (loopCount >= 0) {
            System.out.println("SUM = "+ sum + " AVG = "+ average);
        } else {
            System.out.println("No valid data entered.");
        }
    }
}
