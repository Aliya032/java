import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        enterNumbers();
    }
    public static void enterNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String firstInput = sc.nextLine();
        double firstNumber = Double.parseDouble(firstInput);
        double max = firstNumber;
        double min = firstNumber;
        do {
            System.out.println("Enter number: ");
            try {
                String otherInputs = sc.nextLine();
                double nextNumber = Double.parseDouble(otherInputs);
                if (nextNumber > max) {
                    max = nextNumber;
                }
                if (nextNumber < min) {
                    min = nextNumber;
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered a character.");
                break;
            }
        } while (true);
        System.out.println("min: "+ min);
        System.out.println("max "+max);
    }

}
