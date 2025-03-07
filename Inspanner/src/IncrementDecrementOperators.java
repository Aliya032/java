public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a, b, c, d, e;
        a = 5;
        b = 6;
        c = ++a;
        d = b++;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + "and d = " + d);
        c = ++b+a+++a--+(++d)-(--a);
        System.out.println(" c =" + c);
        System.out.println("a = " + a + "and d = " + d);
    }
}
