public class AbstractClassWithoutMethod {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();

    }
}
 abstract class Base {
    void fun() {
        System.out.println("Abstract Class without abstract method");
    }
}
 class Derived extends Base {

}
