public class AbstractClassesExample { //main class
    public static void main(String[] args) {
        Two twoObj = new Two(); //object creation
        twoObj.details("Mahesh",2001); //calling the methods
        twoObj.display(); //calling the methods
    }
}

abstract class One { //abstract class
    int id; //instance variables
    String name; //instance variables
    abstract void display(); //abstract method
    void details(String name, int id) { //regular or concrete method
        this.id = id;
        this.name = name;
    }
}

class Two extends One { //child class
    void display(){ //abstract method definition
        System.out.println(name + " "+ id);
    }
}