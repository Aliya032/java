public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int units = number % 10;
            sum += units;
            number /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }
}
