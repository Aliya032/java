//to check a number lies in the range of 1 to 20 read the number using cmd line
public class NumberLiesBetweenOneTwentyCmdArguments {
    public static void main(String input[]) {
        int num = Integer.parseInt(input[0]);
        if (num >= 1 && num <= 20) {
            System.out.println("Lies in the range");
        } else {
            System.out.println("Doesn't lie in the range");
        }
    }
}
