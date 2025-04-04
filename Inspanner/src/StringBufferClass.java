public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Java");

        System.out.println("At first: "+ s1);

        //append method
        s1.append(" Language");
        System.out.println("After appending: "+s1);

        //insert method
        s1.insert(4, " Programming ");
        System.out.println("After inserting: "+s1);

        StringBuffer s2 = new StringBuffer("Computer");
        System.out.println("New string s2: "+ s2);

        //reverse method
        System.out.println("After reversing string s2: " + s2.reverse());
    }
}
