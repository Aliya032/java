import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        sumOfFiveIntegers();
    }
    public static void sumOfFiveIntegers() {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #"+ counter + ":");
            String nextNumber = sc.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum +=number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
        }
        System.out.println("The sum of the 5 numbers: " + sum);
    };
}
