public class InterfaceExample {
    public static void main(String[] args) {
        Abc ob1 = new Def();
        ob1.display();
    }
}

interface Abc {
    void display();
}

 class Def implements Abc {
    public void display() {
        System.out.println("Interface example.");
        System.out.println("Methods are be default abstract in interface");
    }
}

