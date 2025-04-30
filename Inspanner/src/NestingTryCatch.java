public class NestingTryCatch {
    public static void main(String[] args) {
        try {
            int a = 22;
            try {
                String s = "hello";
                int i = Integer.parseInt(s);
                System.out.println(i);
            }
            catch(NumberFormatException e) {
                System.out.println("String not allowed");
                System.out.println(e);
            }
            int c = a/0;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by zero");
            System.out.println(e);
        }
    }
}
