import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector vc = new Vector<>();
        vc.add(34);
        vc.add(756);
        vc.add("Adam Levie");
        vc.add(78.90);
        vc.add(true);
        vc.add("Andrew");

        //using list iterator.
        ListIterator itr = vc.listIterator();
        System.out.println("In forward direction: ");
        while(itr.hasNext()) {
            System.out.println(itr.next()+ "\t");
        }
        System.out.println("In reverse direction: ");
        while(itr.hasPrevious()) {
            System.out.println(itr.previous()+ "\t");
        }
        //using enumeratin
        System.out.println("_____________________-");
        System.out.println("Printing using enumeration");
        Enumeration en = vc.elements();
        while (en.hasMoreElements()) {
            Object value = en.nextElement();
            System.out.println(value);
        }
    }
}
