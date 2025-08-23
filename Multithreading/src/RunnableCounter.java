public class RunnableCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter();
        Thread thread = new Thread(counter);
        thread.start();
    }
}

