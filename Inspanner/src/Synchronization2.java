public class Synchronization2 {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);
        t1.start();
        t2.start();
    }
}

class Table2 {
    synchronized void prinTable(int n) {
        for (int i = 1; i<=5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread3 extends Thread {
    Table t;
    MyThread3(Table t) {
        this.t = t;
    }
    public void run() {
        t.prinTable(5);
    }
}

class MyThread4 extends Thread {
    Table t;
    MyThread4(Table t) {
        this.t = t;
    }
    public void run() {
        t.prinTable(100);
    }
}