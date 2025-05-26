public class Main {
    public static void main(String[] args) {

        //Car class
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setConvertible(true);
        System.out.println("make: "+ car.getMake());
        System.out.println("model: "+ car.getModel());
        car.describeCar();
        System.out.println("------------------");

        //Bank account;
        //BankAccount bank = new BankAccount(); //constructor without arguments is called.

       // BankAccount bobsAccount = new BankAccount("12345", 500, "Bob Brown", "myemailid@bob.com","(087) 123-4567" );
        BankAccount bobsAccount = new BankAccount();
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail", "5677");
        System.out.println("Account number: "+ timsAccount.getAccountNumber() + "; name: "+ timsAccount.getCustomerName());
        /*
        bank.deposit(1000);
        bank.withdrawl(500);
        bank.withdrawl(500);
        bank.withdrawl(500);

         */

        //Simple Calculator
        System.out.println("----------------");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = "+ calculator.getSubstractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = "+ calculator.getMultiplicationResult());
        System.out.println("divide = "+ calculator.getDivisionResult());
        System.out.println("----------------");
        PersonClassAndAgeValidation person = new PersonClassAndAgeValidation();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = "+ person.getFullName());
        System.out.println("teen = "+ person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("ful name = "+ person.getFullName());
        System.out.println("teen = "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name = "+ person.getFullName());

    }
}
