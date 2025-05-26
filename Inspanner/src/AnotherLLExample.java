import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AnotherLLExample {
    public static void main(String[] args)
    {
        List<StudentNew> li = new LinkedList<>();

        li.add(new StudentNew("anil",34));
        li.add(new StudentNew("Ajay",33));
        li.add(new StudentNew("Aj",30));
        li.add(new StudentNew("Arun",20));
        ListIterator<StudentNew> itr =  li.listIterator();

        System.out.println("In actual order :");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("In reverse order :");
        while (itr.hasPrevious())
        {
            System.out.println(""+itr.previous());
        }

    }
}
class StudentNew
{

    String name;
    int roll;

    StudentNew(String name,int roll)
    {
        this.name=name;
        this.roll=roll;

    }

    public String toString()
    {
        return name+" "+roll;
    }
}