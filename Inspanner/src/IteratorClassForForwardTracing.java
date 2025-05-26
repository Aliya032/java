import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClassForForwardTracing {
    public static void main(String[] args) {
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Brinkley Reynolds");
        strArrayList.add("Gerogia Reynolds");
        strArrayList.add("Cage Reynolds");
        strArrayList.add("Hugh Reynolds");
        strArrayList.add("Finn Reynolds");
        Iterator<String> itr = strArrayList.iterator();
        System.out.println("Printing using Iterator class: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("Normally printing");
        System.out.println(strArrayList);
    }
}
