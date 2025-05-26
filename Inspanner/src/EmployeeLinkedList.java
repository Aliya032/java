import java.util.LinkedList;

/* create a linked list of type Employee(empid,empname) and print the contents using for loop*/
class InspannerEmployee {
    int empid;
    String empname;
    public InspannerEmployee(int empid, String empname){
        this.empid = empid;
        this.empname = empname;
    }
}
public class EmployeeLinkedList {
    public static void main(String[] args) {
        LinkedList<InspannerEmployee> empll = new LinkedList<>();
        InspannerEmployee insp = new InspannerEmployee(23,"Sai Rani Durjati");
        empll.add(insp);
        empll.add(new InspannerEmployee(34, "Preeti"));
        empll.add(new InspannerEmployee(44, "Kranti"));

        //printing normally:
        System.out.println("Printing normally: ");
        System.out.println("LinkedList: "+ empll);

        //printing using for each loop
        System.out.println("Printing using for each loop");
        for (InspannerEmployee i: empll){
            System.out.println(i.empid + " "+ i.empname);
        }

        //printing using for loop
        System.out.println("Printing using for loop: ");
        int size = empll.size();
        for (int i=0; i<size; i++){
            System.out.println("Name: "+ empll.get(i).empname + " | Emp Id: " + empll.get(i).empid);
        }
    }
}
