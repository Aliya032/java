//check number is positive negative or zero using simple if
public class PostiveNegativeZero {
    public static void main(String input[]) {
        int num = Integer.parseInt(input[0]);
        if (num > 0) {
            System.out.println("Positive");
        }
        if (num < 0) {
            System.out.println("Negative");
        }
        if (num == 0) {
            System.out.println("zero");
        }
    }
}
