/*
not working
 */
public class AnonymousExample {

    int a;
    int b;
    int c;
    int d;
    void Addition(int p, int q)
    {
        a = p;
        b = q;
        int ab = a + b;
        System.out.println("Addition of a and b:" +ab);
    }
    void addition(int x, int y ) {
        c = x;
        d = y;
        int cd = c + d;
        System.out.println("addition of c and d:" +cd);
    }
    public static void main(String[] args) {
//        new Addition(2,2).addition(1, 5)
//        {
//
//
//        }
//        new Addition(4,10).addition(5, 15);
    }
}
