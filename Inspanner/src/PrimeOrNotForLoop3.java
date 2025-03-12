//check if a number is prime or not.
//prime numbers are numbers who have only two factors.
//eg 3-> 1, 3
//eg 5 -> 1,5
public class PrimeOrNotForLoop3 {
    public static void main(String[] args) {
        int num = 23;
        int count = 0;
        for (int a = 1; a <= num; a++) {
            if (num%a == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Given number is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
