//check if a number is perfect number.
//perfect number -> sum of the factors is equal to original number.
public class PerfectNumberForLoop7 {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 1; i<num; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Given number is a perfect number, as the sum "+ sum + " is equal to the number " + num + " itself.");
        } else {
            System.out.println("Not a perfect number as the sum "+ sum + " is not equal to the number " + num + " itself.");
        }
    }
}
