/*
Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.A
 */
public class AbstractMethodExample {
    public static void main(String[] args) {
        Person ob1 = new Athlete();
        Person ob2 = new LazyPerson();
        System.out.println("Athlete habits: ");
        ob1.eat();
        ob1.exercise();
        System.out.println("Lazy Person habits: ");
        ob2.eat();
        ob2.exercise();
    }
}

abstract class Person{
     abstract void eat();
     abstract void exercise();
}

class Athlete extends Person{
    public void eat() {
        System.out.println("He eats veggies.");
    }
    public void exercise() {
        System.out.println("He exercises a lot.");
    }
}

class LazyPerson extends Person {
    public void eat() {
        System.out.println("He doesn't eat his diet well.");
    }
    public void exercise() {
        System.out.println("He doesn't exercise.");
    }
}
