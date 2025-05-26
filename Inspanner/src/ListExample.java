import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

class ListExample
{
    public static void main(String args[]) throws IOException
    {
        //Create an empty linked list to store strings
        LinkedList<String> ll=new LinkedList<String>();

        //Add some names to linked list
        ll.add("America");
        ll.add("India");
        ll.add("Japan");

        //display the elements in the linked list
        System.out.println("List = " + ll);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position,choice=0;

        while(choice<4)
        {
            System.out.println("LINKED LIST OPERATIONS \n ");
            System.out.println("1. Add an element ");
            System.out.println("2. Remove an element ");
            System.out.println("3. Replace an element ");
            System.out.println("4. Exit ");

            System.out.println("Enter your choice: ? ");
            choice=Integer.parseInt(br.readLine());

            switch(choice)
            {
                case 1:
                    System.out.println("Enter an element: ");
                    element =br.readLine();
                    System.out.println("At what position ? ");
                    position = Integer.parseInt(br.readLine());
                    ll.add(position-1,element);
                    break;

                case 2:
                    System.out.println("Enter position: ");
                    position=Integer.parseInt(br.readLine());
                    ll.remove(position-1);
                    break;

                case 3:
                    System.out.println("Enter position");
                    position=Integer.parseInt(br.readLine());
                    System.out.println("Enter new element: ");
                    element = br.readLine();
                    ll.set(position-1,element);
                    break;

                default: return;
            }
            //Use iterator to retrieve the elements
            System.out.println("List = ");
            Iterator it=ll.iterator();
            while(it.hasNext())
                System.out.println(it.next() + " ");
        }  //while loop
    }  // main()
}
