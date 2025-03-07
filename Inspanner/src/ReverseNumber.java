public class ReverseNumber {
    public static void main (String[] args) {
        int num = 123;
        int ones = num%10;
        int tens = ((num/10)%10);
        int hundreds = num/100;
        int answer = ones*100 + tens*10 + hundreds;
        System.out.println(answer);
    }
}
