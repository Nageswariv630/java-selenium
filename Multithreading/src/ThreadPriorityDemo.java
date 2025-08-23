public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 running with priority: " + Thread.currentThread().getPriority());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 running with priority: " + Thread.currentThread().getPriority());
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 running with priority: " + Thread.currentThread().getPriority());
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}


