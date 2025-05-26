import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Brinkley Reynolds");
        strArrayList.add("Gerogia Reynolds");
        strArrayList.add("Cage Reynolds");
        strArrayList.add("Hugh Reynolds");
        strArrayList.add("Finn Reynolds");
        ListIterator<String> itr = strArrayList.listIterator();
        System.out.println("Printing using ListInterface (using hasNext()): ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("Printing using ListInterface (using hasPrevious()): ");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        System.out.println();
        System.out.println("Normally printing");
        System.out.println(strArrayList);
    }
}
