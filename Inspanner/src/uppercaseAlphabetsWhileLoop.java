//upper case ASCII code lies between 65-90
public class uppercaseAlphabetsWhileLoop {
    public static void main(String[] args) {
        char mychar = 'A';
        while (mychar <= 90) {
            int asciiValue = mychar;
            System.out.println(mychar + "-" + asciiValue);
            mychar++;
        }
    }
}
