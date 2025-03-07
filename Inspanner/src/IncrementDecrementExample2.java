public class IncrementDecrementExample2 {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        c = ++a+(++a)+a+++b+++(++b)+a++;
        System.out.println(a + " " + b + " " + c);
    }
}
