//print all lowercase alphabets using while loop
//lower case ASCII code lies between 97-122
public class lowercaseAlphabetsWhileLoop {
    public static void main(String[] args) {
        char mychar = 'a';
        while (mychar <= 122) {
            System.out.println(mychar);
            mychar++;
        }
    }
}
