import java.io.*;
import java.util.*;

class HashMapDemo11
{
    public static void main(String args[]) throws IOException
    {
        //create HashMap
        HashMap<String, Long> hm=new HashMap<String,Long>();

        //variables
        String name,str;
        Long phone;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //menu
        while(true)
        {
            System.out.println("1. Enter phone entries");
            System.out.println("2. Lookup in the book");
            System.out.println("3. Display names in book");
            System.out.println("4.Exit:");

            System.out.println("Your choice:");
            int n=Integer.parseInt(br.readLine());

            switch(n)
            {
                case 1: System.out.println("Enter name:");
                    name=br.readLine();
                    System.out.println("Enter phone no:");
                    str=br.readLine();
                    phone=new Long(str);
                    //store name and phone into HashMap
                    hm.put(name,phone);
                    break;

                case 2: System.out.println("Enter name to search:");
                    name=br.readLine();
                    name=name.trim(); //remove unnecessary spaces
                    //pass name and get phone
                    phone=hm.get(name);
                    System.out.println("phone: " +phone);
                    break;
                case 3: //use  keySet() to display the names
                    //create HashSet object to store names and refer it by Set reference

                    Set<String> set=new HashSet<String>();
                    set=hm.keySet();
                    System.out.println(set);
                    break;

                case 4: return;
            }

        }
    }
}