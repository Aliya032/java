import java.util.ArrayList;
import java.util.List;
public class AddAllEx
{
    public static void main(String[] args)
    {
// Create a list1 of only String type. This means that Compiler will give errors if we try to put any elements other than String type.
        List<String> al = new ArrayList<String>();
        al.add("A");
        al.add("M");
        al.add("O");
        al.add("G");
        System.out.println("List1 contain: " +al);

// Create another List2 of String type.
        List<String> al2 = new ArrayList<String>();
        al2.add("11");
        al2.add("12");
        al2.add("13");
        System.out.println("List2 contain :-"+al2);

// Adding List2 in List1 at 2nd position(i.e index=2) using addAll() method.
        al.addAll(2, al2);
        System.out.println("List1 after adding List2 at 2nd position :-"+al);
    }
}