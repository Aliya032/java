/*
- create a for loop using a range of numbers from 1-1000 inclusive
- sum all the numbers that can be divided by both 3 and 5.
- print out all the numbers that have met the above conditions.
- break out of the loop once you have found 5 numbers that met the conditions above
- after breaking out of the loop, print the sum of the numbers that met the conditions above.
 */
public class SumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i<=1000 ; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("numbers divisible by both 3 and 5 are: " + i);
                sum +=i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum: "+sum);

    }
}
