public class AbstractClass2 {
    public static void main(String[] args) {
        childClassExample2 childObj = new childClassExample2();
        childObj.add();
        childObj.display();
        childClassExample2.count();
    }

}

abstract class example2 {
    static int count = 0; //static variable
    int a,b;//instance variable

    void One(int x, int y) { //constructor
        a = x;
        b = y;
        count+= 1;
        System.out.println("Hello");
    }

    abstract void display(); //abstract method

    static void count() { //static method
        System.out.println(count);
    }

    void add() { //concrete method add
        System.out.println(a+b);
    }

}

class childClassExample2 extends example2 {
    void Two(int a, int d) {
//        super(a,d);
    }
    void display() {
        System.out.println("Display method prints hiii");
    }
}


