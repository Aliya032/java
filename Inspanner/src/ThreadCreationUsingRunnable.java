public class ThreadCreationUsingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadCreationUsingRunnable threadObj1 = new ThreadCreationUsingRunnable();
        ThreadCreationUsingRunnable threadObj2 = new ThreadCreationUsingRunnable();

        Thread t1 = new Thread(threadObj1);
        Thread t2 = new Thread(threadObj2);
        t1.start();
        t2.start();
    }
}
