//using logical operator to check if a number is divisible by both 7 and 11
public class DivisibeBySevenAndEleven {
    public static void main(String[] args) {
        int num = 76;
        System.out.println((num%7 == 0 && num % 11 == 0) ? "Divisible by both 7 and 11" : "Not divisible by both 7 and 11");
    }
}
