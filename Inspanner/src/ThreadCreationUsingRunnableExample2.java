public class ThreadCreationUsingRunnableExample2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " thread is running.");
    }

    public static void main(String[] args) {
        ThreadCreationUsingRunnableExample2 threadObj1 = new ThreadCreationUsingRunnableExample2();
        ThreadCreationUsingRunnableExample2 threadObj2 = new ThreadCreationUsingRunnableExample2();
        Thread t1 = new Thread(threadObj1, "Soumya");
        Thread t2 = new Thread(threadObj2, "Mark");
        t1.start();
        t2.start();

    }
}
