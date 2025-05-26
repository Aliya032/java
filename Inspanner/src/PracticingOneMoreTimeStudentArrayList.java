import java.util.ArrayList;

class Employee {
    int id;
    String employee_name;
    double salary;
    Employee(int id, String employee_name, double salary) {
        this.id = id;
        this.employee_name = employee_name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public double getSalary() {
        return salary;
    }
}
public class PracticingOneMoreTimeStudentArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> emal = new ArrayList<>();
        Employee emp1 = new Employee(12, "Madhuri", 12000.75);
        emal.add(emp1);
    }
}
