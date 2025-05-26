import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSynchronizedListMethod {
    public static void main(String[] args) {

        //non synchronized arraylist object.
        ArrayList<String> al = new ArrayList<>();
        al.add("Finn");
        al.add("Cage");
        al.add("Gerogia");
        al.add("Brinkley");

        //synchronizing ArrayList in java
        List<String> synlist = Collections.synchronizedList(al);

        //here we will use a synchronized block to avoid the non deterministic behavior
        synchronized (synlist) {
            //calling iterator method to iterate the arraylist.
            Iterator<String> itr = synlist.iterator();
            while(itr.hasNext()) {
                String str = itr.next();
                System.out.println(str);
            }
        }
    }
}
