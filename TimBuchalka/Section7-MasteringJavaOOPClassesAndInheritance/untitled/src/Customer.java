
/*1. create a new class, called Customer with three fields:
        - name
    - credit limit
    - email address
2. create the getter methods only for each field. (no need for setters)
  3. create three constructors for this class:
        - first, create a constructor for all three fields which should assign the arguments directly to the instance fields.
    - second, create a no args constructor that call another constructor, passing some literal values for each argument.
        - lastly create a constructor with just the name, and email parameters which calls another constructor
 */
public class Customer {
    private String name;
    private double creditLImit;
    private String email;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");
    }
    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer(String name, double creditLImit, String email) {
        this.name = name;
        this.creditLImit = creditLImit;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public double getCreditLImit() {
        return creditLImit;
    }

    public String getEmail() {
        return email;
    }
}
