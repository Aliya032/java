//find sum of even numbers 1-20 using while loop
public class sumOfEvenNumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=20) {
            if (i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers between 1-20 is: " + sum);
    }
}
