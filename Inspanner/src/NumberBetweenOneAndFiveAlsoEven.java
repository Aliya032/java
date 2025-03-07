//check if a number is greater than 1 and less than 5 and also an even number
public class NumberBetweenOneAndFiveAlsoEven {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(((num > 1 && num < 5) && num % 2 == 0) ? "Lies within range and is even": "Doesn't lie in range neither is even");
    }
}
